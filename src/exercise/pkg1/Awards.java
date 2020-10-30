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
public class Awards {
        String awardscert[]={"Malaysian University English Test - Band 4","Dean List - Semester 1"};

public void printAward(){
    System.out.println("Awards & Certificates : ");
    for (int i=0;i<awardscert.length;i++){
        System.out.println((i+1)+"."+awardscert[i]);
    }
}   
}
