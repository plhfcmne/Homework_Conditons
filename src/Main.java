public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte age=20;
        if (age>=18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        }
        if (age<18) {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        float temperature=-6.2f;
        if (temperature>=5) {
            System.out.println("На улице "+temperature+" градусов, можно идти без шапки");
        }
        else {System.out.println("На улице "+temperature+" градусов, нужно надеть шапку ");
        }
    }


    public static void task3() {
        System.out.println("Задача 3");
        float speed=23.5f;
        if (speed>60) {
            System.out.println("Если скорость "+speed+" то придется заплатить штраф");
        }
        else {System.out.println("Если скорость "+speed+" то можно ездить спокойно ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte age=24;
        boolean canGoToKindergaten=age>=2 && age<=6;
        boolean canGoToSchool=age>=7 && age<=18;
        boolean canGoToUniversity=age>=18 && age<=24;
        if (canGoToKindergaten){System.out.println("Если возраст человека равен "+age+" , то ему нужно ходить в детский сад");
        }
        else
        if (canGoToSchool){System.out.println("Если возраст человека равен "+age+" , то ему нужно ходить в школу");
        }
        else if (canGoToUniversity){System.out.println("Если возраст человека равен "+age+" , то ему нужно ходить в университет");
        }
        else {System.out.println("Если возраст человека равен "+age+" , то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte age=14;
        boolean canNotGoToPark=age<5;
        boolean canGoToPark=age>=5 && age<14;
        if (canNotGoToPark){System.out.println("Если возраст ребенка равен "+age+" , то ему нельзя кататься на аттракционе");
        }
        else
        if (canGoToPark){System.out.println("Если возраст ребенка равен "+age+" , то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else {System.out.println("Если возраст ребенка равен "+age+" , то он может один кататься на аттракционе");
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        byte amount=102;
        byte seatingPlace=1;
        byte standingPlace=40;
        byte freeSeatingPlace=(byte)(60-seatingPlace);
        byte freeStandingPlace=(byte)(42-standingPlace);
        byte freeTickets=(byte)(amount-seatingPlace-standingPlace);
        boolean ThereAreFreeTicket=seatingPlace+standingPlace<102;
        if (ThereAreFreeTicket){System.out.println("Осталось свободных билетов "+freeTickets+" , из низ сидячих мест - "+freeSeatingPlace+" , мест стоя -"+freeStandingPlace);
        }
        else
         {System.out.println("Свободных билетов нет");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one=1;
        int two=5;
        int three=-13;

        if (one>two&&two<=three) {System.out.println("Максимальное число "+one);}
            else if (two>three) {System.out.println("Максимальное число "+two);}
                 else if (two==three&&two==one){System.out.println("Все числа равны "+three);}
                 else {System.out.println("Максимальное число "+three);}
                           }
}