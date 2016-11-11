/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harrisonsommer
 */
public class Patient {
    //instance variable
    private String firstName;
    private String lastName;
    private int patientID;
    
    public Patient(String fName, String lName, int patientNum)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.patientID = patientNum;
    }
    
    public void setName(String first, String last)
    {
        this.firstName = first;
        this.lastName = last;
    }
    
    public void setID(int id)
    {
        this.patientID = id;
    }
    
    public String getName()
    {
        return this.firstName + " " + this.lastName;
    }
    
    public int getID()
    {
        return this.patientID;
    }
    
}
