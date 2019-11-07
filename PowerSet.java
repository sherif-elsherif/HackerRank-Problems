import java.nio.channels.SelectableChannel;
import java.util.ArrayList;
import java.util.Scanner;

public class PowerSet {
    public static void main(String[] args){
        ArrayList list = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().split(" ");

        getPowerSet(str);
    }
    static void getPowerSet(String[] chars){
        int subset_count = (int)Math.pow(2,chars.length);


        for (int i =0;i<subset_count;i++){
            System.out.print("{");
            for(int j=0;j<chars.length;j++){
                if((i & (1 << j)) > 0)
                    System.out.print(chars[j]);
            }
            System.out.print("}");
            System.out.println();
        }

    }
}
