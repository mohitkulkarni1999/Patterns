import java.util.Scanner;

public class Parttern1 {
        public static void main(String[] args) {
//        Scanner a = new Scanner(System.in);
//        int n = a.nextInt();
//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= n) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

            Scanner a = new Scanner(System.in);
            int n = a.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("4");
                }
                System.out.println();
            }
        }
    }


