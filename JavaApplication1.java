import java.util.Scanner;

/**
 *
 * @author Sherif.ElSherif
 */
public class JavaApplication1 {

    static int pairs=0;
    public static void main(String[] args) {

        System.out.println("Testing...");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        if (len < 1 || len > 100)
            throw new IllegalArgumentException("Invalid arr Length");
        int[] arr = new int[len];
        for(int i =0;i<len;i++)
            arr[i]=scanner.nextInt();
        getPairsCount(arr);
        System.out.println("Pairs Count: "+pairs);

    }
    static void getPairsCount(int[] arr)
    {
        int len = arr.length;
        for(int i=0;i<len;i++)
            for(int j=i+1;j<len;j++)
                if(arr[i] == arr[j] && arr[i] != -1)
                {
                    arr[i]=-1;
                    arr[j] =-1;
                    pairs ++;
                    getPairsCount(arr);
                }
    }
}
