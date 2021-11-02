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
public class Encounter {
    VitalSigns vitals;
   
    public ArrayList<VitalSigns> encounterhistory;

    
    public Encounter() {
        
        encounterhistory= new ArrayList<>();
        this.vitals = new VitalSigns();
        
      }

    public ArrayList<VitalSigns> getEncounterhistory() {
        return encounterhistory;
    }

    public void setEncounterhistory(ArrayList<VitalSigns> encounterhistory) {
        this.encounterhistory = encounterhistory;
    }

    public VitalSigns createvitals()
    {  
    VitalSigns vital = new VitalSigns();
    encounterhistory.add(vital);
    return vital;
    }

    
    public void deleteVitalSign(VitalSigns vitalSign) {
        encounterhistory.remove(vitalSign);
    }
    
    public VitalSigns getVitalSigns(){
        return this.vitals;
    }
    
    public VitalSigns setVitalSigns(VitalSigns vi){
        return  this.vitals = vi;
    }
    
}
