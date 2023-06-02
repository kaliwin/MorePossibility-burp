package text;


import burp.InformationProcessingCenter;
import burp.availableLoad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tmp {
    public static void main(String[] args) {
//        String text = "Hello, this is a demo text with some numbers 12345.";
//
//        // 定义正则表达式
//        String regex = "\\b\\d+\\b"; // 匹配一个或多个数字
//
//        // 编译正则表达式
//        Pattern pattern = Pattern.compile(regex);
//
//        // 创建 Matcher 对象
//        Matcher matcher = pattern.matcher(text);
//
//        // 查找匹配项
//        while (matcher.find()) {
//            String match = matcher.group(); // 获取匹配到的字符串
//            System.out.println("Match: " + match);
//        }


        InformationProcessingCenter informationProcessingCenter = new InformationProcessingCenter();

        boolean b = informationProcessingCenter.addTarget("www.baidu.com:443");
        if (b){
            System.out.println("添加成功");
        }

        availableLoad availableLoad = informationProcessingCenter.getAvailableLoad("www.baidu.com:443");

        System.out.println("目标是: "+availableLoad.target);

        if (informationProcessingCenter.addTarget("www.baidu.com:4435")){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

    }
}
