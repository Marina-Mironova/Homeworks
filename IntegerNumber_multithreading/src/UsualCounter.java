public class UsualCounter {
    public static int countNumber(int number) {
        int counter = 0;

        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE ; i++) {
            if (i % number == 0) {

                counter++;
            }

        }

        return counter;
    }
}
