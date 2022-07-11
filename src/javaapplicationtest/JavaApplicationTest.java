/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationtest;
import java.util.Scanner;
/**
 *
 * @author gen3r
 */
public class JavaApplicationTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Enter your name: ");
        String name = input.next();
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        
        Test t = new Test(age, name);
        System.out.println(t);
        
        
    }
    
}
