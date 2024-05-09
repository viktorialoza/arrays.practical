public class Second {
    public static void main(String[] args) {
        int array2[] = new int[20];
        for (int i = 0; i < 20; i++) {
            array2[i] = (int) Math.round(Math.random() * 9);
            System.out.print(array2[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                array2[i] = 0;
            }
            System.out.print(array2[i] + " ");
        }
        System.out.println(" ");
    }
}
