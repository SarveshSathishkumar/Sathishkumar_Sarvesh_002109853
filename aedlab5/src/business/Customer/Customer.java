/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Customer;
import business.Restaurant.Cart;
import business.Restaurant.Order;
import business.useraccount.UserAccount;
import java.util.ArrayList;
/**
 *
 * @author sarveshzeke
 */
public class Customer {
    
    String Cust_Name;
    UserAccount useraccount;
    
      public Customer(UserAccount ua)
    {
        this.useraccount = ua;
        this.Cust_Name = ua.getUsername();
    }

    public String getCstmrName() {
        return Cust_Name;
    }

    public void setCstmrName(String CstmrName) {
        this.Cust_Name = CstmrName;
    }

    public UserAccount getUsrAcc() {
        return useraccount;
    }

    public void setUsrAcc(UserAccount UsrAcc) {
        this.useraccount = UsrAcc;
    }
    

    ArrayList<Cart> cart = new ArrayList<Cart>();
    ArrayList<Order> previousOrders = new ArrayList<Order>();

    public ArrayList<Cart> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Cart> cart) {
        this.cart = cart;
    }
    
    public void addToCart(Cart cart)
    {
        this.cart.add(cart);
    }

    public ArrayList<Order> getPreviousOrders() {
        return previousOrders;
    }

    public void setPreviousOrders(ArrayList<Order> previousOrders) {
        this.previousOrders = previousOrders;
    }
    
    
    
}
