public class Main {

    public static void main(String[] args) {

        // creating Student object
        Student s1 = new Student(101, "Satyam", 85);
        s1.display();
        s1.formatName();
        s1.showMarksArray();

        // creating Employee objects
        Employee e1 = new Employee(1, "Rahul", 30000);
        Employee e2 = new Employee(2, "Aman", 35000);
        e1.display();
        e2.display();

        // using Product class (encapsulation)
        Product p = new Product();
        p.setPrice(500);
        System.out.println("\nProduct Price: " + p.getPrice());

        // demonstrating inheritance
        CollegeStudent cs = new CollegeStudent(102, "Amit", 88, "AKTU");
        cs.displayCollegeStudent();

        // demonstrating method overloading
        ProductBilling bill = new ProductBilling();
        bill.calculateBill(100);
        bill.calculateBill(100, 200);
        bill.calculateBill(100, 200, 300);
    }
}