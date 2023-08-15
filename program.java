import java.util.Scanner;

public class program {
    // public static void main(String[] args) {
    // Scanner iScanner = new Scanner(System.in);
    // System.out.printf("Name: ");
    // int x = iScanner.nextInt();
    // System.out.printf("double a: ");
    // double y = iScanner.nextDouble();
    // System.out.printf("Привет, %f = %f", x, y, x + y);
    // iScanner.close();
    // }
    // }

    // public class program {
    // public static void main(String[] args) {
    // int a = 123;
    // a = a-- - --a; // 2
    // a = --a - a--; // 0
    // постфиксный и префиксный инкременты
    // System.out.println(++a);
    // System.out.println(a++);
    // System.out.println(a);

    // Побитовый сдвиг
    // int a = 8;
    // // 1000
    // // a = a << 1;
    // System.out.println(a << 1);
    // 1000 - добавился 1 бит 0 = 10000

    // int a = 16;
    // // 10010
    // System.out.println(a >> 1);
    // // 1001 - получается
    // int a = 5; // в двоичном представлении 101
    // int b = 2; // в двоичном представлении 010
    // System.out.println(a | b); // ответ 111 или 7
    // System.out.println(a & b); // ответ 000 или 0
    // System.out.println(a ^ b); // ответ 111 или 7
    // String s = "qwer"; // 4 символа, индекс 4-ки это 3, т.к. индексы от 0..до 3 в
    // qwer
    // boolean b = s.length() > 5 && s.charAt(4) = '1'; // проверка условия
    // System.out.println(a & b);
    // System.out.println(a && b);
    // System.out.println(b);

    // Массивы

    // Одномерные

    // int[] arr = new int[10];
    // System.out.println(arr.length); // 10
    // arr = new int[] { 1, 2, 3, 4, 5 };
    // System.out.println(arr.length); // 5

    // Многомерные

    // int[] arr[] = new int[3][5]; // массив массивов int[][]
    // for (int[] line : arr) {
    // for (int item : line) {
    // System.out.printf("%d ", item);
    // }
    // System.out.println();
    // }
    // 2
    // int[][] arr = new int[3][5];

    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // System.out.printf("%d ", arr[i][j]);
    // }
    // System.out.println();
    // }

    // Проверка на соответствие получаемого типа
    // flag либо True либо False
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();

        // Форматированный вывод

        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res);
    }

}
