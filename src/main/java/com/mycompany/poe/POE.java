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
       String password = "";
       
       if(username.contains("_") && username.length()<5){
           System.out.println("username successfully captured");
       }else{
           System.out.println("username is not correctly formatted,please ensure that your username "
                   + "contains an underscore and the length is no more than 5 characters long.");
       }
       
       //this method returns a string charcter in a particular position
      /* char results = hello.charAt(17);
       System.out.println(results);*/
       
       /*contains() --this method return a boolean(True/False) since it checks if a 
       string contains a certain character or not.*/
       //System.out.println(hello.contains("le"));
       
       /*length()  ---this method determines the length of tth string and 
       it returns an integer*/
      // System.out.println(hello.length());
       
       //compareTo() --this method returns an int
       
      // System.out.println(hello.compareToIgnoreCase(compare));
       
       /*endsWith()  ---thi method checks if a string ends with a cetain characters
       it returns a boolean*/
      // System.out.println(hello.endsWith("ld"));
       
       //concat() it connects two strings into one string
      // System.out.println(hello.concat(compare));
      
      //equals --this method comapres two strings and returns a boolean
      System.out.println(hello.equals("hello"));
    }
    
}
