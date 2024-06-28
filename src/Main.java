public class Main {
    public static void main(String[] args) {

//Ex1
        int age = 12;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }

//Ex2
        int temperature = 6;

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

//Ex3
        int speed = 50;

        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

//Ex4
        int peoplesAge = 15;

        if (peoplesAge > 2 && peoplesAge <= 6) {
            System.out.println("Если возраст человека равен " + peoplesAge + ", то ему нужно ходить в детский сад");
        } else if (peoplesAge > 7 && peoplesAge <= 17) {
            System.out.println("Если возраст человека равен " + peoplesAge + ", то ему нужно ходить в школу");
        } else if (peoplesAge >= 18 && peoplesAge <= 24) {
            System.out.println("Если возраст человека равен " + peoplesAge + ", то ему нужно ходить в университет");
        } else if (peoplesAge > 24) {
            System.out.println("Если возраст человека равен " + peoplesAge + ", то ему нужно ходить на работу");
        }

//Ex5
        int childrensAge = 8;

        if (childrensAge < 5) {
            System.out.println("Если возраст ребенка равен " + childrensAge + ", то ему нельзя кататься на аттракционе");
        } else if (childrensAge >= 5 && childrensAge < 14) {
            System.out.println("Если возраст ребенка равен " + childrensAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childrensAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

//Ex6
        int vanCapacity = 102;
        int sitingCapacity = 60;
        int countPpl = 20;

        if (countPpl < sitingCapacity) {
            System.out.println("В вагоне есть сидячие места");
        } else if (countPpl >= sitingCapacity && countPpl < vanCapacity) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            System.out.println("В вагоне нет мест");
        }

//Ex7
        int one = 7;
        int two = 5;
        int three = 9;

        if (one == two || one == three || two == three) {
            System.out.println("Введите разные числа!");
        } else {
            if (one > two) {
                if (one > three) {
                    System.out.println("Число " + one + " больше остальных");
                } else if (three > two) {
                    System.out.println("Число " + three + " больше остальных");
                } else {
                    System.out.println("Число " + two + " больше остальных");
                }
            } else if (two > three) {
                System.out.println("Число " + two + " больше остальных");
            } else {
                System.out.println("Число " + three + " больше остальных");
            }
        }
    }
}