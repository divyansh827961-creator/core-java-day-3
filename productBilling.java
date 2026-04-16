public class productBilling {
    void bill(int price) {
        System.out.println("Total Bill for 1 product:"+ price);
    } 
    void bill (int price1, int price2) {
        System.out.println("Total Bill for 2 product:" + (price1 + price2));
    }
    void bill (int price1, int price2, int price3){
        System.out.println("Total Bill for 3 product:" + (price1 + price2 + price3));
    }
public static void main (String[]args){
productBilling pb = new productBilling();
pb.bill(500);
pb.bill(500,600);
pb.bill(500,600,400);
}
}