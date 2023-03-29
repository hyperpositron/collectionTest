import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] numberArray = {3, 3, 3, 3, 3};                             // обычный массив
     // List<Integer> numbersList = List.of(0, 1, 2);                        // коллекции НЕ ИЗМЕНЯЕМЫЕ (если попытаемся изменить содержимое ,вылезит ексепшен)
        List<Integer> numbersList = new ArrayList<>(List.of(1, 2, 3));       // Листы   ИЗМЕНЯЕМЫЕ  Java 11
     // List<Integer> numbersList = new ArrayList<>(Arrays.asList(4, 4, 4)); // Листы   ИЗМЕНЯЕМЫЕ  Java 8


        System.out.println(Arrays.toString(numberArray)); // вывести в консоли обычный массив
        System.out.println(numbersList);                  // вывести в консоли Лист

        System.out.println(numberArray[0]);               // вывести в консоль  содержимое под индексом (numberArray[0]) в обычном массиве
        System.out.println(numbersList.get(0));           // вывести в консоль  содержимое под индексом (numbersList.get(0) в Листах

        numberArray[2] = 10;                              // изменить значение под [2] индексом в обычном массиве Integer[] numberArray = {3, 3, 3, 3, 3};
        System.out.println("обычный массив c измененным индексом [2] = "+Arrays.toString(numberArray));   // вывести в консоль

        numbersList.set(1, 10);                 // изменить значение под [1] индексом в обычном массиве new ArrayList<>(List.of(4, 4, 4));
        System.out.println(numbersList.get(1)); // вывести в консоль  содержимое под индексом (numbersList.get(0) в Листа
        System.out.println(numbersList);        // вывести в консоли Листа

        System.out.println("длина обычного массива: "+numberArray.length); // узнать какая длина обычного массива
        System.out.println("длина у Листа: "+numbersList.size()); // узнать какая длина у Листа

        numbersList.add(4);                      // Метод add добавит нашу черверку в конец списка
        numbersList.add(4);                      // Метод add добавит нашу черверку в конец списка
        numbersList.add(4);                      // Метод add добавит нашу черверку в конец списка
        numbersList.add(4);                      // Метод add добавит нашу черверку в конец списка
        System.out.println(numbersList);

        int firstNumber = numbersList.get(0);    // В этой ситуации в переменную firstNumber «ляжет» значение 4
        System.out.println(firstNumber);

        if (numbersList.contains(4)) {           // С помощью метода contains можно определить, имеется ли элемент в списке.
            System.out.println("В нашем списке имеется значение 4");
        }
        numbersList.remove(3);             // Удалить элемент из списка можно методом remove.
        System.out.println(numbersList);

        numbersList.remove((Integer) 1);        //Чтобы удалить число 1 из списка чисел, нужно закастить
        System.out.println(numbersList);        //(то есть привести один тип к другому) его к обертке.
                                                //В этой ситуации будет вызван другой метод remove,
                                                // который удалит непосредственно объект по содержанию, а не по номеру ячейки.

        //List<Integer> linkedNums = new LinkedList<>();

        System.out.println("длина у Листа: "+numbersList.size()); // узнать какая длина у Листа

    }
}