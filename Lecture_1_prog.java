public class Lecture_1_prog {
    public static void main(String[] args) {
        // // // System.out.println("Goodbye world");
        // // String s = null; // необходимо положить значение в переменную
        // // System.out.println(s);
        // // }
        // // }

        // // Основы: типы данных
        // // public class Program {
        // public static void main(String[] args) {
        // // // примитивные типы данных
        // // short age = 10;
        // // int salary = 123456;
        // // System.out.println(age); // 10
        // // System.out.println(salary); // 123456
        // // // вещественные числа, суф f необходим для float
        // // float e = 2.7f;
        // // // double f = 123.450;
        // // double pi = 3.1415;
        // // System.out.println(e); // 2.7
        // // System.out.println(pi); // 3.1415
        // // // тип данных char
        // // char ch = '1';
        // // System.out.println(Character.isDigit(ch)); // true
        // // ch = 'a';
        // // System.out.println(Character.isDigit(ch));
        // // // тип данных boolean
        // // boolean flag1 = 123 <= 234;
        // // System.out.println(flag1); // true
        // // boolean flag2 = 123 >= 234 || flag1;
        // // System.out.println(flag2); // true
        // // boolean flag3 = flag1 ^ flag2; // разделительная дизъюнкция True выдает
        // False
        // // System.out.println(flag3); // false
        // // // строки не простые, сразу не известно, сколько в ней хранится
        // // // 1 символ = 2 байтам, умножаем кол-во символов на 2
        // // String msg = "Hello world";
        // // System.out.println(msg); // Hello world
        // // // Неявная типизация
        // // var a = 123;
        // // System.out.println(a); // 123
        // // var d = 123.456;
        // // System.out.println(d); // 123.456
        // // Неявная типизация
        // // var a = 123;
        // // System.out.println(a); // 123
        // // var d = 123.456;
        // // System.out.println(d); // 123.456
        // // System.out.println(getType(a)); // Integer
        // // System.out.println(getType(d)); // Double
        // // d = 1022;
        // // System.out.println(d); // 1022
        // // d = "mistake";
        // // error: incompatible types:
        // // String cannot be converted to double

        // static String getType(Object o) {
        // return o.getClass().getSimpleName();
        // }

        // Преобразования
        int i = 123;
        double d = i;
        System.out.println(i); // 123
        System.out.println(d); // 123.0
        d = 3.1415;
        i = (int) d;
        System.out.println(d); // 3.1415
        System.out.println(i); // 3
        d = 3.9415;
        i = (int) d;
        System.out.println(d); // 3.9415
        System.out.println(i); // 3
        byte b = Byte.parseByte("123");
        System.out.println(b); // 123
        b = Byte.parseByte("1234");
        System.out.println(b); // NumberFormatException: Value out of range

    }

}
