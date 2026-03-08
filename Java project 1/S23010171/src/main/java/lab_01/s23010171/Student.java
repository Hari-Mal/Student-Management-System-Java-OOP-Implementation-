/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_01.s23010171;

/**
 *
 * @author Nadeesha Samanmali
 */
public class Student {

    // Protected attributes
    protected String Name;
    protected String Reg_No;
    protected double GPA;

    
    public Student(String Name, String Reg_No, double GPA) {
        this.Name = Name;
        this.Reg_No = Reg_No;
        setGpa(GPA);
    }

    // Getter methods
    public String getName() {
        return Name;
    }

    public String getRegNo() {
        return Reg_No;
    }

    public double getGpa() {
        return GPA;
    }

    
    public void setGpa(double GPA) {
        if (GPA >= 0.0 && GPA <= 4.0) {
            this.GPA = GPA;
        } else {
            this.GPA = 0.0;
            System.out.println("Invalid GPA! Setting GPA to 0.0");
        }
    }

 
    public String getPerformance() {

        if (GPA >= 3.5) {
            return "Excellent";
        } else if (GPA >= 3.0) {
            return "Good";
        } else if (GPA >= 2.0) {
            return "Average";
        } else {
            return "Poor";
        }
    }
}