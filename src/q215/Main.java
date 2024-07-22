package q215;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();
//        System.out.println(s1 + " " + s2);


        String a1 = s1.replaceAll("[^0-9]", " ");
        StringTokenizer st = new StringTokenizer(a1);
        int[] nums = new int[st.countTokens()];
        for (int j = 0; j < nums.length; j++) {
            nums[j] = Integer.parseInt(st.nextToken());
        }


        String a2 = s2.replaceAll("[^0-9]", " ");
        StringTokenizer st2 = new StringTokenizer(a2);
        int[] nums2 = new int[st2.countTokens()];
        for (int j = 0; j < nums2.length; j++) {
            nums2[j] = Integer.parseInt(st2.nextToken());
        }


        System.out.println(nums[0] * nums2[0]);

    }
}
