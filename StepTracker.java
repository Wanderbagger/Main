import java.util.Scanner;
public class StepTracker {
    StepTracker(
    ) {}
    public static void inputDailySteps(int[][]steps){
        Scanner scanner = new Scanner(System.in); // ввод статистики по дням
        int trainingDay = -1;
        int trainingMonth = -1;
        int dailySteps = -1;
        while (trainingMonth < 0 || trainingMonth > 11){
            System.out.println("Введите месяц (от 0 до 11, где 0 - январь, 11 - декабрь)");
            trainingMonth = scanner.nextInt();
            if (trainingMonth < 0 || trainingMonth > 11){
                System.out.println("Значение введено некорректно, попробуйте еще раз.");}
        }
        while (trainingDay < 0 || trainingDay > 29){
            System.out.println("Введите день (от 0 до 29, 0 - 1 число и т.д.)");
            trainingDay = scanner.nextInt();
            if (trainingDay < 0 || trainingDay > 29){
                System.out.println("Значение введено некорректно, попробуйте еще раз.");}
        }
        while (dailySteps < 0){
            System.out.println("Введите значение пройденных шагов");
            dailySteps = scanner.nextInt();
            if (dailySteps < 0){
                System.out.println("Значение введено некорректно, попробуйте еще раз.");}
        }
        steps[trainingMonth][trainingDay] = dailySteps;
        System.out.println("Введено значение:  "  + Converter.convertDay(trainingDay) + "-го " + Converter.convertMonth(trainingMonth) + " пройдено " + steps[trainingMonth][trainingDay] + " шагов.");

}
    public static void typeStatistic(int dailyGoal, int[][]steps){ // показ статистики
        Scanner scanner = new Scanner(System.in);
        int trainingMonth = -1;

        while (trainingMonth < 0 || trainingMonth > 11){

            System.out.println("Введите месяц (от 0 до 11, 0 - январь, 11 - декабрь)");
            trainingMonth = scanner.nextInt();
            if (trainingMonth < 0 || trainingMonth > 11){
                System.out.println("Значение введено некорректно, попробуйте еще раз.");}
        }
        System.out.println("Статистика " + Converter.convertMonth(trainingMonth) +": пройдено " + Calculator.calcMonthData(trainingMonth, steps) + " шагов.");
        System.out.println("Пройдено километров: " + Converter.convertKM(trainingMonth, steps));
        System.out.println("Сожжено килокалорий: " + Converter.convertCal(trainingMonth, steps));
        System.out.println("Лучший результат за месяц: " + Calculator.calcMax(trainingMonth, steps));
        System.out.println("Среднее количество шагов в день: " + Calculator.calcAverage(trainingMonth, steps));
        System.out.println("Лучшая серия: " + Calculator.calcStreak(trainingMonth, steps, dailyGoal) + " дней");
        System.out.println("Количество шагов по дням: " );
        Calculator.typeDailySteps(trainingMonth, steps);
    }
}




