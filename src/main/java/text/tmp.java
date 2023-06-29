package text;

import BurpGrpc.achieve.RunAchieve;
import BurpGrpc.proto.BurpApiGrpc.ContextMenuItems;
import BurpGrpc.proto.BurpApiGrpc.ContextMenuItemsProviderGrpc;
import BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn;
import burp.BurpApiUtensil;
import org.checkerframework.checker.units.qual.N;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author root
 */
public class tmp {
    public static void main(String[] args) {


        ContextMenuItemsProviderGrpc.ContextMenuItemsProviderBlockingStub client = new RunAchieve().getMenuItemsProviderClient("127.0.0.1:9000");


        MenuItemsReturn menuItemsReturn = client.menuItemsProvider(ContextMenuItems.newBuilder().build());


        System.out.println(menuItemsReturn.getIsReviseReq());
    }
}
