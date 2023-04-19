import java.util.Scanner;

class ScannerNumber {

    static int number = getNumberFromInput();

    protected static int getNumberFromInput() {
        System.out.println("Input integer number, please: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int getNumber() {
        return number;
    }
}
