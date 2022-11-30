package seminar2;

public class homeWorkApp1 {
   public static void main(String[] args) {
      String jsonStr = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
      
      String[] arr = jsonStr.replace("{", "")
         .replace("}", "")
         .replace(" ", "")
         .replace("\"", "")
         .split(",");
      
      StringBuilder result = new StringBuilder();
      String[] arrRes = new String[2];
      Boolean first = true;
      for (String st : arr) {
         arrRes = st .split(":");
         
         if (!arrRes[1].equals("null")) {
            if (first) {
               first = false;
            } else {
               result.append(" AND ");
            }

            StringBuilder a = new StringBuilder(arrRes[0]);
            StringBuilder b = new StringBuilder(arrRes[1]);

            result.append(a)
                  .append(" = ")
                  .append("'" + b + "'");
         }
      }

      System.out.print(result);
   }
}
