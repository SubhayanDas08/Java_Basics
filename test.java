class test {
    public static void main(String args[]) {
        int[] B = new int[args.length];
        int num;
        for (int i = 0; i < args.length; i++) {

            num = Integer.parseInt(args[i]);
            B[i] = num * num;
        }

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < args.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}