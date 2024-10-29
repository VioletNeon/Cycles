public class Main {
    public static void main(String[] args) {
        System.out.println("Задание_1");
        for (byte i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n" + "Задание_2");
        for (byte i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("\n" + "Задание_3");
        for (byte i = 0; i <= 17; i = (byte) (i + 2)) {
            System.out.println(i);
        }

        System.out.println("\n" + "Задание_4");
        for (byte i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("\n" + "Задание_5");
        for (short i = 1904; i <= 2096; i = (short) (i + 4)) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("\n" + "Задание_6");
        for (byte i = 7; i <= 98; i = (byte) (i + 7)) {
            System.out.println(i);
        }

        System.out.println("\n" + "Задание_7");
        for (short i = 1; i <= 512; i = (short) (i * 2)) {
            System.out.println(i);
        }

        System.out.println("\n" + "Задание_8");
        int amountOfSavings = 0;
        int monthlySavings = 29_000;

        for (byte i = 1; i <= 12; i++) {
            amountOfSavings = amountOfSavings + monthlySavings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + amountOfSavings + " рублей");
        }

        System.out.println("\n" + "Задание_9");
        amountOfSavings = 0;

        for (byte i = 1; i <= 12; i++) {
            amountOfSavings = amountOfSavings + amountOfSavings/100;
            amountOfSavings = amountOfSavings + monthlySavings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + amountOfSavings + " рублей");
        }

        System.out.println("\n" + "Задание_10");
        for (short i = 1; i <= 10; i++) {
            byte resultOfMultiplicationByTwo = (byte) (i * 2);

            System.out.println("2" + "*" + i + "=" + resultOfMultiplicationByTwo);
        }
    }
}