public class Converter { // класс конвертер для преобразования шагов в КМ, калории, номера месяца в название
    Converter() {}

    public static double convertCal(int trainingMonth, int[][] steps) { // конвертируем шаги в калории
        double dataCal = steps[trainingMonth][30] * 0.05;
        return dataCal;
    }

    public static double convertKM(int trainingMonth, int[][] steps) { // конвертируем шаги в км
        double dataKM = steps[trainingMonth][30] * 0.00075;
        return dataKM;
    }

    public static String convertMonth(int trainingMonth) { // конвертируем номер месяца в название
        String monthName = "";
        if (trainingMonth == 0) {
            monthName = "января";
        } else if (trainingMonth == 1) {
            monthName = "февраля";
        } else if (trainingMonth == 2) {
            monthName = "марта";
        } else if (trainingMonth == 3) {
            monthName = "апреля";
        } else if (trainingMonth == 4) {
            monthName = "мая";
        } else if (trainingMonth == 5) {
            monthName = "июня";
        } else if (trainingMonth == 6) {
            monthName = "июля";
        } else if (trainingMonth == 7) {
            monthName = "августа";
        } else if (trainingMonth == 8) {
            monthName = "сентября";
        } else if (trainingMonth == 9) {
            monthName = "октября";
        } else if (trainingMonth == 10) {
            monthName = "ноября";
        } else if (trainingMonth == 11) {
            monthName = "декабря";

        }
        return monthName;}


    public static int convertDay(int trainingDay) {
        return trainingDay + 1;
    }
}