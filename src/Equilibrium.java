import java.util.Scanner;

public class Equilibrium {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = Integer.parseInt(scan.nextLine());
        int x=0, y=0, z=0;
        for(int i =0; i<cases; i++){
            String s[] = scan.nextLine().split(" ");
            x+=Integer.parseInt(s[0]);
            y+=Integer.parseInt(s[1]);
            z+=Integer.parseInt(s[2]);
        }
        if(x==0 && y==0 && z==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
