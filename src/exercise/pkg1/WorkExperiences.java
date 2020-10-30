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
public class WorkExperiences {
    String work[]={"Mamasab Official Agent","Open Journal System Consultant"};
    
public void printWork(){
    System.out.println("Work Experiences: ");
    for (int i=0;i<work.length;i++){
        System.out.println((i+1)+"."+work[i]);
    }
}
}
