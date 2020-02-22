/**
 * @author Ilya Vinnikov all rights reserved ©
 */
public class Main {
    public static void main(String[] args) {
        byte v_byte = 120;
        short v_short = 129;
        char v_char = 'a';
        int v_int = 65999;
        long v_long = 4294967295L;
        float v_float = 0.33333334f;
        double v_double = 0.3333333333333333;
        boolean v_boolean = true;

        System.out.println("This is a byte: " + v_byte + "\n" + "This is a short: " + v_short + "\n"
                + "This is a char: " + v_char + "\n" + "This is a int: " + v_int + "\n" + "This is a long: " + v_long
                + "\n" + "This is a float: " + v_float + "\n" + "This is a double: " + v_double + "\n"
                + "This is a boolean: " + v_boolean + "\n");

        // Exercise 2

        for (byte i = 0; i < 26; i++) {
            System.out.print((char) (v_char + i) + " ");
        }
        System.out.println("\n");

        // Exercise 3

        long begin = new java.util.Date().getTime();
        int i = 0;

        while (i < 10000000)
            i++;

        long end = new java.util.Date().getTime();
        System.out.println(end - begin + "\n");

        // Exercise 4

        int[] mas = { 12, 43, 12, -65, 778, 123, 32, 76 };
        int max = mas[1];
        for (i = 1; i < mas.length; i++) {
            if (max < mas[i])
                max = mas[i];
        }
        System.out.println("Max value in array: " + max + "\n");

        // Exercise 5

        int matrix[][] = new int[3][3];
        for (i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * 10);
            }
        }

        for (i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println();

        for (i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}