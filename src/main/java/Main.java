
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int speed;

        Race race = new Race();

        Scanner scanner = new Scanner(System.in);

        int carsNumber = 3;

        for (int i = 1; i <= carsNumber; i++) {
            System.out.println("Введите название машины № " + i);
            name = scanner.next();
            while (true) {
                System.out.println("Введите скорость машины № " + i);

                while (true) {
                    if (scanner.hasNextInt()) {
                        speed = scanner.nextInt();
                        break;
                    } else {
                        scanner.next();
                    }
                        System.out.println("Некорректный ввод! Введите целое число.");
                }

                int maxSpeed = 250;
                int minSpeed = 0;

                if (maxSpeed >= speed && speed > minSpeed) {
                    break;
                }
                System.out.println("Некорректная скорость, повторите ввод!");
            }

            Car car = new Car(name, speed);
            race.leaderCalculation(car);
        }

        System.out.println("Самая быстрая машина: " + race.leader);
        scanner.close();
    }
}