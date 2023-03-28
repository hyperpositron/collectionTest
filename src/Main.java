import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] numberArray = {3, 3, 3, 3, 3};                       // обычный массив
        // List<Integer> numbersList = List.of(0, 1, 2);               // коллекции НЕ ИЗМЕНЯЕМЫЕ (если попытаемся изменить содержимое ,вылезит ексепшен)
        List<Integer> numbersList = new ArrayList<>(List.of(4, 4, 4)); // коллекции   ИЗМЕНЯЕМЫЕ


        System.out.println(Arrays.toString(numberArray)); // вывести в консоли обычный массив
        System.out.println(numbersList);                  // вывести в консоли коллекции

        System.out.println(numberArray[0]);               // вывести в консоль  содержимое под индексом (numberArray[0]) в обычном массиве
        System.out.println(numbersList.get(0));           // вывести в консоль  содержимое под индексом (numbersList.get(0) в коллекциях

        numberArray[2] = 10;                              // изменить значение под [2] индексом в обычном массиве Integer[] numberArray = {3, 3, 3, 3, 3};
        System.out.println("обычный массив c измененным индексом [2] = "+Arrays.toString(numberArray));   // вывести в консоль

        numbersList.set(1, 10);                 // изменить значение под [1] индексом в обычном массиве new ArrayList<>(List.of(4, 4, 4));
        System.out.println(numbersList.get(1)); // вывести в консоль  содержимое под индексом (numbersList.get(0) в коллекциях
        System.out.println(numbersList);        // вывести в консоли коллекции

    }
}