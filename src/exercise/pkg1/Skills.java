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
public class Skills {
    String proskills[] ={"MS Package 100%","Adobe Illustrator 50%","JAVA Programming 60%"};
    
public void printProskills(){
    System.out.println("Professional Skills: ");
    for (int i=0;i<proskills.length;i++){
        System.out.println((i+1)+"."+proskills[i]);
    }
}   
}
