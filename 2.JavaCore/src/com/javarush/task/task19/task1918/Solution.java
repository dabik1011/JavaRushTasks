package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fileName = rd.readLine();
        //String fileName = "C:\\Users\\Серёжа\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1918\\1.html";
        rd.close();
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                stringBuilder.append(reader.readLine());
            }
        }

        String tag = args[0];
        Document document = Jsoup.parse(String.valueOf(stringBuilder), "", Parser.xmlParser());
        Elements element = document.select(tag);

        for (Element el : element) {
            System.out.println(el);
        }


    }
}
