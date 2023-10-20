import java.util.Scanner;

import java.util.Date;

import java.text.SimpleDateFormat;

public class mr_robot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        // Получаем текущее время и дату
        Date currentData = new Date();
        // Форматируем дату в строку в виде "день месяц год час:минута"
        SimpleDateFormat dataformat = new SimpleDateFormat("dd MM yyyy HH:mm");
        String currentTime = dataformat.format(currentData);
        // Выводим приветствие и текущее время
        System.out.println("Welcome, " + name + "!");
        System.out.println("Today is " + currentTime);
        scanner.close();
    }

}