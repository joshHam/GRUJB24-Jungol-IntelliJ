package q609;

import java.util.Scanner;
                        //박현옥코드
public class Main {
    public static void main(String[] args) {
        String[] str = new String[3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < str.length; i ++){
            str[i] = sc.next();
        }
        sc.close();
        String Smallest = str[0];

        for(int i = 0; i < str.length; i++){
            if(str[i].compareTo(Smallest) < 0){
                Smallest = str[i];
            }
        }
        System.out.print(Smallest);
    }
}
