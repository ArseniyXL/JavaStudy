package HomeWorkApp3;

import java.util.Arrays;

public class HomeWorkApp3 {

    public static void main(String[] args) {
        array1();
        array2();
        array3();
        array4();
        arraymaker(3, 4);
        minmaxArr();



    }



    //  1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void array1(){
    int[] binarray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < binarray.length ; i++) {
        if (binarray[i] == 0)  {
            binarray[i] = 1;
        } else binarray[i] = 0;

    }
        System.out.println(Arrays.toString(binarray));
    }
//      2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    private static void array2(){
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] =  (1+i);
        }
        System.out.println(Arrays.toString(array2));
    }
//    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
private static void array3(){
    int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < array3.length; i++) {
        if (array3[i] < 6) {
            array3[i] = array3[i] * 2;
        }
    }
    System.out.println(Arrays.toString(array3));
}
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    private static void array4() {
        int[][] array4 = new int[4][4];
        for (int i = 0; i < array4.length; i++) {
            array4[i][i] = 1;

        }
        for (int i = 0; i < array4.length; i++) {
                array4[i][array4.length -(1+i)] = 1;
        }
        for (int i = 0; i < array4.length; i++) {
            System.out.println(Arrays.toString(array4[i]));
        }
    }
//     5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    private static int[] arraymaker(int len, int initialValue ){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;

    }
//    6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    private static void minmaxArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("мин "+ min + " макс " + max);
    }
    //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    //**Примеры:
    //checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    //checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
    //
    //граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
    //

    //8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
    private static void method8(){
        
    }
}

