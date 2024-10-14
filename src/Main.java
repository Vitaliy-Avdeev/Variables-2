public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Привет мир!");

        var taskOne = ("Задача №1");
        System.out.println(taskOne);
        byte integersByte = 25;
        System.out.println("Значение переменной byte с типом целочисленные равно " + integersByte);
        short integersShort = -32768;
        System.out.println("Значение переменной short с типом целочисленные равно " + integersShort);
        int integersInt = 2147483;
        System.out.println("Значение переменной int с типом целочисленные равно " + integersInt);
        long integersLong = 8223372556444665446L;
        System.out.println("Значение переменной long с типом целочисленные равно " + integersLong);
        float floatingFour = 27.12f;
        System.out.println("Значение переменной float с типом плавующей точки равно " + floatingFour);
        double floatingEight = 1.865553453453f;
        System.out.println("Значение переменной double с типом плавующей точки равно " + floatingEight);
        char symbol = 65;
        System.out.println("Значение переменной char с типом символьные равно " + symbol);
        boolean logics = false;
        System.out.println("Значение переменной boolean с типом логические равно " + logics);

        var taskTwo = ("Задача №2");
        System.out.println(taskTwo);

        float floatingFourBit = 27.12f;
        System.out.println(floatingFourBit);
        long integersLongBit = 987678965549L;
        System.out.println(integersLongBit);
        double floatingEightBit = 2.786;
        System.out.println(floatingEightBit);
        short integersShortBit = 569;
        System.out.println(integersShortBit);
        int integersIntBit = -159;
        System.out.println(integersIntBit);
        int integersIntBitBit = 27897;
        System.out.println(integersIntBitBit);
        byte integersByteBit = 67;
        System.out.println(integersByteBit);

        var taskThree = ("Задача №3");
        System.out.println(taskThree);
        int classA = 23;
        int classB = 27;
        int classC = 30;
        int totalSheets = 480;
        int everyoneSheets = (totalSheets / (classA + classB + classC));
        System.out.println("На каждого ученика рассчитано " + everyoneSheets + "-листов бумаги.");

        var taskFour = ("Задача №4");
        System.out.println(taskFour);
        int performanceTwoMinutes = 16;
        int performanceOneMinutes = performanceTwoMinutes / 2;
        int performanceTwentyMinutes = performanceOneMinutes * 20;
        System.out.println("За 20 минут машина произвела " + performanceTwentyMinutes + " штук бутылок.");
        int performanceOneDay = performanceOneMinutes * 60 * 24;
        System.out.println("За одни сутки машина произвела "  + performanceOneDay + " штук бутылок.");
        int performanceThreeDay = performanceOneDay * 3;
        System.out.println("За трое суток машина произвела "  + performanceThreeDay + " штук бутылок.");
        int performanceThirtyDay = performanceOneDay * 30;
        System.out.println("За месяц машина произвела "  + performanceThirtyDay + " штук бутылок.");

        var taskFive = ("Задача №5");
        System.out.println(taskFive);
        int totalCans = 120;
        int whiteCans = 2;
        int brownCans = 4;
        int totalClass = (totalCans / (whiteCans + brownCans));
        int totalWhiteCans = whiteCans * totalClass;
        int totalBrownCans = brownCans * totalClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок каричневой краски.");

        var taskSix = ("Задача №6");
        System.out.println(taskSix);
        int bananasWeight = 5 * 80;
        int milkWeight = 2 * 105;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        int breakfastWeight = (bananasWeight + milkWeight + iceCreamWeight + eggsWeight);
        System.out.println(breakfastWeight + " гр.");
        double breakfastWeightKilo = (breakfastWeight / 1000.0);
        System.out.println(breakfastWeightKilo + " кг.");

        var taskSeven = ("Задача №7");
        System.out.println(taskSeven );
        int totalWeightSum = 7 * 1000;
        int weightOne = totalWeightSum / 250;
        System.out.println(weightOne + " Дней уйдет на похудение если терять по 250 гр. в весе каждый день.");
        int weightTwo = totalWeightSum / 500;
        System.out.println(weightTwo + " Дней уйдет на похудение если терять по 500 гр. в весе каждый день.");
        int average = ((weightOne + weightTwo) / 2);
        System.out.println(average + " День в среднем уйдет на похудение.");

        var taskEight = ("Задача №8");
        System.out.println(taskEight);
        int mashaCurrent = 67760;
        int denisCurrent = 83690;
        int kristinaCurrent = 76230;
        int mashaCurrentAnnual = mashaCurrent * 12;
        int denisCurrentAnnual = denisCurrent * 12;
        int kristinaCurrentAnnual = kristinaCurrent * 12;
        int proc = 10;
        int mashaFuture = mashaCurrent + (mashaCurrent * proc) / 100;
        int mashaFutureAnnual = (mashaFuture * 12) - mashaCurrentAnnual;
        System.out.println("Маша теперь получает " + mashaFuture + " рублей. Годовой доход вырос на " + mashaFutureAnnual + " рублей.");
        int denisFuture = denisCurrent + (denisCurrent * proc) / 100;
        int denisFutureAnnual = (denisFuture * 12 - denisCurrentAnnual);
        System.out.println("Денис теперь получает " + denisFuture + " рублей. Годовой доход вырос на " + denisFutureAnnual + " рублей.");
        int kristinaFuture = kristinaCurrent + (kristinaCurrent * proc) /100;
        int kristinaFutureAnnual = (kristinaFuture * 12 - kristinaCurrentAnnual);
        System.out.println("Кристина теперь получает " + kristinaFuture + " рублей. Годовой доход вырос на " + kristinaFutureAnnual + " рублей.");
















    }
}