import java.util.Scanner;

public class Casing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String m = s.nextLine();
        char ma[] = new char[m.length()];
        m.getChars(0, m.length(), ma, 0);
        int k =0;
        for(char i : ma){
            if(Character.isLowerCase(i))
                k++;
        }
        if(k >= m.length()-k)
            System.out.println(m.toLowerCase());
        else
            System.out.println(m.toUpperCase());
    }
}
