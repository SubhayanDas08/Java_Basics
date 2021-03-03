public class ArrayOutOfBounds {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5 };
        try {
            System.out.println(" The number at 2nd index is " + nums[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Array index is out of bounds. ");
        }
    }
}