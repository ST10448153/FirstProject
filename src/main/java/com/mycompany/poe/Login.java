/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;
public class Login {

    

    public static boolean checkPasswordComplexity(String password) {
        boolean checkDigit = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                checkDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }

            
            if (checkDigit && hasUppercase && hasSpecialChar && password.length()>=8) {
                return true;
            }
        }

      
        return false;
    }
    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
        System.out.println("Enter password>>");
        String password = obj.nextLine();

        boolean isValid = checkPasswordComplexity(password);
        System.out.println(isValid);
    }
}

