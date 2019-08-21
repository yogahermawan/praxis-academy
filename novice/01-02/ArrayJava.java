import java.util.*;
import java.util.Scanner;

public class ArrayJava{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] cinema=new int[4][4];
        System.out.print("Masukan angka : ");
        for(int i=0;i<cinema.length;i++){
            for(int j=0;j<i;j++){
                cinema[i][j]=input.nextInt();
            }   
        }
        System.out.println("Array nya : ");
        for(int i=0;i<=cinema.length;i++){
            for (int j=0;j<i;j++) {
                System.out.print(cinema[i][j] + "\n");
                System.out.println("");
            }
        }
    }
}