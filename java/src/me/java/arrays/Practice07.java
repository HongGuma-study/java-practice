package me.java.arrays;


public class Practice07 {
    public static void main(String[] args) {
        String[][] jsonTable = {};
        String inputJson = "{\n" +
                "\t\"name\": \"Molecule Man\",\n" +
                "\t\"age\": 29,\n" +
                "\t\"secretIdentity\": \"Dan Jukes\",\n" +
                "\t\"powers\": \"Radiation resistance\"\n" +
                "},\n" +
                "{\n" +
                "\t\"name\": \"Madame Uppercut\",\n" +
                "\t\"age\": 39,\n" +
                "\t\"secretIdentity\": \"Jane Wilson\",\n" +
                "\t\"powers\": \"Damage resistance\"\n" +
                "},\n" +
                "{\n" +
                "\t\"name\": \"Eternal Flame\",\n" +
                "\t\"age\": 1000000,\n" +
                "\t\"secretIdentity\": \"Unknown\",\n" +
                "\t\"powers\": \"Heat Immunity\"\n" +
                "}";
        jsonTable = processJson(inputJson);
        System.out.printf("%20s\t|%20s\t|%20s\t|%20s\t|\n","name","age","secretIdentity","powers");
        System.out.println("================================================================================================");
        int cnt = 0;
        for(int i=0; i<jsonTable.length; i++){
            System.out.printf("%20s\t|",jsonTable[i][1]);
            cnt++;
            if(cnt == 4){
                System.out.println();
                cnt = 0;
            }
        }
    }

    public static String[][] processJson(String jsonStr){
        String str = jsonStr.replaceAll("[{}\n\t\"]","");
        String[] splitStr1 = str.split(",");
        String[][] afterStr = new String[splitStr1.length][2];
        for(int i=0; i<splitStr1.length; i++){
            afterStr[i][0] = splitStr1[i].split(":")[0];
            afterStr[i][1] = splitStr1[i].split(":")[1];
        }
//        System.out.println(Arrays.deepToString(afterStr));
        return afterStr;
    }
}
