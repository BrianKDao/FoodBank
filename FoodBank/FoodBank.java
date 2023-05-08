/****************************************************************************
 * FoodBank
 ****************************************************************************
 * Creates FoodBank objects
 *_____________________________________________________
 * Brian Dao
 * 05/08/2023
 * CMSC-403-SP2023
 ****************************************************************************/
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class FoodBank {

    /**
     * Initializing the instance variable
     */
    private int food;

    // Default constructor, creates a food bank with no food
    public FoodBank(){
        food = 0;

    }

    synchronized public void giveFood(int foodAdded){
        food += foodAdded;
        System.out.println("Producing " + foodAdded + " items of food, the balance is now " + food + " items");
        notify();

    }

    synchronized public void takeFood(int foodTaken) {

        try {
            while (food < foodTaken) {
                System.out.println("Waiting to get food");
                wait();
            }

            food -= foodTaken;
            System.out.println("Taking " + foodTaken + " items of food, the balance is now " + food + " items");

        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }


    }
}
