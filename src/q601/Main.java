package q601;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        String str = s + s;

        for (int i = 0; i < s.length(); i++) {
            for(int j = s.length()-1 - i, k=0;k<s.length();j++,k++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }

        //이진규풀이
        System.out.println();
        for (int i = 0; i < s.length(); i++) {

            for (int j = s.length() - i - 1; j < s.length(); j++) {
                System.out.print(s.charAt(j));
            }
            for (int j = 0; j < s.length() - i - 1; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }

    //이민욱풀이
        System.out.println();
        for (int i = 0; i < s.length(); i++) {
            char anw = s.charAt(s.length() - 1);
            String name = anw + s.substring(0, s.length() - 1);
            s = name;
            System.out.println(name);
        }


    }
}
