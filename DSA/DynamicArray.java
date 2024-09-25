package DSA;

class JavaDynamicArray {
    public static void main(String[] args) {
        // java  -  ArrayList
        // C++  - vector
        // JavaScript - Array
        // Python - List
        
        DynamicArray dynamicArray = new DynamicArray(5);

        System.out.println(dynamicArray);
        System.out.println(dynamicArray.isEmpty());

        System.out.println(dynamicArray.capacity);

        dynamicArray.add("Ashwath");
        dynamicArray.add("Anush");
        dynamicArray.add("Malini");
        System.out.println(dynamicArray);
        System.out.println("size :" + dynamicArray.size);
        System.out.println("capacity :"+dynamicArray.capacity);
        
        dynamicArray.insert(2, "Varna");
        System.out.println(dynamicArray);   
        
        dynamicArray.delete("Malini");
        System.out.println(dynamicArray.toStringCapacity());

        System.out.println(dynamicArray.search("Anush"));

        dynamicArray.add("Nanda");
        dynamicArray.add("Kumar");
        dynamicArray.add("Lanitha");

        System.out.println(dynamicArray.toStringCapacity());

        dynamicArray.delete("Kumar");
        dynamicArray.delete("Ashwath");
        dynamicArray.delete("Varna");
        // dynamicArray.delete("Anush");

        System.out.println(dynamicArray.toStringCapacity());


    }    
}

public class DynamicArray{
    int capacity;
    int size;
    Object[] array;

    DynamicArray(){
        capacity = 10;
        this.array = new Object[capacity];
    }
    DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public boolean isEmpty(){
        return size==0;
    }

    public String toString(){
        String string = "";
        for (int i = 0; i < size; i++){
            string += array[i] + ", ";
        }
        if(string != ""){
            string = "["+ string.substring(0, string.length()-2) +"]";
        }else{
            string = "[]";
        }
        return string;
    }

    public String toStringCapacity(){
        String string = "";
        for (int i = 0; i < capacity; i++){
            string += array[i] + ", ";
        }
        if(string != ""){
            string = "["+ string.substring(0, string.length()-2) +"]";
        }else{
            string = "[]";
        }
        return string;
    }

    public void add(Object data){
        if(size>=capacity){
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data){
        if(size>= capacity){
            grow();
        }
        for(int i = size; i > index; i--){
            array[i] = array[i-1]; 
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data){
        // iterate through array 
        // System.out.println("starting deletion");
        // System.out.println(size);
        for(int i = 0; i < size; i++){
            // System.out.println(i);
            // check if the index matches data
            if(array[i]== data){
                // if, then iterate through all the index after the match index
                // System.out.println("match found at "+i);
                for(int j = 0;i+j<size; j++ ){
                    // replace match index with the next index
                    // System.out.println("replacing "+array[i+j+1]+ " at "+(i+j+1)+ " with "+ array[i+j]+ " at "+(i+j));
                    array[i+j] = array[i+j+1];
                }
                // reduce size
                size--;
                // check for shrink
                if(size <=(int)capacity/3){
                    // shrink                    
                    shrink();
                }
                break;
            }   
        }
    }

    public int search(Object data){
        for(int i = 0; i < size; i++){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }

    private void grow(){
        System.out.println("Grow initiated");
        int newCapacity =(int) capacity *2;
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;

    }
    private void shrink(){
        System.out.println("Shrink initiated");
        int newCapacity =(int) capacity/2;
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
}