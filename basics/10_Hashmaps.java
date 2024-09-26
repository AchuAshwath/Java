import java.util.HashMap;

class Hashmaps {
    public static void main(String[] args) {
        // HashMaps class implements the Map interface

        HashMap<String, Double> ExamScores = new HashMap<String, Double>();
        ExamScores.put("Ashwath", 90.0);
        ExamScores.put("Varna", 85.0);
        ExamScores.put("Anush", 95.0);

        // for each
        ExamScores.forEach((key, value) -> System.out.println(key + " : " + value));    // -> is a lambda expression
        // lambda expression replaces this code
        // ExamScores.forEach(new BiConsumer<String, Double>() {
        //     @Override
        //     public void accept(String key, Double value) {
        //         System.out.println(key + " : " + value);
        //     }
        // });
        
        // printing the hashmap
        System.out.println(ExamScores.toString());  // hashmap is unordered

        // acessing the values
        System.out.println(" Ashwath's score is :"+ExamScores.get("Ashwath"));

        // remove a key-value pair
        ExamScores.remove("Varna");
        System.out.println(ExamScores.toString());

        // adding a new key-value pair if absent
        ExamScores.putIfAbsent("Varna", 100.0);
        System.out.println(ExamScores.toString());

        ExamScores.putIfAbsent("Ashwath", 100.0);  // does not add the key-value pair as the key is already present
        System.out.println(ExamScores.toString());

        // replace a key-value pair
        ExamScores.replace("Anush", 96.0);
        System.out.println(ExamScores.toString());

        // get or default
        System.out.println(ExamScores.getOrDefault("Lanitha", -1.0));

        // check if a key is present
        System.out.println(ExamScores.containsKey("Ashwath"));

        // size of the hashmap
        System.out.println(ExamScores.size());

        // check if the hashmap is empty
        System.out.println(ExamScores.isEmpty());

        // contains value   
        System.out.println(ExamScores.containsValue(96.0));

        // clear the hashmap
        ExamScores.clear();
        System.out.println(ExamScores.toString());



    }
    
}
