/****************************************************************************
 * FoodConsumer
 ****************************************************************************
 * Creates FoodConsumer objects
 *_____________________________________________________
 * Brian Dao
 * 05/08/2023
 * CMSC-403-SP2023
 ****************************************************************************/


public class FoodConsumer extends Thread{

    /**
     * Initializing the instance variable
     */
    private FoodBank bank;

    // Parameterized constructor, creates Food Consumer
    public FoodConsumer(FoodBank fb){
        bank = fb;
    }

    @Override
    public void run() {
        while(true) {
            try {
                bank.takeFood((int) (Math.random() * 100) + 1);
                sleep(100);

            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }





}