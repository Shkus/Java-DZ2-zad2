import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int account = 100; // количество денег на текущем счету пользователя
        int addition = 900; // сумма пополнения счета пользователя

        int bonus = 100; // количество бонусов на текущем счету пользователя
        int costBonus = 100; // стоимость одного бонуса

        int calculationBonus = addition / costBonus; // Расчет бонусов
        int totalBonus = bonus + calculationBonus; // Итоговое количество бонусных рублей
        int finalScore = account + addition; // Итоговое количество денег на счету пользователя

        if (addition >= 1000) {

            System.out.println("Итоговый счет:" + finalScore + "руб." + " Количество бонусных рублей: " + totalBonus + "руб.");
        } else {

            System.out.println("Итоговый счет:" + finalScore + "руб." + " Количество бонусных рублей: " + bonus + "руб.");
        }
    }
}