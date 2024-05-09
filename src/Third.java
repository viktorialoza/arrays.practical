public class Third {
    public static void main(String[] args) {
        double mid1 = 0, mid2 = 0, mid3 = 0;
        int ar1[] = new int[5];
        for (int i = 0; i < 5; i++) {
            ar1[i] = (int) Math.round(Math.random() * 5);
            mid1 = mid1 + ar1[i];
            System.out.print(ar1[i] + " ");
        }
        System.out.println(" ");
        int ar2[] = new int[5];
        for (int i = 0; i < 5; i++) {
            ar2[i] = (int) Math.round(Math.random() * 5);
            mid2 = mid2 + ar2[i];
            System.out.print(ar2[i] + " ");
        }
        System.out.println(" ");
        int ar3[] = new int[5];
        for (int i = 0; i < 5; i++) {
            ar3[i] = (int) Math.round(Math.random() * 5);
            mid3 = mid3 + ar3[i];
            System.out.print(ar3[i] + " ");
        }
        System.out.println(" ");

        System.out.println(mid1 = mid1 / 5);
        System.out.println(mid2 = mid2 / 5);
        System.out.println(mid3 = mid3 / 5);

        if (mid1 > mid2 & mid1 > mid3) {
            System.out.println("Середнє значення пешого масиву є більшим");
        } else if (mid2 > mid1 & mid2 > mid3) {
            System.out.println("Середнє значення другого масиву є більшим");
        } else if (mid3 > mid1 & mid3 > mid2) {
            System.out.println("Середнє значення третього масиву є більшим");
        } else {
            System.out.println("Середнє значення масивів рівне");
        }
    }
}
