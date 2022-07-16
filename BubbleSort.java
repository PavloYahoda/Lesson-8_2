
public class BubbleSort implements Sort{

    @Override
    public int[] sort(int[] myArray) {
        int counter;
        do {
            counter = 0; //обнуляем каунтер
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i + 1]) { //сравниваем рядом стоящие значения
                    int temp = myArray[i + 1]; // вводим буферную переменную и присваиваем ей меньшее значение
                    myArray[i + 1] = myArray[i]; //второму числу присваиваем большее значение
                    myArray[i] = temp; //первому числу присваиваем меньшее значение
                    ++counter;//если не 0, то цикл повторяется.
                }
            }
        } while (counter > 0); //если 0, то цикл останавливается
        return myArray;

    }
}

