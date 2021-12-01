/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NGO;

import Business.Company.Company;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ram.a
 */
public class NGO {
    ArrayList<Company> CompanyofNGo = new ArrayList<Company>();
    
    ArrayList<Company> requestCompanyAccess = new ArrayList<Company>();
    
    
    String[][] schedule;
    //HashMap<String, Integer> pointsTable;
    //String[][] pointsScheduledTable;
   // int noOfDonations;
    ArrayList<Donation> donations;
    boolean donationScheduled;
    UserAccount userAccount;
    String scheduleType ;
    
    public NGO(String NGOName)
    {
       // this.userAccount = ua;
        this.NGOName = NGOName;
        this.scheduleType = "TBD";

        donationScheduled = false;
    }

    public ArrayList<Donation> getDonations() {
        return donations;
    }

    public void setDonations(ArrayList<Donation> donations) {
        this.donations = donations;
    }
    
    

//    public ArrayList<Match> getMatches() {
//        return matches;
//    }
//
//    public void setMatches(ArrayList<Match> matches) {
//        this.matches = matches;
//    }
   
    public String[][] getSchedule() {
        return schedule;
    }

    public ArrayList<Company> getCompanyofNGo() {
        return CompanyofNGo;
    }

    public void setCompanyofNGo(ArrayList<Company> CompanyofNGo) {
        this.CompanyofNGo = CompanyofNGo;
    }
    

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

   

   

    public String getNGOName() {
        return NGOName;
    }

    public void setNGOName(String NGOName) {
        this.NGOName = NGOName;
    }
    
    public int getNoOfcompany()
    {
        return CompanyofNGo.size();
    }
    
    String NGOName;

    
    
    
//    public void generateRoundRobinSchedule()
//    {
//                matches = new ArrayList<Match>();
//        int noOfTeams = teamsOfSport.size();
//        int row = 0,matchNoStatic = 1;
//        int noOfMatches = (noOfTeams/2)*(noOfTeams-1);
//        schedule = new String[noOfMatches][3];
//        scheduleType = "Round robin";
//        int days = (noOfTeams % 2 == 0) ? noOfTeams -1 : noOfTeams; 
//        for (int i=0; i<days; i++) {
//            for (int j=0; j<noOfTeams/2; j++) {
//                int t1 = (j+i) % noOfTeams;
//                int t2 = ((noOfTeams - j -1) + i) % noOfTeams;
//                Match match = new Match();
//                match.setMatchNo(matchNoStatic);
//                match.setTeam1(teamsOfSport.get(t1));
//                match.setTeam2(teamsOfSport.get(t2));
//                match.setSport(NGOName);
//                match.setDay(i+1);
//                matches.add(match);
//              //  schedule[row][0] = String.valueOf(matchNoStatic);
//              //  schedule[row][1] = "Day " + (i+1);
//              //  schedule[row][2] = "Team "+ teamsOfSport.get(t1).getTeamName()+" vs Team "+ teamsOfSport.get(t2).getTeamName();
//                
//                row++;matchNoStatic++;
//            }
//        }
//        
//      //  return schedule;
//    }
    
//    public void generateKnockoutSchedule()
//    {
//                matches = new ArrayList<Match>();
//        int noOfTeams = teamsOfSport.size();
//        schedule = new String[noOfTeams/2][3];
//        scheduleType = "Knockout";
//        noOfMatches = noOfTeams/2;
//        int row = 0,matchNoStatic = 1,team = 0;
//        for(int i = 0; i < noOfTeams/2;i++)
//        {
//            Match match = new Match();
//            match.setMatchNo(matchNoStatic);
//            match.setSport(NGOName);
//            match.setTeam1(teamsOfSport.get(team));
//            match.setTeam2(teamsOfSport.get(team+1));
//            match.setDay(i);
//            matches.add(match);
//          //  schedule[row][0] = String.valueOf(matchNoStatic);
//          //  schedule[row][1] = teamsOfSport.get(team).getTeamName();
//          //  schedule[row][2] = teamsOfSport.get(team+1).getTeamName();
//            row++;matchNoStatic++;  
//            team = team + 2;
//        }
//      //  return schedule;
//    }
    
    
    
    
    
    
    public void addTeamRequest(Company comp)
    {
        if(CompanyofNGo == null) CompanyofNGo = new ArrayList<Company>();
        CompanyofNGo.add(comp);
    }
    
    public void provideTeamAccess(String CompanyName)
    {
        for(Company t: CompanyofNGo)
        {
            if(t.getCompanyName().equals(CompanyName))
            {
                t.setCompanyStatus("Playing");
            }
        }
    }
    
    public Company getCompany(String CompanyName)
    {
        for(Company c: CompanyofNGo)
        {
            if(c.getCompanyName().equals(CompanyName))
                return c;
        }
        return null;
    }

    public String getScheduleType() {
        return scheduleType;
    }
    public void setScheduleType(String type)
    {
        this.scheduleType = type;
    }
    
    
//     public HashMap<String,Integer> winByLocation(String Location)
//     {
//         HashMap<String,Integer> stats = new HashMap<String,Integer>();
//         for(Match m : matches)
//         {
//             if(m.getVenue() == null) continue;
//             if(m.getVenue().getLocation().equals(Location))
//             {
//             if(m.getMatchWinner() == null) continue;
//             else
//             {
//                if(stats.containsKey(m.getMatchWinner())) 
//                {
//                    stats.put(m.getMatchWinner(), stats.get(m.getMatchWinner()) + 1);
//                }
//                else
//                    stats.put(m.getMatchWinner(),1);
//             }
//             }
//         }
//         return stats;
//         
//     }
}

