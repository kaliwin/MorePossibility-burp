package text;

import BurpGrpc.achieve.RunAchieve;
import BurpGrpc.proto.BurpApiGrpc.ContextMenuItems;
import BurpGrpc.proto.BurpApiGrpc.ContextMenuItemsProviderGrpc;
import BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn;
import InformationCenter.UrlData;
import burp.BurpApiUtensil;
import org.checkerframework.checker.units.qual.N;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author root
 */
public class tmp {
    public static void main(String[] args) {

        UrlData urlData = UrlData.parseUrl("https://www.baidu.com:443/safaf?d=sd");

        System.out.println(urlData);

    }
}
