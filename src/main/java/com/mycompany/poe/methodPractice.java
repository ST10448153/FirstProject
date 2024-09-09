/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author RC_Student_lab
 */
import java.util.Scanner;
public class methodPractice {
    public boolean verify( String email){
        
        if(email.contains("@") && email.endsWith(".com")||email.endsWith(".co.za")  || email.endsWith(".org")){
            System.out.println("Correct email format");
            
        }else{
            System.out.println("Wrong email format");
        }
   
    }
    
    public static void main(String[] args) {
        String email;
         Scanner obj = new Scanner(System.in);
         System.out.println("Enter email: ");
         email = obj.next();
        
         verify(email);
    }
}
