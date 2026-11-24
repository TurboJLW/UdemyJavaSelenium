package notepad;

import java.util.Scanner;

public class printStarPyramid {
    public static void main(String[] args){

        // *
        // **
        // ***
        // **
        // *
        Scanner scanner = new Scanner(System.in);
        int maxWidth;
        try {
            maxWidth = scanner.nextInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        for (int i=1;i<=maxWidth;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=maxWidth;i>0;i--){
            for (int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
