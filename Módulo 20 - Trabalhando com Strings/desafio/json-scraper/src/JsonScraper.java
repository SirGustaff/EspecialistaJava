import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonScraper {

    public static void main(String[] args) {

        String json = """
                {
                    "id": 1,
                    "nome": "João da Silva"
                },
                {
                    "id": 2,
                    "nome": "Maria Abadia"
                },
                {
                    "id": 3,
                    "nome": "Sebastião Carvalho"
                }
                """;

        String regex = ".*?\"nome\":\\s*\"(?<nome>.*?)\".*?";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(json);

        while(matcher.find()) {
            System.out.println(matcher.group(1));
        }


//        String json = "{\n" +
//                "    \"id\": 1,\n" +
//                "    \"nome\": \"João da Silva\"\n" +
//                "},\n" +
//                "{\n" +
//                "    \"id\": 2,\n" +
//                "    \"nome\":\"Maria Abadia\"\n" +
//                "},\n" +
//                "{\n" +
//                "    \"id\": 3,\n" +
//                "    \"nome\":\n" +
//                "        \"Sebastião Carvalho\"\n" +
//                "}

    }

}
