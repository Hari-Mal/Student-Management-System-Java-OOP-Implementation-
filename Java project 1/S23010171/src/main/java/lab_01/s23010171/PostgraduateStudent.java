/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_01.s23010171;

/**
 *
 * @author Nadeesha Samanmali
 */

    
public class PostgraduateStudent extends Student {

    protected String researchArea;

    public PostgraduateStudent(String Name, String Reg_No, double GPA, String researchArea) {
        super(Name, Reg_No, GPA);
        this.researchArea = researchArea;
    }

    
    @Override
    public String getPerformance() {

        if (GPA >= 3.7) {
            return "Distinction";
        } else if (GPA >= 3.3) {
            return "Merit";
        } else if (GPA >= 3.0) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

   
    public String getPerformance(double researchScore) {

        double weightedScore = (GPA * 0.7) + (researchScore * 0.3);

        if (weightedScore >= 3.7) {
            return "Distinction with Research Excellence";
        } else if (weightedScore >= 3.3) {
            return "Merit with Research Contribution";
        } else if (weightedScore >= 3.0) {
            return "Pass with Research Work";
        } else {
            return "Fail (Research Insufficient)";
        }
    }

    public String getResearchArea() {
        return researchArea;
    }
}