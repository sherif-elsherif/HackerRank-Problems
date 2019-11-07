import java.util.Scanner;

public class CountingValleys {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Counting Valleys...");

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String items = scanner.nextLine();

        int valleys_count = countValleys(items, n);

        System.out.println("Valleys Count is: " + valleys_count);
    }
    static int countValleys(String s, int n)
    {
        int ups=0,downs=0,valleys=0;
        boolean counting_valley = false;
        String[] steps = s.split(" ");
        for (int i =0;i<n;i++)
        {
            if (steps[i].equals("U") && downs == 0) {
                ups++;
                continue;
            }else if(steps[i].equals("U") && counting_valley){
                valleys ++;
                counting_valley = false;
                downs--;
            }
            if (ups > 0) {
                ups--;
                continue;
            } else if(!steps[i].equals("U") && downs==0)
            {
                downs++;
                counting_valley=true;
            }
        }
        return valleys;
    }
}
