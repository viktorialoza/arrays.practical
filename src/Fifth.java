public class Fifth {
    public static void main(String[] args) {
        int s=0;
        int array3[] = new int[15];
        for (int i = 0; i < 10; i++) {
            array3[i] = (int) Math.round(Math.random() * 10);
            if (array3[i]%2==0){
                s++;
            }
            System.out.print(array3[i] + " ");
        }
        System.out.println(" ");
        System.out.println("кількість парних чисел = "+s);
        System.out.println("Завдання 6");
        int[][] array4 = new int[15][];
        array4 [0] = new int [5];
        array4 [1] = new int [5];
        array4 [2] = new int [5];
        array4 [3] = new int [5];
        array4 [4] = new int [8];
        array4 [5] = new int [8];
        array4 [6] = new int [8];
        array4 [7] = new int [8];
        array4 [8] = new int [3];
        array4 [9] = new int [3];
        array4 [10] = new int [3];
        array4 [11] = new int [3];
        array4 [12] = new int [9];
        array4 [13] = new int [9];
        array4 [14] = new int [9];
        for(int i=0;i<array4.length;i++) {
            for (int j = 0; j < array4[i].length; j++) {
                array4[i][j] = (int) (Math.random() * 15);
                System.out.print(array4[i][j] + " ");
            }
        }
        System.out.println(" ");



    }
}

