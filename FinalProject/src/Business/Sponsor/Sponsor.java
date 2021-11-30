/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sponsor;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ram.a
 */
public class Sponsor {
    String sponsorName;

    public String getSponsorName() {
        return sponsorName;
    }
    
    HashMap<Company, Integer> sponsoredRequests;
    HashMap<Company,String> offerStatus;

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public HashMap<Company, String> getOfferStatus() {
        return offerStatus;
    }

    public void setOfferStatus(HashMap<Company, String> offerStatus) {
        this.offerStatus = offerStatus;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    int sponsorBudget;
    ArrayList<String> sponsoredTeams = new ArrayList<String>();

    public ArrayList<String> getSponsoredTeams() {
        return sponsoredTeams;
    }

    public void setSponsoredTeams(ArrayList<String> sponsoredTeams) {
        this.sponsoredTeams = sponsoredTeams;
    }
    UserAccount userAccount;

    public Sponsor(UserAccount ua,String sponsorName)
    {
        this.userAccount = ua;
        this.sponsorName = sponsorName;
        sponsoredTeams = new ArrayList<String>();
        sponsoredRequests = new HashMap<Company,Integer>();
        offerStatus = new HashMap<Company,String>();
       
    }

    public HashMap<Company, Integer> getSponsoredRequests() {
        return sponsoredRequests;
    }

    public void setSponsoredRequests(HashMap<Company, Integer> sponsoredRequests) {
        this.sponsoredRequests = sponsoredRequests;
    }
    public int getSponsorBudget() {
        return sponsorBudget;
    }

    public void setSponsorBudget(int sponsorBudget) {
        this.sponsorBudget = sponsorBudget;
    }
    
    public void setSponsorship(Company comp,int budget)
    {
        offerStatus.put(comp,"Accepted");
       // sponsoredRequests.put(team,sponsoredRequests.get(team) + budget);
        
    }


}
