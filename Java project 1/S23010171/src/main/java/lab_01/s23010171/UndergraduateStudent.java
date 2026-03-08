/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_01.s23010171;

/**
 *
 * @author Nadeesha Samanmali
 */

    

    
   
 public class UndergraduateStudent extends Student {

    private String degreeProgram;

    public UndergraduateStudent(String Name, String Reg_No, double GPA, String degreeProgram) {
        super(Name, Reg_No, GPA);
        this.degreeProgram = degreeProgram;
    }

   
    @Override
    public String getPerformance() {

        if (GPA >= 3.7) {
            return "First Class";
        } else if (GPA >= 3.3) {
            return "Second Upper";
        } else if (GPA >= 3.0) {
            return "Second Lower";
        } else if (GPA >= 2.0) {
            return "General";
        } else {
            return "Fail";
        }
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }
}   