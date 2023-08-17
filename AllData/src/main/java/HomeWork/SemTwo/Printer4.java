package HomeWork.SemTwo;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.io.BufferedReader;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;


class Calculator {
    public int calculate(char op, int a, int b) {
        // Введите свое решение ниже
        try {
            File log = new File("log.txt");
            FileWriter fileWriter = new FileWriter(log);

            long infoTime = System.currentTimeMillis();
            Date date = new Date(infoTime);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String message = format.format(date);


            int result;
            switch (op) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a / b;
                    break;
                default:
                    result = -1;
                    break;

            }
            String Element1 = String.format("User entered the first operand = {%d}", a);
            String Element2 = String.format("User entered the operation = {%c}", op);
            String Element3 = String.format("User entered the second operand = {%d}", b);
            String Element4 = String.format("Result is {%d}", result);

            fileWriter.write(message + " " + Element1 + "\n");
            fileWriter.write(message + " " + Element2 + "\n");
            fileWriter.write(message + " " + Element3 + "\n");
            fileWriter.write(message + " " + Element4 + "\n");


            fileWriter.flush();
            fileWriter.close();
            return result;
        } catch (IOException e) {
            return -1;
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer4 {

    private static final String LOG_FILE_PATH = "log.txt";

    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        clearLogFile();
        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);

        try (BufferedReader br = new BufferedReader(new FileReader(LOG_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void clearLogFile() {
        File logFile = new File(LOG_FILE_PATH);
        if (logFile.exists()) {
            try {
                FileWriter fileWriter = new FileWriter(logFile, false);
                fileWriter.write("");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}