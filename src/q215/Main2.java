package q215;

import java.util.Scanner;

                                            //박현옥풀이
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Strnum1 = sc.next();
        String Strnum2 = sc.next();
        sc.close();

        int num1 = convertType(Strnum1);
        int num2 = convertType(Strnum2);

        System.out.print(num1 * num2);


    }

    public static int convertType(String str) {
        StringBuilder builder = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                builder.append(c);
            } else {
                break;
            }
        }
        return Integer.parseInt(builder.toString());
    }
}