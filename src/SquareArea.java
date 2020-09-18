import java.math.BigInteger;
import java.util.Scanner;

public class SquareArea {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String s[] = scan.nextLine().split(" ");
        BigInteger n = new BigInteger(s[0]), m = new BigInteger(s[1]),
                a = new BigInteger(s[2]);
        if(BigInteger.ONE.equals(a))
            System.out.println(n.multiply(m));
        else {
            BigInteger cnt = BigInteger.ZERO;
            BigInteger cnt2 = BigInteger.ZERO;
            BigInteger val1[] = n.divideAndRemainder(a);
            if(!val1[1].equals(BigInteger.ZERO))
                cnt = val1[0].add(BigInteger.ONE);
            else
                cnt = val1[0];

            BigInteger val2[] = m.divideAndRemainder(a);
            if(!val2[1].equals(BigInteger.ZERO))
                cnt2 = val2[0].add(BigInteger.ONE);
            else
                cnt2 = val2[0];
//            while (n.compareTo(BigInteger.ZERO) > 0 && m.compareTo(BigInteger.ZERO) > 0) {
//                cnt = cnt.add(BigInteger.ONE);
//                n = n.subtract(a);
//                cnt2 = cnt2.add(BigInteger.ONE);
//                m = m.subtract(a);
//            }
//
//            while (n.compareTo(BigInteger.ZERO) > 0) {
//                cnt = cnt.add(BigInteger.ONE);
//                n = n.subtract(a);
//            }
//
//            while (m.compareTo(BigInteger.ZERO) > 0) {
//                cnt2 = cnt2.add(BigInteger.ONE);
//                m = m.subtract(a);
//            }
            System.out.println(cnt.multiply(cnt2));
        }
    }
}
