// *
// **
// ***
// ****
// *****

import java.util.Scanner;

public class printPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter how many line you want to print: ");
        int n= sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
