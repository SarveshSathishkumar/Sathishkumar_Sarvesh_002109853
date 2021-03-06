/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Venue;

import Business.UserAccount.UserAccount;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author sarveshzeke
 */
public class Venue {
    
    String venueName;
    String venueManager;
    int venueSeatingCapacity;
    String location;
    UserAccount userAccount;
    HashMap<Match, Date> matchRequests;

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public HashMap<Match, Date> getMatchRequests() {
        return matchRequests;
    }

    public void setMatchRequests(HashMap<Match, Date> matchRequests) {
        this.matchRequests = matchRequests;
    }
    HashMap<Date,Boolean> venueAvailability;

    public HashMap<Match, Date> getScheduledMatches() {
        return matchRequests;
    }

    public void setScheduledMatches(HashMap<Match, Date> scheduledMatches) {
        this.matchRequests = scheduledMatches;
    }

    public Venue(UserAccount ua,String venueName,String venueLocation)
    {
        this.userAccount = ua;
        this.venueName = venueName;
        this.location = venueLocation;
        matchRequests = new HashMap<Match, Date>();
        venueAvailability = new HashMap<Date, Boolean>();
        
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueManager() {
        return venueManager;
    }

    public void setVenueManager(String venueManager) {
        this.venueManager = venueManager;
    }

    public int getVenueSeatingCapacity() {
        return venueSeatingCapacity;
    }

    public void setVenueSeatingCapacity(int venueSeatingCapacity) {
        this.venueSeatingCapacity = venueSeatingCapacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public HashMap<Date, Boolean> getVenueAvailability() {
        return venueAvailability;
    }

    public void setVenueAvailability(HashMap<Date, Boolean> venueAvailability) {
        this.venueAvailability = venueAvailability;
    }
    
    
    public boolean checkAvailability(Date date) throws ParseException 
    {

        boolean dateExists = false;

                Set<Date> dates = venueAvailability.keySet();
                Date dateing = new Date();
                DateFormat datef = new SimpleDateFormat("dd-MMM-yyyy"); 
                String dateIn = datef.format(date);
                String hashDate;
                for(Date d:dates)
                {
                    
                    hashDate = datef.format(d);
                    if(dateIn.equals(hashDate)) {dateExists = true;break;}
                }
                dateing = datef.parse(dateIn);
                if(dateExists == false) venueAvailability.put(dateing,true);
                
               return venueAvailability.get(dateing);
           
        
    }
    
    
}
