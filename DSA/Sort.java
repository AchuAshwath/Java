package DSA;

class Sort {
    public static void main(String[] args) {
        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        // bubbleSort(array);
        // selectionSort(array);
        insertionSort(array);
        for( int i : array){
        System.out.println(i);
       }
    }
    // like bubbles floating on top  - lesser values on top
    // O(n^2)   
    public static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length -1; i++){
            for(int j = 0; j < array.length -i -1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    // we select the minimun through out the array and sort it into the array
    // O(n^2)
    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length -1; i++){
            int min = i;
            for(int j = i+1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                    System.out.println("j : "+ j);
                }
            }
           
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
    }
    // compares elements to the left 
    // shifts elements to the right to make room to insert the value
    // iteration starts from index 1
    public static void insertionSort(int[ ] array){
        for(int i = 1; i< array.length; i++) {
            int temp = array[i];
            int j = i-1;
            while(j>=0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            } 
            array[j+1] = temp;
        }

    }    
}

