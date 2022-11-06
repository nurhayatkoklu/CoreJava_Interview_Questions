package ArrayQuestions;

public class _01_sumOfArray {
    public static void main(String[] args) {

        // Create a method which accepts Array and returns sum of all the elements in the array

        int[] array={22, 88, 56, 35, 46};

        System.out.println(arrayTotal(array));


    }

    public static int arrayTotal(int[] array) {
        int total=0;

        for (int i = 0; i < array.length; i++) {
            total=total+array[i];
        }

        return total;
    }
}
