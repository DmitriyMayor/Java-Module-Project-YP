
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int speed;

        Race race = new Race();

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
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

                if (speed < 250 && speed > 0) {
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