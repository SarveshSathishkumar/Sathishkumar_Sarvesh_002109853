/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NGO;

import Business.Company.Company;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ram.a
 */
public class NGO {
    ArrayList<Company> teamsOfSport = new ArrayList<Company>();
    
    ArrayList<Company> requestCompanyAccess = new ArrayList<Company>();
    
    
    String[][] schedule;
    HashMap<String, Integer> pointsTable;
    String[][] pointsScheduledTable;
    int noOfMatches;
    ArrayList<Match> matches;
    boolean matchesScheduled;
    UserAccount userAccount;
    String scheduleType ;
    
    public NGO(String NGOName)
    {
       // this.userAccount = ua;
        this.NGOName = NGOName;
        this.scheduleType = "TBD";

        matchesScheduled = false;
    }
    
    

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }
    int pointsPerMatch = 2;

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public HashMap<String, Integer> getPointsTable() {
        return pointsTable;
    }

    public void setPointsTable(HashMap<String, Integer> pointsTable) {
        this.pointsTable = pointsTable;
    }

    public ArrayList<Company> getTeamsOfSport() {
        return teamsOfSport;
    }

    public void setTeamsOfSport(ArrayList<Company> teamsOfSport) {
        this.teamsOfSport = teamsOfSport;
    }

    public String getNGOName() {
        return NGOName;
    }

    public void setNGOName(String NGOName) {
        this.NGOName = NGOName;
    }
    
    public int getNoOfTeam()
    {
        return teamsOfSport.size();
    }
    
    String NGOName;

    
    
    
    public void generateRoundRobinSchedule()
    {
                matches = new ArrayList<Match>();
        int noOfTeams = teamsOfSport.size();
        int row = 0,matchNoStatic = 1;
        int noOfMatches = (noOfTeams/2)*(noOfTeams-1);
        schedule = new String[noOfMatches][3];
        scheduleType = "Round robin";
        int days = (noOfTeams % 2 == 0) ? noOfTeams -1 : noOfTeams; 
        for (int i=0; i<days; i++) {
            for (int j=0; j<noOfTeams/2; j++) {
                int t1 = (j+i) % noOfTeams;
                int t2 = ((noOfTeams - j -1) + i) % noOfTeams;
                Match match = new Match();
                match.setMatchNo(matchNoStatic);
                match.setTeam1(teamsOfSport.get(t1));
                match.setTeam2(teamsOfSport.get(t2));
                match.setSport(NGOName);
                match.setDay(i+1);
                matches.add(match);
              //  schedule[row][0] = String.valueOf(matchNoStatic);
              //  schedule[row][1] = "Day " + (i+1);
              //  schedule[row][2] = "Team "+ teamsOfSport.get(t1).getTeamName()+" vs Team "+ teamsOfSport.get(t2).getTeamName();
                
                row++;matchNoStatic++;
            }
        }
        
      //  return schedule;
    }
    
    public void generateKnockoutSchedule()
    {
                matches = new ArrayList<Match>();
        int noOfTeams = teamsOfSport.size();
        schedule = new String[noOfTeams/2][3];
        scheduleType = "Knockout";
        noOfMatches = noOfTeams/2;
        int row = 0,matchNoStatic = 1,team = 0;
        for(int i = 0; i < noOfTeams/2;i++)
        {
            Match match = new Match();
            match.setMatchNo(matchNoStatic);
            match.setSport(NGOName);
            match.setTeam1(teamsOfSport.get(team));
            match.setTeam2(teamsOfSport.get(team+1));
            match.setDay(i);
            matches.add(match);
          //  schedule[row][0] = String.valueOf(matchNoStatic);
          //  schedule[row][1] = teamsOfSport.get(team).getTeamName();
          //  schedule[row][2] = teamsOfSport.get(team+1).getTeamName();
            row++;matchNoStatic++;  
            team = team + 2;
        }
      //  return schedule;
    }
    
    
    public HashMap<String,Integer> generateHashPointsTable()
    {
        int noOfTeams = teamsOfSport.size();
        for(int i = 0 ; i < noOfMatches; i++)
        {
            String teamWon = schedule[i][3];
            int matchesWon = pointsTable.get(teamWon);
            matchesWon++;
            pointsTable.put(teamWon, matchesWon);
        }
        return pointsTable;
    }
    
    
    public void updatePoints(String team1,String team2,String teamWon)
    {
        Company team1Played = getTeam(team1);
        team1Played.updateMatchPlayed();
        Company team2Played = getTeam(team2);
        team2Played.updateMatchPlayed();
        Company teamPlayedWon = getTeam(teamWon);
        teamPlayedWon.updateMatchesWon();
    }
    
    public void addTeamRequest(Company comp)
    {
        if(teamsOfSport == null) teamsOfSport = new ArrayList<Company>();
        teamsOfSport.add(comp);
    }
    
    public void provideTeamAccess(String CompanyName)
    {
        for(Company t: teamsOfSport)
        {
            if(t.getCompanyName().equals(CompanyName))
            {
                t.setCompanyStatus("Playing");
            }
        }
    }
    
    public Company getTeam(String CompanyName)
    {
        for(Company c: teamsOfSport)
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
    
    
     public HashMap<String,Integer> winByLocation(String Location)
     {
         HashMap<String,Integer> stats = new HashMap<String,Integer>();
         for(Match m : matches)
         {
             if(m.getVenue() == null) continue;
             if(m.getVenue().getLocation().equals(Location))
             {
             if(m.getMatchWinner() == null) continue;
             else
             {
                if(stats.containsKey(m.getMatchWinner())) 
                {
                    stats.put(m.getMatchWinner(), stats.get(m.getMatchWinner()) + 1);
                }
                else
                    stats.put(m.getMatchWinner(),1);
             }
             }
         }
         return stats;
         
     }
}

