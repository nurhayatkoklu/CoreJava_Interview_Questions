package MathQuestions;

public class _01_multiplicationWithoutMultiply {
    public static void main(String[] args) {

        // multiply two numbers without using multiply operator

        System.out.println(multiply(40, 30));
    }

    public static int multiply(int x, int y) {
        int result=0;

        for (int i = 0; i < y; i++) {
            result=result+x;

        }


        return result;
    }


}
