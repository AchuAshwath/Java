package DSA;

public class Search {
    public static void main(String[] args) {
        long startTime, endTime, elapsedTime;
        int[] array = new int[1000000];
        for( int i = 0; i < 1000000; i++){
            array[i] = i;
        }

        startTime = System.nanoTime();
        System.out.println(linearSearch(array, 499999));
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("time take for linear search  : " + elapsedTime);

        startTime = System.nanoTime();
        System.out.println(binarySearch(array, 499999));
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("time take for binary search  : " + elapsedTime);
        
    }

    public static int linearSearch(int[] array, int value){
        for(int index = 0; index < array.length;  index++){
            if(array[index] == value){
                return index;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int[] array, int value){
        int low = 0;
        int high = array.length-1;

        while(low<= high){
            int middle = low + (high-low) / 2; 
            int middleValue = array[middle];

            if(middleValue < value)low =  middle+1;
            else if(middleValue > high)high = middle-1;
            else return middle;
        }
        return -1;
    }
}
