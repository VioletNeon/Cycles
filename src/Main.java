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
    }
}