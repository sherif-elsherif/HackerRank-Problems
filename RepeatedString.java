import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class RepeatedString {
    static long a_counter = 0, tracker=0;

    public static void main(String[] args) {

        System.out.println("Repeated String...");
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int n = scanner.nextInt();

        long count = repeatedString(line,n);

        System.out.println("Number of a's count is: "+count);

    }
    static long repeatedString(String s, int n){
        double repeat = n%s.length();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a')
                a_counter++;
            if(s.charAt(i) == 'a' && i<=repeat)
                tracker ++;
        }
        return a_counter*n/s.length()+n%s.length()*tracker;
    }
}
