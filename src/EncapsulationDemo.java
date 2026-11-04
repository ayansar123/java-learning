class Customer {
    private String name;
    private int age;

    Customer(String name, int age) {
        this.name = name;
        setAge(age);
    }
    String getName()  {
        return name;
    }
    int getAge() {
        return age;
    }
    void setAge(int age) {
     if ( age > 0 && age < 120) {
         this.age = age;
     }else{
         System.out.println("Invaid age");
     }
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Customer bc = new Customer("Ayan", 21);
    System.out.println(bc.getName() + " is " + bc.getAge());
        bc.setAge(-5);
        bc.setAge(22);
        System.out.println("Age now = " + bc.getAge());
    }
}
