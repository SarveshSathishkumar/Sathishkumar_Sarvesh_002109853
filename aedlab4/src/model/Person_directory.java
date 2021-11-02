/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author sarveshzeke
 */
public class Person_directory{
    
    private ArrayList <Person> person_directory;
    
 public Person_directory()
 {
    person_directory = new ArrayList<>();
 }

    public ArrayList<Person> getPerson_directory() {
        return person_directory;
    }

    public void setPerson_directory(ArrayList<Person> person_directory) {
        this.person_directory = person_directory;
    }
 
    public Person createAndAddPerson() {
        Person person = new Person();
        person_directory.add(person);
        return person;
    }
    
    public void deletePerson(Person person) {
        person_directory.remove(person);
    }
    public ArrayList<Person> searchPatient(String key)
    {
        ArrayList<Person> searchPatientDirectory = new ArrayList();
        for(Person person: person_directory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                if(person.getPatient()!=null)
                {
                    searchPatientDirectory.add(person);
                }
            }
        }
        return searchPatientDirectory;
    }
    
    public ArrayList<Person> searchPerson(String key)
    {
        ArrayList<Person> searchPersonDirectory = new ArrayList();
        for(Person person: person_directory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
        }
        return searchPersonDirectory;
    }
}

