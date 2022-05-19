package Product;

import java.text.DecimalFormat;
public class Product {
    public String name;
    public double cost;
    public int quantity;
    public DecimalFormat f = new DecimalFormat("##.00");

    public Product(String name, double cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this. quantity = quantity;
    }
    public void totalCost() {
        double totalCost = this.cost * this.quantity;
        System.out.println("The total cost of "+this.quantity+" unit(s) is $"+f.format(totalCost));
    }
    public void printProduct() {
        System.out.println("Each unit of "+this.name+" costs $"+f.format(this.cost)+" and "+this.quantity+" units were purchases.");
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }
}
