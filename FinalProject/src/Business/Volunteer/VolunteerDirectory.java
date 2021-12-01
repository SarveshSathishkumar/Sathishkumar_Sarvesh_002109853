/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author rohinibalasubramanian
 */
public class VolunteerDirectory {
    ArrayList<Volunteer> volunteers;
   int volunteerId = 100;
   String status;

    public ArrayList<Volunteer> getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(ArrayList<Volunteer> volunteers) {
        this.volunteers = volunteers;
    }
   
    
    public void addVolunteer(Volunteer volunteer)
    {
        if(volunteers == null) volunteers= new ArrayList<Volunteer>();
        volunteer.setvolunteerId(volunteerId);
        volunteers.add(volunteer);
        volunteerId++;
    }
    
    public Volunteer getVolunteer(String volunteerName)
    {
        for(Volunteer v: volunteers)
        {
            if(v.getvolunteerName().equals(volunteerName))
                return v;
        }
        return null;
            
    }
    
    public Volunteer getVolunteer(UserAccount ua)
    {
        for(Volunteer v: volunteers)
        {
            if(v.getUa().equals(ua))
                return v;
        }
        return null;
    }
    
    public ArrayList<Volunteer> getvolunteersByDesignation(String designation)
    {
        ArrayList<Volunteer> volunteersWithDesination = new ArrayList<Volunteer>();
        for(Volunteer v: volunteers)
        {
            if(v.getvolunteerDesignation().equals(designation))
              volunteersWithDesination.add(v);
        }
        return volunteersWithDesination;        
    }
}
