import java.util.Scanner;

public class GirlBoySwap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s[] = scan.nextLine().split(" ");
        String str = scan.nextLine();
        int val = Integer.parseInt(s[0]);
        int time = Integer.parseInt(s[1]);
        char line[] = new char[val];
        str.getChars(0, val,line, 0);
        for(int i =0; i< time;i++){
            for(int j=0; j< val-1;j++){
                if(line[j]=='B' && line[j+1] == 'G'){
                    line[j]='G';
                    line[j+1]='B';
                    j++;
                }
            }
        }
        System.out.println(new String(line));
    }
}
