package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> paramsMap = new LinkedHashMap<>();
        paramsMap.put("name", "Ivanov");
        paramsMap.put("country", "Ukraine");
        paramsMap.put("city", "Kiev");
        paramsMap.put("age", null);

        System.out.println(getQuery(paramsMap));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder queryBuilder = new StringBuilder();
        for (String s : params.keySet()) {
            String value = params.get(s);
            if (value == null) {
                continue;
            }
            if (queryBuilder.toString().length() != 0) {
                queryBuilder.append(" and ");
            }
            queryBuilder.append(s + " = '" + value + "'");
        }
        return queryBuilder.toString();
    }
}



//package com.javarush.task.task22.task2208;
//
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
///*
//Формируем WHERE
//*/
//
//public class Solution {
//    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("name", "Ivanov");
//        map.put("country", "Ukraine");
//        map.put("city", "Kiev");
//        map.put("age", null);
//        System.out.println(getQuery(map));
//
//    }
//
//    public static String getQuery(Map<String, String> params) {
//        StringBuilder stringBuilder = new StringBuilder("");
//        for(Map.Entry<String, String> m : params.entrySet()) {
//            if(m.getKey() == null && m.getValue() == null) return  "";
//            if(m.getValue() == null || m.getKey() == null) {
//                continue;
//            }
//            else stringBuilder.append(m.getKey()).append(" = '").append(m.getValue()).append("' and ");
//        }
//        stringBuilder.delete(stringBuilder.length() - 5, stringBuilder.length());
//        return stringBuilder.toString();
//    }
//}
