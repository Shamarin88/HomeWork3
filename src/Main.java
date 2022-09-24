public class Main {
    public static void main(String[] args) {

        // Задача 1

        int houseNumber = 1;
        byte streetNumber = 127;
        long phoneNumber = 78957638;
        float priceNumber = 24.68F;
        double clientMoney = 35.67;

        System.out.println("Значение переменной с типом int равно " + houseNumber);
        System.out.println("Значение переменной с типом byte равно " + streetNumber);
        System.out.println("Значение переменной с типом long равно " + phoneNumber);
        System.out.println("Значение переменной с типом float равно " + priceNumber);
        System.out.println("Значение переменной с типом double равно " + clientMoney);

        //Задача 2

        double num1 = 27.12;
        long num2 = 987678965549L;
        float num3 = 2.786F;
        boolean num4 = false;
        short num5 = 569;
        int num6 = -159;
        char num7 = 27897;
        byte num8 = 67;

        // Задача 3

        byte firstTeacher = 23;
        short secondTeacher = 27;
        char thirdTeacher = 30;
        int paperForAll = 480;
        int paperForEachStudent = (paperForAll / (firstTeacher + secondTeacher + thirdTeacher));

        System.out.println("На каждого ученика рассчитано " + paperForEachStudent + " листов бумаги");

        // Задача 4

        int bottlePerTwoMinutes = 16;
        int bottlePerOneMinutes = (bottlePerTwoMinutes / 2);

        int bottlePerTwentyMinutes = (bottlePerOneMinutes * 20);

        System.out.println("За 20 минут машина произвела бутылок " + bottlePerTwentyMinutes + " штук");

        int bottlePerDay = (bottlePerOneMinutes * 60 * 24);

        System.out.println("За сутки машина произвела бутылок " + bottlePerDay + " штук");

        int bottlePerThreeDays = (bottlePerDay * 3);

        System.out.println("За 3 дня машина произвела бутылок " + bottlePerThreeDays + " штук");

        int bottlePerMonth = (bottlePerDay * 30);

        System.out.println("За 1 месяц машина произвела бутылок " + bottlePerMonth + " штук");

        // Задача 5

        int allPaintBottle = 120;
        int whiteBottlePerClass = 2;
        int brownBottlePerClass = 4;

        int allClass = (allPaintBottle / (whiteBottlePerClass + brownBottlePerClass));
        int allWhiteBottle = (allClass * whiteBottlePerClass);
        int allBrownBottle = (allClass * brownBottlePerClass);

        System.out.println("В школе где " + allClass + " классов, нужно " + allWhiteBottle + " банок белой краски и " + allBrownBottle + " банок коричневой краски");

        // Задача 6

        int allBananas = (80 * 5);
        int allMilk = (105 * 200);
        int allIceCream = (100 * 2);
        int allEggs = (70 * 4);

        System.out.println(("Общий вес рецепта в киллограммах равен " + (allBananas + allMilk + allIceCream + allEggs) / 1000) + " кг");

        // Задача 7

        int weight = 7000;
        int weightPerDay1 = 250;
        int weightPerDay2 = 500;

        int average1 = weight / weightPerDay1;
        int average2 = weight / weightPerDay2;
        int average3 = (average1 + average2) / 2;

        System.out.println(("Необходимо " + average1) + " дней для похудения");
        System.out.println(("Необходимо " + average2) + " дней для похудения");
        System.out.println("В среднем необходим " + average3 % average1 + " день для похудения");

        // Задача 8

        int firstEmployee = 67760;
        int secondEmployee = 83690;
        int thirdEmployee = 76230;

        double firstEmployeeNew = ((firstEmployee * 0.1) + firstEmployee);
        double secondEmployeeNew = ((secondEmployee * 0.1) + secondEmployee);
        double thirdEmployeeNew = ((thirdEmployee * 0.1) + thirdEmployee);

        System.out.println("Маша теперь получает " + (firstEmployeeNew * 12) + " рублей. Годовой доход вырос на " + (firstEmployeeNew * 12 - firstEmployee * 12));
        System.out.println("Денис теперь получает " + (secondEmployeeNew * 12) + " рублей. Годовой доход вырос на " + (secondEmployeeNew * 12 - secondEmployee * 12));
        System.out.println("Кристина теперь получает " + (thirdEmployeeNew * 12) + " рублей. Годовой доход вырос на " + (thirdEmployeeNew * 12 - thirdEmployee * 12));
    }
}
