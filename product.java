// Product class to demonstrate encapsulation
class Product {

    // private variable (cannot access directly)
    private int price;

    // setter method to set price
    public void setPrice(int p) {
        price = p;
    }

    // getter method to get price
    public int getPrice() {
        return price;
    }
}