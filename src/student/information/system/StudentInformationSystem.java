/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student.information.system;

/**
 *
 * @author User
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Ali bin Abu" ;
        String studentID = "S87878" ;
        
        System.out.println("Student Name:" + name);
        System.out.println("Student ID: " + studentID);
        
        //Store marks
        double mark1 = 42.5;
        double mark2 = 45.0;
        
        //Calculate total mark
        double total = mark1 + mark2;
        System.out.println("Total Mark: " + total);
        
        //Display evaluation message
        if (total >= 80) {
            System.out.println("Result: Excellent");
        }     else if (total >= 50) {
                System.out.println("Result: Good");
        } else {
                     System.out.println ("Results: Need Improvement");  
                        }
        }
        
    }
    

