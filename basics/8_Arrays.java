import java.util.Arrays;

class ArrayBasic{
    public static void main(String[] args) {
        char vowels[] = new char[5];
        //  char vowels[] = {'a', 'e', 'i', 'o', 'u'};

        vowels[0] = 'a';
        vowels[1] = 'i';
        vowels[2] = 'e';
        vowels[3] = 'o';
        vowels[4] = 'u';
        // vowels[5] = 'y'; 
        // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5 at ArrayBasic.main(8_Arrays.java:12) 

        System.out.println("Vowels are : "+vowels);
        // Vowels are : [C@15db9742
        // This is because the println function only prints the string representation of the object.
        // We should convert the array to a string before printing it.

        System.out.println("Vowels are : "+Arrays.toString(vowels));

        // mutating the array
        vowels[0] = 'A';
        System.out.println("Vowels are : "+Arrays.toString(vowels));

        // length of the array
        System.out.println("Length of the array is : "+vowels.length);

        // sorting the array
        int startingIndex = 1;
        int endingIndex = 4;
        Arrays.sort(vowels, startingIndex, endingIndex);
        System.out.println("Sorted Vowels are : "+Arrays.toString(vowels));

        // binary search  - works only a sorted array
        char searchValue = 'i';
        int foundItemIndex = Arrays.binarySearch(vowels, startingIndex, endingIndex, searchValue);
        System.out.println("Index of "+searchValue+" is : "+foundItemIndex);

        // fill the array with a value
        char fillValue = 'x';
        Arrays.fill(vowels, startingIndex, endingIndex, fillValue); 
        System.out.println("Filled Vowels are : "+Arrays.toString(vowels)); 

        // creating a copy a array
        int numbersArray[] = {1, 2, 3, 4, 5};

        int copyOfNumbersArray[] = numbersArray;    // alias
        int lenghtOfCopyArray = 10;
        int properCopyOfNumbersArray[] = Arrays.copyOf(numbersArray, lenghtOfCopyArray);
        
        // range copy
        int startingIndexForCopy = 1;
        int endingIndexForCopy = 8;
        int rangeCopyOfNumbersArray[] = Arrays.copyOfRange(numbersArray, startingIndexForCopy, endingIndexForCopy);

        Arrays.fill(numbersArray, 0);

        System.out.println("NumbersArray : "+Arrays.toString(numbersArray));
        System.out.println("Copy of numbersArray : "+Arrays.toString(copyOfNumbersArray));
        System.out.println("Proper Copy of numbersArray : "+Arrays.toString(properCopyOfNumbersArray)); // 0 is default value for integers
        System.out.println("Range Copy of numbersArray : "+Arrays.toString(rangeCopyOfNumbersArray));

        // this behaviour is because the Array are a reference type
        // which means it does'nt create a new copy of the array but just a points to the original array

        // compare two arrays
        System.out.println("Are numbersArray and ProperCopyOfNumbersArray equal : "+(numbersArray == properCopyOfNumbersArray));
        System.out.println("Are numbersArray and copyOfNumbersArray equal : "+(numbersArray == copyOfNumbersArray));
        // true because both are pointing to the same array
        System.out.println("Are numbersArray and copyOfNumbersArray equal : "+Arrays.equals(numbersArray, copyOfNumbersArray));

    }

}