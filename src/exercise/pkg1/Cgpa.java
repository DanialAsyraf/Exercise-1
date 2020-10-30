/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkg1;

/**
 *
 * @author user
 */
public class Cgpa {

double CGPA=4.00;
double gpa[]={4.00,3.98,3.70,3.85,3.70,3.85};
double sum=0;
double finalcgpa=0;
double cgpa;

public void printCgpa(){
    System.out.println("The Cgpa from method is "+CGPA);
}
public void printGpa(){
    for (int i=0; i<gpa.length; i++){
    System.out.println("Sem "+(i+1)+":"+gpa[i]);
    
    }
}
public double calculateCgpa(){
    for (int i=0; i<gpa.length; i++){
        sum+=gpa[i];
        //sum=sum+gpa[i];
    }
    if (gpa.length != 0){
        cgpa=sum/gpa.length;
    }
    else {
        cgpa=0.0;
    }
        
    
    return cgpa;
}  
}
