package org.example;

import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        System.out.println(isPalindromString());
    }
    public static boolean isPalindromString() {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        //text = text.replaceAll("\\s","");
        //System.out.println(text);
        text = text.toLowerCase();
        System.out.println(text);
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(text);

        String reverse = reverse(text);
        if (text.equals(reverse)) {
            return true;
        }
        return false;
    }

    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
    }

}

