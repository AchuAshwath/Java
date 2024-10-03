package BroJava;
import java.util.*;
class JavaArrayLists {
    public static void main(String args[]){
        // ArrayLists
        // resizable array, elements can be added or removed after compilation phase
        // ArrayList<Type> variable = new ArrayList<Type>();
        int index = 1;
        ArrayList<Integer> ALint = new ArrayList<Integer>();
        ALint.add(5);

        System.out.println(ALint.toString());
        ALint.add(10);

        ALint.add(0, 69);
        System.out.println(ALint.toString());

        ALint.set(2, 69);
        System.out.println(ALint.toString());


        System.out.println(ALint.size());
        System.out.println(ALint.isEmpty());

        System.out.println("value at index 1 is "+ALint.get(index));

        ALint.clear();
        System.out.println(ALint.toString());

        // 2d ArrarList

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();


        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Bun");
        bakeryList.add("Puffs");
        bakeryList.add("crossiant");

        ArrayList<String> produceList = new ArrayList<>();     
        produceList.add("onion");
        produceList.add("tomatoes");
        produceList.add("salt");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("lemon soda");
        drinksList.add("Coffee");

        groceryList.add(bakeryList);
        groceryList.add(1, drinksList);
        groceryList.add(0, produceList);


        System.out.println(groceryList.toString());

        System.out.println(groceryList.get(index).get(index));

    }

}
