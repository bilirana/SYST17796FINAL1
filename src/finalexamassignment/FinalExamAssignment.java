/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexamassignment;

/**
 *
 * @author aljen
 */
public class FinalExamAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static double calculateNet(int hours, int rate, int tax){
        double netSalary, gross, net;
        gross = hours * rate;
        net = gross - tax;
        netSalary = gross - net;
        return netSalary;
    }
    
}
