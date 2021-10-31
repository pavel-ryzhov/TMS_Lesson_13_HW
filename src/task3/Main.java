package task3;

import java.util.Scanner;

/**
 * Создать обобщенный функциональный интерфейс.
 * Написать класс с одним методом (подумать и аргументировать решение о том будет ли это статический метод или нет).
 * В этом методе реализуйте логику:
 * 	- если в консоль введена цифра 1, то: использования интерфейса со строковым типом и передать в метод интерфейса логику реверса строки(вывода строки в оfoбратном порядке).
 *
 * 	- если в консоль введена цифра 2, то: использования интерфейса с целочисленным типом и передать в метод интерфейса логику нахождения факториала числа.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1 или 2");
        int interfaceFunction = scanner.nextInt();

        if (interfaceFunction == 1){
            FunctionalInterface<String> stringFunctionalInterface = str -> new StringBuilder(str).reverse().toString();
            System.out.println("Введите строку");
            System.out.println(stringFunctionalInterface.execute(new Scanner(System.in).nextLine()));
        }
        if (interfaceFunction == 2){
            FunctionalInterface<Integer> integerFunctionalInterface = a -> {
                int result = 1;
                for (int i = 1; i <= a; i++) {
                    result *= i;
                }
                return result;
            };
            System.out.println("Введите число");
            System.out.println(integerFunctionalInterface.execute(scanner.nextInt()));
        }
        /*
        Данная логика может находиться в статическом методе, т.к. она не взаимодействует с полями/методами конкретного экземпляра класса.
         */
    }
}
