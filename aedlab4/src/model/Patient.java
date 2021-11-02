/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sarveshzeke
 */
public class Patient extends Person{
    
    
    private String availability;
    private String DoctorName;
    
    private Encounter encounter;
    
    public Patient() {
        this.encounter = new Encounter();
    }
    
    public String getDoctorName() {
        return DoctorName;
    }
    
    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Encounter getEncounter() {
        return encounter;
    }
    
    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.availability);
    }
}
