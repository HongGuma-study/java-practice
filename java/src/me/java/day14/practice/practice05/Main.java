package me.java.day14.practice.practice05;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String jsonString = "{\n" +
                "\t\"name\": \"Madame Uppercut\",\n" +
                "\t\"age\": 39,\n" +
                "\t\"secretIdentity\": \"Jane Wilson\",\n" +
                "\t\"powers\": [\n" +
                "\t\t\"Million tonne punch\",\n" +
                "\t\t\"Damage resistance\",\n" +
                "\t\t\"Superhuman reflexes\"\n" +
                "\t]\n" +
                "}";

        saveMap(jsonString);
    }

    public static void saveMap(String jsonString){
        HashMap<String,Object> hashMap = new HashMap<>();

        String replaceJson = jsonString.replaceAll("[/\t/s/\"/{/}/\n]",""); // " \t \n 없애기
        String[] tmp = replaceJson.split("\\["); // [ 단위로 끊기

        tmp[1] = tmp[1].replace(",","/"); // [] 안에 있는 , -> / 로 바꾸기 (바꾸는 이휴 , 단위로 자르면 [] 안에 있는 원소들도 같이 짤리기 때문)
        String changeJson = tmp[0] + "[" + tmp[1]; //다시 하나로 합치기
        String[] splitJson = changeJson.split(","); //,로 자르기

        for(String line : splitJson){ //, 로 자른 배열에서 한줄씩 꺼내기

            String[] part = line.split(":"); //꺼낸 line에서 : 단위로 자르기
            String key = part[0]; // 첫번째는 key
            String value = part[1]; // 두번째는 value
            if(value.contains("[")){ //만약에 value에 [ 가 포함 되어 있다면
                value = value.replace("/",", "); // / -> , 로 바꾸기
            }
            hashMap.put(key,value); //해쉬에 넣기
        }

        System.out.println(hashMap); //출력

    }
}