public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {System.out.println("Ошибка. операционная система указана неверно");}
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 0;
        short clientDevice=2004;
        if (clientDevice <= 2015) {
            System.out.print("Установите облегченную версию");
            if (clientOS==1) {
                System.out.println(" для Android");
            } else {System.out.println(" для IOS");
        }
        } else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
    }


    public static void task3() {
        System.out.println("Задача 3");
       int year=6000;
       int a=year%4;
       int b=year%100;
       int c=year%400;
        if (a!=0) {
            System.out.println("Год невисокосный");
            }
        else if (b!=0) {System.out.println("Год високосный");
            }
        else if (c==0) {System.out.println("Год високосный");
        }
        else {System.out.println("Год невисокосный");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
       float deliveryDistance=100.1f;
       byte term=1;
       boolean a=deliveryDistance<20;
       boolean b=deliveryDistance>=20&&deliveryDistance<60;
       boolean c=deliveryDistance>=60&&deliveryDistance<100;

       if (a) {
           System.out.println("Потребуется дней для доставки: "+term);
       } else if (b) {
           System.out.println("Потребуется дней для доставки: "+(term+1));
       } else if (c) {
           System.out.println("Потребуется дней для доставки: "+(term+2));
       }
       else {System.out.println("Свыше 100 км доставки нет");
       }

    }

    public static void task5() {
        System.out.println("Задача 5");
         byte monthNumber=5;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого месяца нет, введите значение месяца в диапазоне от 1 до 12");
        }

    }

}
