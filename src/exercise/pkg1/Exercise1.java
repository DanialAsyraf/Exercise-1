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
public class Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Personal p=new Personal();
        Cgpa q=new Cgpa();
        Exam c=new Exam();
        Skills s=new Skills();
        WorkExperiences w=new WorkExperiences();
        Awards a=new Awards();
        Address h=new Address();
        
        System.out.println("My name is "+p.name);
        System.out.println("Address: "+h.homeadress);
        q.printCgpa();
        c.printExam();
        q.printGpa();
        System.out.println("Final Cgpa: "+q.calculateCgpa());
        s.printProskills();
        w.printWork();
        a.printAward();        // TODO code application logic here
    }
    
}
