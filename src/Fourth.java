public class Fourth {
    public static void main(String[] args) {
        int a1[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a1[i] = (int) Math.round(Math.random() * 10);
            System.out.print(a1[i] + " ");
        }
        System.out.println(" ");
        int a2[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a2[i] = (int) Math.round(Math.random() * 10);
            System.out.print(a2[i] + " ");
        }
        System.out.println(" ");
        int a3[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a3[i] = a1[i]+a2[i];
            System.out.print(a3[i] + " ");
        }
        System.out.println(" ");
    }
}
