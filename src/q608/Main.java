package q608;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
//        System.out.println(S);
        sc.close();

        if(inp.contains("c")==true) {
            System.out.print("Yes ");
        }else{
            System.out.print("No ");
        }
        if(inp.contains("ab")==true) {
           System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        System.out.println("------------------------------------------");


        boolean b = false;
        for(int i=0;i<inp.length();i++){
            if(inp.charAt(i)=='c'){
                b=true;
            }
        }

        if(b==true){
            System.out.print("Yes ");
        }else{
            System.out.print("No ");
        }

        //뭔가 잘못됬는데

        if(inp.indexOf("ab")==-1){
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }
    }
}
















