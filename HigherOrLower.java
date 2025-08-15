/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.higherorlower;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author zvanwyk
 */
public class HigherOrLower {

    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);
        Random random = new Random();
        int randomNumber =random.nextInt(1,100), pickedNumber = 0, totalGuesed = 0;
        
        System.out.print("Welocme to the number gesur game! "
                + "\nThis is how its going to work!"
                + "\nYou are going to gues a number between 1 and 100"
                + "\n I am going to say if it is lower or higher!");
        
        
        while(pickedNumber != randomNumber){
            totalGuesed++;
            System.out.print("\n \nWhat is your number : ");
            pickedNumber = scanny.nextInt();
            
            if(pickedNumber > randomNumber){
                System.out.println("Lower");
            }else if(pickedNumber < randomNumber){
                System.out.print("Higher");
            }
        }
        System.out.println("\n\nCongrats!!!! The number was " + randomNumber +""
                + "\nIt took you : " + totalGuesed + " Tries");
        scanny.close();
    }
}
