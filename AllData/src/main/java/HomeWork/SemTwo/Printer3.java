package HomeWork.SemTwo;

class Answer2 {
    public static void answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3) {
        // Напишите свое решение ниже
        String empty = "";
        String temp = JSON.replace("\"", empty).replaceAll("\\s+", empty)
                .replace("[", empty).replace("]", empty);

        StringBuilder inString = new StringBuilder(temp);
        StringBuilder outString = new StringBuilder();
        int indexDevider = inString.indexOf(",",inString.indexOf("}") + 1);
        while (indexDevider > 0) {
            inString.insert(indexDevider+1,"__,");
            indexDevider = inString.indexOf(",",inString.indexOf("}",indexDevider) + 1);
        }
        temp = inString.toString();
        temp = temp.replace("{",empty).replace("}",empty);
        String[] data = temp.split(",__,");
        for (int i = 0; i < data.length;i++){
            String[] innerData = data[i].split(",");
            String[] result = new String[innerData.length];
            for (int j = 0; j < result.length;j++){
                result[j] = innerData[j].substring(innerData[j].indexOf(":")+1);
            }
            outString.append(ELEMENT1).append(result[0]).append(ELEMENT2).append(result[1]).
                        append(ELEMENT3).append(result[2]).append("\n");
        }
        System.out.println(outString.toString());
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer3 {
    public static void main(String[] args) {
        String JSON = "";
        String ELEMENT1 = "";
        String ELEMENT2 = "";
        String ELEMENT3 = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                    "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
            ELEMENT1 = "Студент ";
            ELEMENT2 = " получил ";
            ELEMENT3 = " по предмету ";
        } else {
            JSON = args[0];
            ELEMENT1 = args[1];
            ELEMENT2 = args[2];
            ELEMENT3 = args[3];
        }

        Answer2 ans = new Answer2();
        ans.answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);
    }
}