package com.promax.day11.q1;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XMLTest {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("homework\\src\\com\\promax\\day11\\q1\\users.xml");

        Element root = document.getRootElement();
        List<Element> elements = root.elements();

        Map<Integer, User> map = new HashMap<>();

        for (Element element : elements) {
            Attribute id = element.attribute("id");
            Integer key = Integer.valueOf(id.getValue());

            User user = new User();
            user.setName(element.elementText("name"));
            user.setSex(element.elementText("sex"));
            user.setAddress(element.elementText("地址"));
            user.setPassword(element.elementText("password"));
            map.put(key, user);
        }

        map.forEach((key, value) -> {
            System.out.println("id="+ key + "->" + value);
        });
    }
}
