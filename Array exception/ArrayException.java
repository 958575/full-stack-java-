package fun1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {

    public String getDuplicateElement() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the size of an array");
            int size = scanner.nextInt();
            if (size <= 0) {
                return "Array size should be positive";
            }

            int[] arr = new int[size];
            System.out.println("Enter the array elements");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println("Enter the position of the element to be replicated");
            int pos = scanner.nextInt();
            if (pos < 0 || pos >= size) {
                return "Array index is out of range";
            }

            int duplicateElement = arr[pos];

            StringBuilder result = new StringBuilder("The array elements are");
            for (int i = 0; i < size; i++) {
                result.append(" ").append(arr[i]);
                if (i == pos) {
                    result.append(" ").append(duplicateElement);
                }
            }
            return result.toString();

        } catch (InputMismatchException e) {
            return "Input was not in the correct format";
        } catch (NegativeArraySizeException e) {
            return "Array size should be positive";
        }
    }

    public static void main(String[] args) {
        ArrayException userInterface = new ArrayException();
        System.out.println(userInterface.getDuplicateElement());
    }
}

	
	
