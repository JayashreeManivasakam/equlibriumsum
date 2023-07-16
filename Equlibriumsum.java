import java.util.Scanner;

public class EquilibriumindexofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println(equilibriumValue(array,size));
    }
    public static int equilibriumValue(int[] array,int size)
    {
        int a[] = new int[size];
        a[0] = array[0];

        for(int i=1;i<size;i++)
        {
            a[i] = a[i-1] + array[i];
        }
        for(int i=1;i<size;i++)
        {
            if(a[i-1] == a[size-1]-a[i]){
                return i;
            }
        }
        return -1;
    }
}
