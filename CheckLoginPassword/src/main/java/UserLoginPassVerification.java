package main.java;

   /*

            Login должен содержать только латинские буквы, цифры и знак подчеркивания.
            Длина login должна быть меньше 20 символов.
            Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
            Password должен содержать только латинские буквы, цифры и знак подчеркивания.
            Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
            Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
         */

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserLoginPassVerification {
    private static final Pattern LOGIN_PATTERN = Pattern.compile("^[a-zA-Z0-9_]{1,19}$");
    private static final Pattern PASS_PATTERN = Pattern.compile("^[a-zA-Z0-9_]{1,19}$");


   /* public static void main(String[] args) {
        checkDataLogin("hjkh", "ktzd6", "ktzd6");
    }
*/

    public static boolean checkDataLogin(String login, String password, String confirmPassword) {
        try {
            Matcher matcherLogin = LOGIN_PATTERN.matcher(login);
            boolean loginIsTrue = matcherLogin.matches();

            if (!loginIsTrue) throw new WrongLoginException("The login is not correct. Please check it.");

            System.out.println("Login is correct");

            Matcher matcherPassword = PASS_PATTERN.matcher(login);
            boolean passwordIsTrue = matcherLogin.matches();

            if (!passwordIsTrue) throw new WrongPasswordException("The password is not correct. Please check it.");

            System.out.println("Password is correct");

            if (!(password.equals(confirmPassword))) throw new WrongPasswordException("Password and confirmPassword are different.");

            System.out.println("Password is confirmed.");

        }
         catch (WrongLoginException | WrongPasswordException e) {
             System.out.println(e.getMessage());
             return false;
         }



            return true;


    }
}