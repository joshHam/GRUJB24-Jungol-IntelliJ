package q150;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[]arr = new String[10];
        for(int i=0;i<10;i++){
            arr[i] = sc.next();

        }
        for(int j=9;j>=0;j--){
            System.out.print(arr[j]+" ");
        }

//        강사풀이
        char[] ar = new char[10];
        for(int i=0; i<ar.length;i++){
            ar[i] = sc.next().charAt(0);
        }

        for(int i=ar.length-1;i>=0;i--){
            System.out.print(ar[i] + " ");
        }


    }
}
