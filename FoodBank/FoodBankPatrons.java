/****************************************************************************
 * FoodBankPatrons
 ****************************************************************************
 * Runs the threads FoodProducer and FoodConsumer on a FoodBank
 *_____________________________________________________
 * Brian Dao
 * 05/08/2023
 * CMSC-403-SP2023
 ****************************************************************************/

public class FoodBankPatrons {
    public static void main(String[]args){
        FoodBank bank = new FoodBank();
        FoodProducer producer = new FoodProducer(bank);
        FoodConsumer consumer = new FoodConsumer(bank);

        producer.start();
        consumer.start();
    }
}
