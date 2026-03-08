/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab_01.s23010171;

/**
 *
 * @author Nadeesha Samanmali
 */
public class S23010171 {

    
       public static void main(String[] args) {

        Student s1 = new Student("Kamal", "EE2025001", 3.2);
        Student s2 = new Student("Nimal", "EE2025002", 0.0);

        UndergraduateStudent u1 =
                new UndergraduateStudent("Sunil", "EE2025003", 3.8, "Software Engineering");

        PostgraduateStudent p1 =
                new PostgraduateStudent("Amali", "EE2025004", 3.4, "Artificial Intelligence");

        System.out.println(s1.getName() + " (" + s1.getRegNo() + ") GPA: " + s1.getGpa()
                + " -> " + s1.getPerformance());

        System.out.println(s2.getName() + " (" + s2.getRegNo() + ") GPA: " + s2.getGpa()
                + " -> " + s2.getPerformance());

        System.out.println(u1.getName() + " (" + u1.getRegNo() + ") GPA: " + u1.getGpa()
                + " -> " + u1.getPerformance() + " in " + u1.getDegreeProgram());

        System.out.println(p1.getName() + " (" + p1.getRegNo() + ") GPA: " + p1.getGpa()
                + " -> " + p1.getPerformance() + " in " + p1.getResearchArea());

        System.out.println("With research score: " + p1.getPerformance(3.9));
    }
}