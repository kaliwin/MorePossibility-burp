package text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class tmp {

    public static void main(String[] args) {
        String text = "POST /mcp/pc/pcsearch HTTP/1.1\n" +
                "Host: ug.baidu.com\n" +
                "Cookie: PSTM=1683357641; BAIDUID=8A70AD98D1B6973C3866E7EEF8BC21AB:FG=1; BIDUPSID=1D2CFBEB3002BACBCE87B49773543E46; BDORZ=B490B5EBF6F3CD402E515D22BCDA1598; ab_sr=1.0.1_MWI2OTQ0N2M3ZjI2MzI0ZDM5Y2UwNzE1YWVhMTNhMTZlMTQwM2QxOTIxYzY1ZTZlNWQyNzA3YzRjYjJiNGFkNmEzYzMxNTY3NWZlMjBiOTQ0NjhiZTVkMGIzYzA4YzhiOTNlMTBlNjc1YjYyNmE2MzRlZmMyM2U2MWFlZWZlOWJjYzAyM2VkNjMwZDMzY2RkZDMyM2ZkMDJiNDhiNmNiNA==; H_PS_PSSID=38516_36547_38686_38540_38797_38755_38767_38718_38486_38818_38822_38640_38507_26350_38568_38621; BA_HECTOR=0p2h200k2g4121ag2lalal2f1i7j5181m; BAIDUID_BFESS=8A70AD98D1B6973C3866E7EEF8BC21AB:FG=1\n" +
                "Content-Length: 56\n" +
                "Sec-Ch-Ua: \"Not:A-Brand\";v=\"99\", \"Chromium\";v=\"112\"\n" +
                "Sec-Ch-Ua-Platform: \"Linux\"\n" +
                "Sec-Ch-Ua-Mobile: ?0\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.5615.138 Safari/537.36\n" +
                "Content-Type: application/json\n" +
                "Accept: */*\n" +
                "Origin: https://www.baidu.com\n" +
                "Sec-Fetch-Site: same-site\n" +
                "Sec-Fetch-Mode: cors\n" +
                "Sec-Fetch-Dest: empty\n" +
                "Referer: https://www.baidu.com/s?wd=%E8%A5%BF%E6%B8%B8%E8%AE%B0%E4%B8%BB%E9%A2%98%E5%85%AC%E5%9B%AD%E6%B8%B8%E5%AE%A2%E5%90%B5%E6%9E%B6%E7%89%9B%E9%AD%94%E7%8E%8B%E5%8A%9D%E6%9E%B6&sa=fyb_n_homepage&rsv_dl=fyb_n_homepage&from=super&cl=3&tn=baidutop10&fr=top1000&rsv_idx=2&hisfilter=1\n" +
                "Accept-Encoding: gzip, deflate\n" +
                "Accept-Language: zh-CN,zh;q=0.9\n" +
                "Connection: close\n" +
                "\n" +
                "{\"invoke_info\":{\"pos_1\":[{}],\"pos_2\":[{\n" +
                "\"sdsd\":\"aHR0cHM6Ly93d3cuYmFpZHUuY29tL3M/d2Q9JUU4JUE1JUJGJUU2JUI4JUI4JUU4JUFFJUIwJUU0JUI4JUJCJUU5JUEyJTk4JUU1JTg1JUFDJUU1JTlCJUFEJUU2JUI4JUI4JUU1JUFFJUEyJUU1JTkwJUI1JUU2JTlFJUI2JUU3JTg5JTlCJUU5JUFEJTk0JUU3JThFJThCJUU1JThBJTlEJUU2JTlFJUI2JnNhPWZ5Yl9uX2hvbWVwYWdlJnJzdl9kbD1meWJfbl9ob21lcGFnZSZmcm9tPXN1cGVyJmNsPTMmdG49YmFpZHV0b3AxMCZmcj10b3AxMDAwJnJzdl9pZHg9MiZoaXNmaWx0ZXI9MQ==\"\n" +
                "}],\"pos_3\":[{\n" +
                "\"chat\":\"Q29va2llOiBQU1RNPTE2ODMzNTc2NDE7IEJBSURVSUQ9OEE3MEFEOThEMUI2OTczQzM4NjZFN0VFRjhCQzIxQUI6Rkc9MTsgQklEVVBTSUQ9MUQyQ0ZCRUIzMDAyQkFDQkNFODdCNDk3NzM1NDNFNDY7IEJET1JaPUI0OTBCNUVCRjZGM0NENDAyRTUxNUQyMkJDREExNTk4OyBhYl9zcj0xLjAuMV9NV0kyT1RRME4yTTNaakkyTXpJMFpETTVZMlV3TnpFMVlXVmhNVE5oTVRabE1UUXdNMlF4T1RJeFl6WTFaVFpsTldReU56QTNZelJqWWpKaU5HRmtObUV6WXpNeE5UWTNOV1psTWpCaU9UUTBOamhpWlRWa01HSXpZekE0WXpoaU9UTmxNVEJsTmpjMVlqWXlObUUyTXpSbFptTXlNMlUyTVdGbFpXWmxPV0pqWXpBeU0yVmtOak13WkRNelkyUmtaRE15TTJaa01ESmlORGhpTm1OaU5BPT07IEhfUFNfUFNTSUQ9Mzg1MTZfMzY1NDdfMzg2ODZfMzg1NDBfMzg3OTdfMzg3NTVfMzg3NjdfMzg3MThfMzg0ODZfMzg4MThfMzg4MjJfMzg2NDBfMzg1MDdfMjYzNTBfMzg1NjhfMzg2MjE7IEJBX0hFQ1RPUj0wcDJoMjAwazJnNDEyMWFnMmxhbGFsMmYxaTdqNTE4MW07IEJBSURVSURfQkZFU1M9OEE3MEFEOThEMUI2OTczQzM4NjZFN0VFRjhCQzIxQUI6Rkc9MQpDb250ZW50LUxlbmd0aDogNTYKU2VjLUNoLVVhOiAiTm90OkEtQnJhbmQiO3Y9Ijk5IiwgIkNocm9taXVtIjt2PSIxMTIiClNlYy1DaC1VYS1QbGF0Zm9ybTogIkxpbnV4IgpTZWMtQ2gtVWEtTW9iaWxlOiA/MApVc2VyLUFnZW50OiBNb3ppbGxhLzUuMCAoV2luZG93cyBOVCAxMC4wOyBXaW42NDsgeDY0KSBBcHBsZVdlYktpdC81MzcuMzYgKEtIVE1MLCBsaWtlIEdlY2tvKSBDaHJvbWUvMTEyLjAuNTYxNS4xMzggU2FmYXJpLzUzNy4zNgpDb250ZW50LVR5cGU6IGFwcGxpY2F0aW9uL2pzb24KQWNjZXB0OiAqLyoKT3JpZ2luOiBodHRwczovL3d3dy5iYWlkdS5jb20KU2VjLUZldGNoLVNpdGU6IHNhbWUtc2l0ZQpTZWMtRmV0Y2gtTW9kZTogY29ycwpTZWMtRmV0Y2gtRGVzdDogZW1wdHk=\"\n" +
                "}]\n" +
                "\"PHRpdGxlPn6mAAsMYDHlUzwvdGl0bGU+PHN0eWxlIGluZGV4PSJuZXdpIiB0eXBlPSJ0ZXh0L2NzcyI+I2Zvcm0gLmJkc3Vne3RvcDozOXB4fS5iZHN1Z3tkaXNwbGF5Om5vbmU7cG9zaXRpb246YWJzb2x1dGU7d2lkdGg6NTM1cHg7YmFja2dyb3VuZDojZmZmO2JvcmRlcjoxcHggc29saWQgI2NjYyFpbXBvcnRhbnQ7X292ZXJmbG93OmhpZGRlbjtib3gtc2hhZG93OjFweCAxcHggM3B4ICNlZGVkZWQ7LXdlYmtpdC1ib3gtc2hhZG93OjFweCAxcHggM3B4ICNlZGVkZWQ7LW1vei1ib3gtc2hhZG93OjFweCAxcHggM3B4ICNlZGVkZWQ7LW8tYm94LXNoYWRvdzoxcHggMXB4IDNweCAjZWRlZGVkfS5iZHN1ZyBsaXt3aWR0aDo1MTlweDtjb2xvcjojMDAwO2ZvbnQ6MTRweCBhcmlhbDtsaW5lLWhlaWdodDoyNXB4O3BhZGRpbmc6MCA4cHg7cG9zaXRpb246cmVsYXRpdmU7Y3Vyc29yOmRlZmF1bHR9LmJkc3VnIGxpLmJkc3VnLXN7YmFja2dyb3VuZDojZjBmMGYwfQ==\"}}";
        String pattern = "VCRjZGM0NENDAyRTUxNUQyMkJDREExNTk4OyBhYl9zcj0xLjAuMV9NV0kyT1RRME4yTTNaakkyTXpJMFpETTVZMlV3TnpFMVlXVmhNVE5oTVRabE1UUXdNMlF4T1RJeFl6WTFaVFpsTldReU56QTNZelJqWWpKaU5HRmtObUV6WXpNeE5UWTNOV1psTWpCaU9UUTBOamhpWlRWa01HSXpZekE0WXpoaU9UTmxNVEJsTmpjMVlqWXlObUUyTXpSbFptTXlNMlUyTVdGbFpXWmxPV0pqWXpBeU0yVmtOak13WkRNelkyUmtaRE15TTJaa01ESmlORGhpTm1OaU5BPT07IEhfUFNfUFNTSUQ9Mzg1MTZfMzY1NDdfMzg2ODZfMzg1NDBfMzg3OTdfMzg3NTVfMzg3NjdfMzg3MThfMzg0ODZfMzg4MThfMzg4MjJfMzg2NDBfMzg1MDdfMjYzNTBfMzg1Njh";


        int i = text.indexOf(pattern);

        System.out.println(i);


        String filePath = "/root/tmp/2.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // 处理每一行的内容
                int i1 = text.indexOf(line);
                if (i1 != -1){
                    System.out.println("命中: "+line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
