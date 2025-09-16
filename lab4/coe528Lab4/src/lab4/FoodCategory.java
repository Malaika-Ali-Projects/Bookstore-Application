/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.ArrayList;

/**
 *
 * @author Malaika
 */
public class FoodCategory extends FoodComponent {

    ArrayList<FoodComponent> list;

    public FoodCategory(String c) {
        super(c);
        list = new ArrayList<>();
    }

    public double getPrice() {
        double total = 0;
        for (FoodComponent c: list) {
            total = total + c.getPrice();
        }

        return total;
    }
    
    public void add(FoodComponent component) {
        list.add(component);
    }
    
    public void remove(FoodComponent component) {
        list.remove(component);
    }

    
    public void print(int level) {
        for (int i=0; i< level; i++) {
            System.out.print("      "); 
        }
        System.out.println("FoodCategory (" +component+ ", " + getPrice() + ") contains:");
        
        for (FoodComponent component: list) {
            component.print(level+1);
        }
        
    }

}
