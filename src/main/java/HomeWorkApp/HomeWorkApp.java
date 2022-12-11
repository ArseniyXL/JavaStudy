package HomeWorkApp;
public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println(between10and20(11,1));
        System.out.println(positive_or_negative(0));
        System.out.println(positive_or_negative2(-1));
        repeat("Повтор",4);
        System.out.println(leap_year(404));

    }
/*1.Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/
    public static boolean between10and20 (int a, int b){
        if ((a+b) >=10 && (a+b) <= 20)
            return true;
            else
                return false;
    }
/*2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.*/
    public static String positive_or_negative (int a) {
        if (a >= 0)
            return "Положительное";
        else
            return "Отрицательное";
    }
//3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean positive_or_negative2 (int a) {
        if (a >= 0)
            return true;
        else
            return false;
    }
    //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void repeat (String a, int b){
        for (int i = 0; i < b; i++) {
            System.out.println(a);

        }

    }
    //5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean leap_year (int year){
        if ((year % 4 == 0)   && ((year % 100) > 0) || ((year % 400) == 0))
            return true;
        else if ((year % 100) > 0)
            return false;
        else return false;
    }

}

