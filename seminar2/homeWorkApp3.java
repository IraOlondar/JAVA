package seminar2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class homeWorkApp3 {
    public static void main(String[] args) throws ParseException {
        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        
        jsonParser(jsonString);
    }

    public static void parseUserObject(JSONObject user) {
        StringBuilder surname = new StringBuilder((String) user.get("фамилия"));
        StringBuilder estimatio = new StringBuilder((String) user.get("оценка"));
        StringBuilder lesson = new StringBuilder((String) user.get("предмет"));

        StringBuilder result = new StringBuilder();

        result.append("Студент ");
        result.append(surname);
        result.append(" получил ");
        result.append(estimatio);
        result.append(" по предмету ");
        result.append(lesson);

        System.out.println(result);
    }

    public static void jsonParser(String jsonStr) throws ParseException {
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(jsonStr);
        JSONArray weatherJsonObject = (JSONArray) obj;
    
        int i = 0;
        while (i < weatherJsonObject.size()) {
            parseUserObject((JSONObject) weatherJsonObject.get(i++));
        } 
    }
}
