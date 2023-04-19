// Взять  пример расчетной задачи (см. слайды к занятию)
//
//
//
//    задача 1: посчитать количество целых чисел в диапазоне от Integer.MINVALUE до Integer.MAXVALUE,
//    которые делятся на заданное целое число без остатка.
//    Решить данную задачу последовательно и параллельно в нескольких потоках. Сравнить время выполнения.



public class ThreadAndUsualCompare {


    public static void main(String[] args) {


        int number = ScannerNumber.getNumber();
        long start = System.currentTimeMillis();
        System.out.println("Numbers: " + UsualCounter.countNumber(number));
        System.out.println("Time for this method: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        ThreadCounter.countNumberMultithreading();

        System.out.println("Time for this method: " + (System.currentTimeMillis() - start));

    }





    }
