/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author sarveshzeke
 */
public class OrderAccepted {
    
    ArrayList<FinalOrder> ordrsAcptd = new ArrayList<FinalOrder>();

    public ArrayList<FinalOrder> getOrdrsAcptd() {
        return ordrsAcptd;
    }

    public void setOrdrsAcptd(ArrayList<FinalOrder> ordrsAcptd) {
        this.ordrsAcptd = ordrsAcptd;
    }
    
}
