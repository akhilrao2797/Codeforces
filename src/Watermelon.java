import java.util.Scanner;

public class Watermelon {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int val = Integer.parseInt(scan.nextLine());
        if(val%2 == 0 && val>2 ){
            int s = val - 2;
            if(s%2==0)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        else
            System.out.println("NO");
    }
}
