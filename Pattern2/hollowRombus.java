import java.util.Scanner;

public class hollowRombus {
    public static void hollowrum(int n){
        for(int i=1; i<=n; i++){
            for(int k=1;k<=(n-i);k++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        hollowrum(a);
    }
    
}
