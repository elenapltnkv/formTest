public class OwerLimits {
    public static void main(String[] args) {
        //0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
        //done
//1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
        byte a;
        int i = 33000;
        //a = i;
        //System.out.println(a);
        //2) попробовать вычисления комбинаций типов данных (int и double)
        int w = 8;
        double s = 8.0;
        double c = w+s;
        int c1 = (int) (w+s);
        System.out.println(c);
    }

}
