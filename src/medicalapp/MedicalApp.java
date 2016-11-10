/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalapp;

/**
 *
 * @author P-Money
 */
public class MedicalApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        display(args);
    }
    public static int display(String [] args){
        SearchFrame.main(args);
        return 1;
    }
    
}
