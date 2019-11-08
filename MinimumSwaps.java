import java.util.Scanner;

public class MinimumSwaps {
    public static void main(String[] args) {

        System.out.println("Repeated String...");
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int[] list = new int[n];
        for(int i =0;i<n;i++)
            list[i] = scanner.nextInt();


        System.out.println("Number of a's count is: "+list.length);

    }
    static int arraySum(int[] arr){
        int sum = 0;
        for(int i: arr)
            sum +=arr[i];
        return sum;
    }
}
