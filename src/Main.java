public class Main {
    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1(){
        System.out.println("Task1");
        int a1 = 1;
        byte a2 = 2;
        short a3 = 3;
        long a4 = 4;
        float a5 = 5.5F;
        double a6 = 6.6;
        System.out.println(" Значение переменной а1 с типом int равно " + a1);
        System.out.println(" Значение переменной а2 с типом byte равно " + a2);
        System.out.println(" Значение переменной а3 с типом short равно " + a3);
        System.out.println(" Значение переменной а4 с типом long равно " + a4);
        System.out.println(" Значение переменной а5 с типом float равно " + a5);
        System.out.println(" Значение переменной а6 с типом double равно " + a6);
    }

    public static void task2(){
        System.out.println("\nTask2");
            double x = 27.12;
            double x2 = 9876789.65549*100000;//при использовании long выдало ошибку::30:23
        //java: integer number too large.
            double x3 = 2.786;
            int x4 = 569;
            short x5 = -159;
            int x6 = 27897;
            byte x7 = 67;
        System.out.printf("%f %f %f %d %d %d %d\n", x, x2, x3, x4, x5, x6, x7);

    }

    public static void task3(){
        System.out.println("\nTask3");
        double answer =480/(23+27+30);//не л будет ли число целым, и решил что точность важна
        System.out.printf("На каждого ученика рассчитано %f листов бумаги\n", answer);
    }

    public static void task4(){
        System.out.println("\nTask4");
        byte time1 = 20;
        int time2 = 60*24;
        int time3= time2*3;
        int time4 = time2*31;
        int answer1 = time1 * 8;
        int answer2 = time2 * 8;
        int answer3 = time3 * 8;
        int answer4 = time4 * 8;
        System.out.printf(" За 20 минут машина произвела %d штук бутылок",answer1);
        System.out.printf("\n За сутки машина произвела %d штук бутылок",answer2);
        System.out.printf("\n За 3 суток машина произвела %d штук бутылок",answer3);
        System.out.printf("\n За 1 месяц машина произвела %d штук бутылок\n",answer4);
    }

    public  static void task5 (){
        System.out.println("\nTask5");
        byte answerClass = 120/(2+4);
        int answerWhiteColour = answerClass+answerClass;
        int answerBrownColour = answerWhiteColour+answerWhiteColour;
        System.out.printf("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски\n",answerClass,answerWhiteColour,answerBrownColour);
    }

    public  static void task6 (){
        System.out.println("\nTask6");
        int answer = (5 * 80 + 2 * 105 + 200 + 70 * 4);
        double answerKilo = answer*0.001;// просто интересно - почему он автоматически округлял результат при делении на 1000?
        System.out.printf ("В граммах %d В килограммах %f\n",answer,answerKilo);
    }

    public  static void task7 (){
        System.out.println("\nTask7");
        double numberOne = 0.25;
        double numberSecond = 0.5;
        double numberMiddle = numberSecond+numberOne/2;
        double answerOne = 7/numberOne;
        double answerSecond = 7/numberSecond;
        double answerMiddle = 7/numberMiddle;
        System.out.printf("Если терять 250 г, то %f дней \nЕсли 500 г, то %f \nВ среднем понадобиться около %f дней\n",answerOne,answerSecond,answerMiddle);
    }

    public  static void task8 (){
        System.out.println("\nTask8");
        int moneyMashy = 67760;
        int moneyDeni = 83690;
        int moneyCrysty = 76230;
        int answerOne = moneyMashy/10 + moneyMashy;
        int answerSecond = moneyDeni/10 + moneyDeni;
        int answerThree = moneyCrysty/10 + moneyCrysty;
        int ravnicaIne = answerOne*12 - moneyMashy*12 ;
        int raznicaTwo = answerSecond*12 - moneyDeni*12 ;
        int raznicaThree = answerThree*12 - moneyCrysty*12 ;
        System.out.printf(" Маша теперь получает %d рублей. Годовой доход вырос на %d рублей",answerOne,ravnicaIne);
        System.out.printf("\n Денис теперь получает %d рублей. Годовой доход вырос на %d рублей",answerSecond,raznicaTwo);
        System.out.printf("\n Кристина теперь получает %d рублей. Годовой доход вырос на %d рублей",answerThree,raznicaThree);
    }
}
