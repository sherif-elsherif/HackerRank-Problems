import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args){

        System.out.println("Array Left Rotation...");
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int n = scanner.nextInt();
        String[] arr_rotated  = leftRotateArray(arr, n);
        for(String s: arr_rotated)
            System.out.print(s + " ");

    }
    static String[] leftRotateArray(String[] arr, int n){
        for(int counter =0 ;counter<n;counter++) {
            String temp = arr[0];
            for (int i = 1; i < arr.length; i++)
                arr[i - 1] = arr[i];
            arr[arr.length - 1] = temp;
        }
        return arr;
    }
}
