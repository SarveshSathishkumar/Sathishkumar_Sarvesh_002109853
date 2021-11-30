/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author rohinibalasubramanian
 */
public class Ecosystem extends Organization {
    
    EmployeeDirectory employeeDirectory;
    UserAccountDirectory userAccountDirectory;
    EnterpriseDirectory enterpriseDirectory;

    public Ecosystem(EmployeeDirectory employeeDirectory, UserAccountDirectory userAccountDirectory, EnterpriseDirectory enterpriseDirectory) 
    {
        super();
        this.employeeDirectory = employeeDirectory;
        this.userAccountDirectory = userAccountDirectory;
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public Ecosystem(EmployeeDirectory employeeDirectory, UserAccountDirectory userAccountDirectory, EnterpriseDirectory enterpriseDirectory, String name) {
        super(name);
        this.employeeDirectory = employeeDirectory;
        this.userAccountDirectory = userAccountDirectory;
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    private static EcoSystem business;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private Ecosystem(){
        super(null);
    }

    
    public boolean checkuserunique(String username){
        
        return true;
    }
    
}
