import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dailyGoal = 1000; // установили ежедневную цель
        int[][] steps;
        steps = new int[12][31]; // создали двумерный массив для хранения данных о ежедневных шагах, 31-я ячейка - для месячной суммы (чтобы не создавать еще один одномерный массив)

        while (true)  {
            Scanner scanner = new Scanner(System.in);
            printMenu();
            int userInput = scanner.nextInt();
            if (userInput == 1) { // ввод шагов за день
                StepTracker.inputDailySteps(steps);
            } else if (userInput == 2) { // показ статистики
                StepTracker.typeStatistic(dailyGoal,steps);
            } else if (userInput == 3) { // новая цель
                System.out.println("Введите новую ежедневную цель ");
                dailyGoal = scanner.nextInt();
                System.out.println("Новая ежедневная цель: " + dailyGoal + " шагов");
            } else if (userInput == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }
    public static void printMenu() { // меню пользователя
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 -Выйти из приложения");
    }
}


