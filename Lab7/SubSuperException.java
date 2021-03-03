public class SubSuperException {
    public static void main(String args[]) {
        try {
            int error = 1 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("Sub class exception.");
        } catch (Exception e) {
            System.out.println("Super class exception.");
        }
    }
}