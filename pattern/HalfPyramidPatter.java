import java.util.Scanner;

public class HalfPyramidPatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter how many line you want to print: ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
