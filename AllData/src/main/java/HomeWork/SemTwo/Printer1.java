package HomeWork.SemTwo;

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        // Напишите свое решение ниже
        StringBuilder sbOut = new StringBuilder(QUERY);
        String temp = PARAMS.replace("{", "").replace("}", "");
        temp = temp.replace(" ", "");
        String[] parts = temp.split(",");
        boolean flag = false;
        for (int i = 0; i < parts.length; i++) {
            String[] tempParts = parts[i].split(":");

            tempParts[0] = tempParts[0].replace("\"", "").replace(" ", "");
            tempParts[1] = tempParts[1].replace("\"", "\'").replace(" ", "");
            if(!tempParts[1].equals("'null'")){
                if(flag){
                    sbOut.append(" and ");
                }
                sbOut.append(tempParts[0]).append("=").append(tempParts[1]);
                flag = true;
            }
        }
        return sbOut;
    }
}

public class Printer1 {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        } else {
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}
