import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {
//        Scanner a = new Scanner(System.in);
//        int n = a.nextInt();
//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print(j);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
