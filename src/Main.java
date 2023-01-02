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
        char clientOS = 0;
        switch (clientOS){
            case 0 :
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1 :
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Данный тип ОС не поддерживается");
                break;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int release = 2011;
        char clientOS = 0;
        switch (clientOS){
            case 0 :
                if (release > 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }else{
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }

                break;
            case 1 :
                if (release > 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }else{
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Данный тип ОС не поддерживается");
                break;
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2000;
        if (year % 400 == 0){
            System.out.println(year + " год является високосным");
        }else if (year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 0;
        if (deliveryDistance > 100)
        {
            System.out.println("доставки нет");
            return;

        }else if (deliveryDistance > 0){
            deliveryTime+=1;
            if (deliveryDistance >20){
                deliveryTime+=1;
                if (deliveryDistance > 60){
                    deliveryTime+=1;
                }
            }
        }
        System.out.println("Потребуется дней " + deliveryTime);

    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 12:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некоректный ввод данных");
        }
    }
}