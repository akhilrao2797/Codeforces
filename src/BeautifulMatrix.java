import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i =0, j=0, k =0, fin=0 ;
        while(k<25){
            int val = scan.nextInt();
            if(val==1){
                fin = Math.abs(2 - i)+ Math.abs(2-j);
            }
            if(k%5 == 4){
                i++;
            }
            j++;
            j = j%5;
            k++;
        }
        System.out.println(fin);
    }
}
