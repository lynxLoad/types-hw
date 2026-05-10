//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println();

        // Задача 1
        int age = 25;
        byte count = 100;
        short distance = 32000;
        long population = 7800000000L;
        float price = 19.99f;
        double pi = 3.14159265359;

        System.out.println("ЗАДАЧА 1");
        System.out.println("Значение переменной age с типом int равно " + age);
        System.out.println("Значение переменной count с типом byte равно " + count);
        System.out.println("Значение переменной distance с типом short равно " + distance);
        System.out.println("Значение переменной population с типом long равно " + population);
        System.out.println("Значение переменной price с типом float равно " + price);
        System.out.println("Значение переменной pi с типом double равно " + pi);
        System.out.println("-------------------------------");

        // Задача 2
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        System.out.println("ЗАДАЧА 2");
        System.out.println();
        System.out.println("-------------------------------");

        // Задача 3
        byte LPStuds = 23;
        byte ASStuds = 27;
        byte EAStuds = 30;
        byte allStuds = (byte) (LPStuds + ASStuds + EAStuds);
        short allSheets = 480;
        byte sheetsPerStudent = (byte) (allSheets / allStuds);

        System.out.println("ЗАДАЧА 3");
        System.out.println("На каждого ученика рассчитано" + sheetsPerStudent + " листов бумаги");
        System.out.println("-------------------------------");

        // Задача 4
        byte min2Perf = 16;
        byte minPerf = (byte) (min2Perf / 2);
        short perfMin20 = (short) (minPerf * 20);
        short day = (short) (minPerf * 60 * 24);
        int day3 = day * 3;
        int month = day * 30;

        System.out.println("ЗАДАЧА 4");
        System.out.println("За 20 минут машина произвела " + perfMin20 + " бутылок");
        System.out.println("За сутки машина произвела " + day + " бутылок");
        System.out.println("За 3 дня машина произвела " + day3 + " бутылок");
        System.out.println("За 1 месяц машина произвела " + month + " бутылок");
        System.out.println("-------------------------------");

        // Задача 5
        byte allCans = 120;
        byte classWhiteCans = 2;
        byte classBrownCans = 4;
        byte classCans = (byte) (classWhiteCans + classBrownCans);
        byte allClasses = (byte) (allCans / classCans);
        byte allWhiteCans = (byte) (allClasses * classWhiteCans);
        byte allBrownCans = (byte) (allClasses * classBrownCans);

        System.out.println("ЗАДАЧА 5");
        System.out.println("В школе, где " + allClasses + " классов, нужно " + allWhiteCans + " банок белой краски и " + allBrownCans + " банок коричневой краски");
        System.out.println("-------------------------------");

        // Задача 6
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;

        short allGrams = (short) (bananas + milk + iceCream + eggs);
        float allKgs = (float) allGrams / 1000;

        System.out.println("ЗАДАЧА 6");
        System.out.println("Вес завтрака: " + allGrams + " граммов");
        System.out.println("Вес завтрака: " + allKgs + " кг");
        System.out.println("-------------------------------");

        // Задача 7
        short grams = 7000;
        short perDay250 = 250;
        short perDay500 = 500;
        byte dayNeed250 = (byte) (grams / perDay250);
        byte dayNeed500 = (byte) (grams / perDay500);
        byte avgDays = (byte) ((dayNeed250 + dayNeed500) / 2);

        System.out.println("ЗАДАЧА 7");
        System.out.println("При потере 250 г в день потребуется " + dayNeed250 + " дней");
        System.out.println("При потере 500 г в день потребуется " + dayNeed500 + " дней");
        System.out.println("В среднем потребуется " + avgDays + " день");
        System.out.println("-------------------------------");

        // Задача 8
        int salMasha = 67760;
        int salDenis = 83690;
        int salKristina = 76230;

        int upSalMasha = (int) (salMasha * 1.1);
        int upSalDenis = (int) (salDenis * 1.1);
        int upSalKristina = (int) (salKristina * 1.1);

        int difSalMasha = (upSalMasha * 12) - (salMasha * 12);
        int difSalDenis = (upSalDenis * 12) - (salDenis * 12);
        int difSalKristina = (upSalKristina * 12) - (salKristina * 12);

        System.out.println("Маша теперь получает " + upSalMasha + " рублей. Годовой доход вырос на " + difSalMasha + " рублей");
        System.out.println("Денис теперь получает " + upSalDenis + " рублей. Годовой доход вырос на " + difSalDenis + " рублей");
        System.out.println("Кристина теперь получает " + upSalKristina + " рублей. Годовой доход вырос на " + difSalKristina + " рублей");
    }
}