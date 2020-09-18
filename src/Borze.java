import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String ans = "";
        for(int i =0; i< s.length();){
            if(s.charAt(i) == '-'){
                if(s.charAt(i+1) == '.'){
                    ans+="1";
                }
                else if(s.charAt(i+1) == '-'){
                    ans+="2";
                }
                i+=2;
            }
            else{
                ans+="0";
                i++;
            }
        }
        System.out.println(ans);
    }
}
