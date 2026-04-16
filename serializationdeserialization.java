import java.io.*;
class Student implements Serializable{
    int id;
    String name;
    Student(int id,String name){
    this.id = id;
    this.name = name; 
    }
    void display(){
        System.out.println("ID: " + id);
        System.out.println("Name:"+ name);
    }
}
public class serializationdeserialization {
    public static void main(String[] args){

        try{
            student s1 = new student(101, "Rahul");
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            System.out.println("Object serialized successfully.\n");
            oos.close();
            fos.close();
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Student s2 = (Student) ois.readObject();
            
            System.out.println("Object serialization successfully:");
            System.out.println("student data after deserialzation:");
            s2.display();

            ois.close();
            fis.close();

        } catch (IOException e) {
            System.out.println("File error:" + e);

        } catch (ClassNotFoundException e){
            System.out.println("Class error:" + e);
            
        }
    }
    
} 
