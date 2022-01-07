package com.hyperskill.springmvcdemo;

import java.util.Scanner;

public class CheckLoginProblem {

    public static void main(String[] args) {

        /* The scanner object to read data from the standard input */
        Scanner scanner = new Scanner(System.in);

        /* The common pattern for valid logins */
        String loginRegex = "\\s*[a-zA-Z0-9_$]{5,12}\\s*";

        /* The read string which may be a login */
        String mayBeLogin = scanner.nextLine();

        boolean isLogin = mayBeLogin.matches(loginRegex);

        System.out.println(isLogin);
    }
}
