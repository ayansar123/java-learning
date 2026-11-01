public class Student {
    String name;
    int marks;

    void show() {
        System.out.println(name + " got" + marks);
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Ayan";
        s1.marks = 85;
        s1.show();

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.marks = 70;
        s2.show();
    }
}
