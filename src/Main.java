import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println(findMin(readElements(readIntegers())));
    }

    // Scanner takes String from console and converts it to an int array.
    private static int readIntegers(String... integers) {

        Scanner sc = new Scanner(System.in);
        System.out.println("choose size of the Array");
        int count = sc.nextInt();
        return count;
    }


    private static int[] readElements(int count) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose random numbers: ");
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("This is the " + i + ". number you can chose.");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
       return array;
    }

    private static int findMin(int[] array) {

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }

        }
        System.out.println("-".repeat(20));
        System.out.print("Smallest number on the List: ");
        return array[0];
    }

}