package javaCodePractice.BasicSorting;

public class selectionsort {
    public static void sort(int number[])
    {
        for(int i=0; i<number.length-1;i++)
        {
            int minpos=i;
            for(int j=i+1; j<number.length;j++)
            {
                if(number[minpos]>number[j])
                {
                    minpos = j;
                }

            }
            int temp= number[minpos];
            number[minpos]=number[i];
            number[i]=temp;
        }
        for(int i=0;i<number.length;i++)
        {
            System.out.print(" "+number[i]);

        }
    }
    public static void main(String[] args) {
        int number[]= {1,2,5,18,6};
        sort(number);


        
    }
}
