package string;

import java.util.Scanner;

public class inputInStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc .nextLine());
        sb.setCharAt(1,'e');

        System.out.println(sb);
    }
}
