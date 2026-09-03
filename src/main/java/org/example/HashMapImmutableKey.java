import java.util.HashMap;


//Record are immutable
//Private, final fields for all your data.
//A Constructor that assigns those fields.
//An equals() method that compares every field.
//A hashCode() method that uses every field.
//A toString() method that prints the data clearly.

//Why this is perfect for HashMap
//Immutability by Default: A Record’s fields are final.
//You cannot change them after the object is created.
//This guarantees the hashCode will never change while the object is in the Map.
//
//Zero Human Error:
//You don't have to worry about forgetting to add a new field to your hashCode logic if you update the class later.
//The compiler handles it automatically.

public class HashMapImmutableKey {

    public record TradeKey(String tradeId, int version) {

        // This is the Compact Constructor
        public TradeKey {
            // 1. Validation Logic
            if (tradeId == null || tradeId.isBlank()) {
                throw new IllegalArgumentException("Trade ID cannot be empty");
            }
            if (version < 0) {
                throw new IllegalArgumentException("Version cannot be negative");
            }
            // No need to write 'this.tradeId = tradeId'
            // The record does the assignment automatically at the end!
        }
    }

    public static void main(String[] args) {

        HashMap<TradeKey, String> tradeMap= new HashMap<>();
        TradeKey tradeKey1 = new TradeKey("MS-101",01);
        TradeKey tradeKey2 = new TradeKey("MS-101",01);

        tradeMap.put(tradeKey1,"BUY 1000 AAPL @ 150.00");
        tradeMap.put(tradeKey2,"BUY 1000 AAPL @ 150.00");

        System.out.println("Trade = " + tradeMap);
        System.out.println("Map size (should be 1): " + tradeMap.size());

        if (tradeKey1.equals(tradeKey2)) {
            System.out.println("These are the SAME trade!"); // This will print
        }

        // Comparison 2: Memory Address (The wrong way)
        //tradeKey2 = tradeKey1;
        if (tradeKey1 == tradeKey2) {
            System.out.println("These are the same object"); // This will NOT print
        }
    }
}
