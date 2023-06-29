package text;

import junit.framework.TestCase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class tmpTest extends TestCase {

    public static void main(String[] args) {
        String urlString = "https://127.0.0.1:9521/path/to/page.js?do=dsi";

        try {
            URL url = new URL(urlString);
            String domain = url.getHost();



            System.out.println("域名: " + domain);
            System.out.println(url.getPath());

            System.out.println(url.getProtocol()+"://"+url.getAuthority()+url.getPath());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}