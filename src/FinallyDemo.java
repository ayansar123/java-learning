public class FinallyDemo {
    public static void main(String[] args) {
        int[] marks = {70, 80, 90};

        try {
            System.out.println("Mark 1 =  " + marks[0]);
            System.out.println("Mark 5 =  " + marks[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("That position does not exist");
        } finally {
            System.out.println("Finally always runs");
        }
    }
}
