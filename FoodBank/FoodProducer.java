/****************************************************************************
 * FoodProducer
 ****************************************************************************
 * Creates FoodProducer objects
 *_____________________________________________________
 * Brian Dao
 * 05/08/2023
 * CMSC-403-SP2023
 ****************************************************************************/


public class FoodProducer extends Thread{

    /**
     * Initializing the instance variable
     */
    private FoodBank bank;

    // Parameterized constructor, creates Food Producer
    public FoodProducer(FoodBank fb){
        bank = fb;
    }

    @Override
    public void run() {
        while(true) {
            try {
                bank.giveFood((int) (Math.random() * 100) + 1);
                sleep(100);

            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }





}
