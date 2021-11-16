/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author sarveshzeke
 */
public class DeliveryManDirectory {
    
    ArrayList<DeliveryMan> deliveryDirectory = new ArrayList<DeliveryMan>();

    public ArrayList<DeliveryMan> getDeliveryDirectory() {
        return deliveryDirectory;
    }

    public void setDeliveryDirectory(ArrayList<DeliveryMan> deliveryDirectory) {
        this.deliveryDirectory = deliveryDirectory;
    }
    
    public void addDelivery(DeliveryMan d)
    {
        deliveryDirectory.add(d);
    }
    
    public DeliveryMan getDeliveryMan(UserAccount  ua)
    {
        for(DeliveryMan d: deliveryDirectory)
        {
            if(d.getName().equals(ua.getUsername()))
                return d;
        }
        return null;
    }
    
    
}
