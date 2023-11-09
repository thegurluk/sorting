import java.util.Arrays;
import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number for number of elements of the array:");
        int number= input.nextInt();
        int[] list=new int[number];
        for(int i=0;i<number;i++){
            System.out.print("number"+(i+1)+":");
            list[i]=input.nextInt();

        }
        Arrays.sort(list);

        for (int i:list){
            System.out.print(i+" ");
        }
    }
}
