import java.util.regex.Pattern;

public class tmp {
    public static boolean isValidIP(String ip) {
        // IP地址正则表达式
        String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        return Pattern.matches(pattern, ip);
    }

    public static boolean isValidPort(String port) {
        // 端口号正则表达式，限制范围为1到65535
        String pattern = "^([1-9]\\d{0,3}|[1-5]\\d{4}|6[0-4]\\d{3}|65[0-4]\\d{2}|655[0-2]\\d|6553[0-5])$";
        return Pattern.matches(pattern, port);
    }

    public static boolean isValidIPPort(String input) {
        String[] parts = input.split(":");
        if (parts.length != 2) {
            return false;
        }
        String ip = parts[0];
        String port = parts[1];
        return isValidIP(ip) && isValidPort(port);
    }

    public static void main(String[] args) {
        String userInput = "192.168.0.111:65531"; // 修改为有效的端口号
        if (isValidIPPort(userInput)) {
            System.out.println("输入合法");
        } else {
            System.out.println("输入不合法");
        }
    }
}
