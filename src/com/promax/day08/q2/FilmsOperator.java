package com.promax.day08.q2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilmsOperator {
    public static void main(String[] args) {
        // 分别按排名顺序依次存入两个Map集合。
        Map<String, Double> global = initGlobal();
        Map<String, Double> china = initChina();

        Set<Map.Entry<String, Double>> globalEntrySet = global.entrySet();
        Set<Map.Entry<String, Double>> chinaEntrySet = china.entrySet();

        // 1）打印全球影片排行榜中的前三甲影片名
        System.out.println("全球前三：====================");
        globalEntrySet.stream().limit(3).forEach(System.out::println);

        // 2）打印华人影片排行榜中倒数5名的影片名
        System.out.println("国内倒五：=========================");
        chinaEntrySet.stream().skip(5).forEach(System.out::println);

        // 3）将两个排行榜中的前5名挑出来共同存入新的集合
        System.out.println("两个排行榜中的前5名==================");
        List<Map.Entry<String, Double>> collect = Stream
                .concat(globalEntrySet.stream().limit(5), chinaEntrySet.stream().limit(5))
                .collect(Collectors.toList());
        System.out.println(collect);

        // 4）定义电影Film类(属性：电影名，评分)，将上面新集合中的数据，封装到Film对象中。
        List<Film> films = new ArrayList<>();

        for (Map.Entry<String, Double> entry : collect) {
            films.add(new Film(entry.getKey(), entry.getValue()));
        }
        System.out.println("封装成File对象后===================");
        System.out.println(films);


    }

    public static Map<String, Double> initGlobal(){
        Map<String, Double> global = new LinkedHashMap<>();
        global.put("《肖生克的救赎》",9.7);
        global.put("《霸王别姬》",9.6);
        global.put("《阿甘正传》",9.6);
        global.put("《辛德勒的名单》",9.6);
        global.put("《美丽人生》",9.5);
        global.put("《千与千寻》",9.4);
        global.put("《泰坦尼克号》",9.4);
        global.put("《这个杀手不太冷》",9.4);
        global.put("《忠犬八公的故事》",9.4);
        global.put("《盗梦空间》",9.3);
        return global;
    }

    public static Map<String, Double> initChina(){
        Map<String, Double> china = new LinkedHashMap<>();
        china.put("《阳光普照》",8.5);
        china.put("《气球》",7.9);
        china.put("《拆弹专家2》",7.9);
        china.put("《一秒钟》",7.8);
        china.put("《送你一朵小红花》",7.5);
        china.put("《金都》",7.7);
        china.put("《叔叔》",7.7);
        china.put("《八佰》",7.6);
        china.put("《夺冠》",7.3);
        china.put("《我和我的家乡》",7.3);

        return china;
    }
}
