import java.util.Scanner;

public class WordPlay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val = Integer.parseInt(scan.nextLine());
        while(val>0){
            val--;
            String v = scan.nextLine();
            if(v.length()>10){
                int len = v.length() - 2;
                String c = v.charAt(0)+ String.valueOf(len)+v.charAt(len+1);
                System.out.println(c);
            }else{
                System.out.println(v);
            }
        }
    }
}
