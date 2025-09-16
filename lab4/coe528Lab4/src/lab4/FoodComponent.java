/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Malaika
 */
abstract class FoodComponent {
    String component;
    
    public FoodComponent(String c) {
        component = c;
    }

    public abstract double getPrice();
    public abstract void print(int level);
    
}
