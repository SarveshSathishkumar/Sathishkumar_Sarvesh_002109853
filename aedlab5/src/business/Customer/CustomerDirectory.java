/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Customer;

import business.useraccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author sarveshzeke
 */
public class CustomerDirectory {
    
    ArrayList<Customer> CstmrList = new ArrayList<Customer>();

    public ArrayList<Customer> getCstmrList() {
        return CstmrList;
    }

    public void setCstmrList(ArrayList<Customer> CstmrList) {
        this.CstmrList = CstmrList;
    }
    
        public Customer getCustomer(UserAccount ua)
    {
        for(Customer c: CstmrList)
        {
            if(ua.getUsername().equals(c.getUsrAcc().getUsername()))
                return c;
        }
          return null; 
    }
 
    public void addCustomer(Customer c)
    {
        this.CstmrList.add(c);
    }
    
    public void deleteCustomer(Customer c)
    {
        this.CstmrList.remove(c);
    }
        
      
}

