/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Malaika
 */
public class FoodItem extends FoodComponent {

    double price;

    public FoodItem(String i, double p) {
        super(i);
        price = p;
    }

    public double getPrice() {
        return price;
    }

    public void print(int level) {

        for (int i=0; i< level; i++) {
            System.out.print("      "); 
        }
        System.out.println("FoodItem: " + component + ", " + price);
    }
}
