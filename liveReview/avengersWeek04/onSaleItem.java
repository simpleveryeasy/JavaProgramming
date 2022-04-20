package avengersWeek04;

public class onSaleItem extends Item{

    // inherits from Item Class
    /**
     * private instance variable, used for discount percentage
     */
    private double discountPercentage;


    /**
     * public constructor for OnSaleItem
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price

     *
     * - Calls Super class constructor by passing name,quantity,catalogNumber,price
     * - it will assign the price after deducting(minus) discount from the price
     * - assigns discount
     */
    public onSaleItem(String name, int quantity, double price, int catalogNumber, double discountPercentage) {
        super(name, quantity, (price - price * discountPercentage), catalogNumber);
        this.discountPercentage = discountPercentage;
    }


    /**
     * getter for discount
     * @return
     */
    public double getDiscountPercentage() {
        return discountPercentage;
    }


    /**
     * setter for discount
     * @param discount
     */
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }


/**
     * overrides toString from Item:
     *
     * @returns Object description in this format:
     *      * "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
     *
     */
    public String toString() {
        return "onSaleItem{" +
                "discountPercentage=" + discountPercentage +
                "', name="+super.getName()+
                ", price="+super.getPrice()+
                '}';
    }
}
