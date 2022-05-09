public class Calculator { // класс калькулятор для подсчета статистики
    Calculator() {}
    public static int calcMax(int trainingMonth, int[][] steps) { // считаем максимальное количество шагов
        int maxSteps = 0;
        for (int j = 0; j < 30; j++)
            if (steps[trainingMonth][j] > maxSteps) {
                maxSteps = steps[trainingMonth][j];
            }
        return maxSteps;
    }
    public static int calcAverage(int trainingMonth, int[][] steps) {

        return steps[trainingMonth][30] / 30; // считаем среднее количество шагов
    }
    public static int calcStreak(int trainingMonth, int[][] steps, int dailyGoal) {
        // считаем лучшую серию шагов
        int counter = 0;
        int maxCounter = 0;
        for (int j = 0; j < 30; j++)
            if (steps[trainingMonth][j] > dailyGoal) {
                counter++;
                if (maxCounter < counter) {
                    maxCounter = counter;
                }
            } else {
                counter = 0;
            }
        return maxCounter;
    }
    public static void typeDailySteps(int trainingMonth,int[][]steps){ // выбираем дни с шагами и выводим о них статистику
        for (int j = 0; j < 30; j++)
        {
            if(steps[trainingMonth][j] > 0) {
                System.out.println(Converter.convertDay(j) + "-е " + Converter.convertMonth(trainingMonth) + ": " + steps[trainingMonth][j] + " шагов");
            }
        }
    }
    public static int calcMonthData(int trainingMonth,int[][] steps) { // считаем месячное колиество шагов
        steps[trainingMonth][30] = 0;
        for (int j = 0; j < 30; j++)
            steps[trainingMonth][30] = steps[trainingMonth][30] + steps[trainingMonth][j];
        return steps[trainingMonth][30];
    }
}

