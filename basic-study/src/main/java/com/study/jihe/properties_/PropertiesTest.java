package com.study.jihe.properties_;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * @author zzs
 * @date 2021/7/12 23:38
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("pg", "lin");
//        properties.put(null,"lin");
//        properties.put("pg",null);
        properties.put("sg", "kobe");
        properties.put("pg", "magic");
        properties.put("sf", "lebron");
        System.out.println(properties);
        properties.remove("pg");
        System.out.println("remove pg :" + properties);

        Properties properties1 = System.getProperties();
        System.out.println(properties1);
        Set<Map.Entry<Object, Object>> entries = properties1.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        // 读取指定文件
        System.out.println("=====================读取指定文件");
        Properties properties2 = new Properties();
        try {
            properties2.load(new FileInputStream("D:\\github\\java_study\\src\\jihe\\properties_\\test.properties"));
            Enumeration<?> propertyNames = properties2.propertyNames();
            while (propertyNames.hasMoreElements()) {
                String key = (String) propertyNames.nextElement();
                System.out.println(key + "-" + properties2.getProperty(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
