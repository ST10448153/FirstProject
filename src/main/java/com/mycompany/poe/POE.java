/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe;

/**
 *
 * @author RC_Student_lab
 */

public class POE {
    

    public static void main(String[] args) {
       
       String  username = "Tim_";
       String password = "Cs557mole";
       
       if(username.contains("_") && username.length()<5){
           System.out.println("username successfully captured");
       }else{
           System.out.println("username is not correctly formatted,please ensure that your username "
                   + "contains an underscore and the length is no more than 5 characters long.");
       }
       
       ///Are we on Github?
    }
    
}
