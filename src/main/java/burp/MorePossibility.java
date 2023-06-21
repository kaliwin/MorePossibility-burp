package burp;

import BurpGrpc.achieve.RunAchieve;
import BurpGrpc.proto.BurpApiGrpc.*;
import InformationCenter.WebInformationProcessingCenter;
import UI.Hu;
import UI.ManGUI;
import UI.ManGrpcGUI;
//import UI.TestGUI;
import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Registration;
import burp.api.montoya.http.handler.*;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.proxy.http.*;
import burp.api.montoya.ui.contextmenu.*;
import com.google.protobuf.ByteString;
import io.grpc.okhttp.OkHttpChannelBuilder;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static burp.MorePossibility.registrationTest;


/**
 * @author cyvk
 */ // 插件入口
public class MorePossibility implements BurpExtension {
    // burpAPI
    public static MontoyaApi burpApi;
    // 打印函数
//    public static Logging logging;  使用  ManGrpcGUI.pluginLog 打印信息
    // burpAPI的工具类用于注册burp服务和与Grpc的对接
    public static BurpApiTool burpApiTool;
    // 启动实现, 关于Grpc通信类,提供服务监听,建立rpc连接通信
    public static RunAchieve runAchieve;


    public static Registration registrationTest;

    public static WebInformationProcessingCenter webInformationProcessingCenter; // web信息处理中心


    // 初始化
    private void init() {
        burpApiTool = new BurpApiTool();  //burpAPI的工具类
        runAchieve = new RunAchieve();    //grpc 通讯的类
        webInformationProcessingCenter = new WebInformationProcessingCenter(); // web信息处理中心
    }


    /**
     * Invoked when the extension is loaded.
     *
     * @param api The api implementation to access the functionality of burp suite.
     */
    @Override
    public void initialize(MontoyaApi api) {
        burpApi = api;
        this.init(); // 初始化

        api.extension().setName("MorePossibility_test");
        api.logging().output().println("启动了");

        api.userInterface().registerSuiteTab("MorePossibility_test", new ManGUI());
//        burpApiTool.test("https://127.0.0.1:9001/test");

//        api.proxy().registerResponseHandler()



    //        api.http().sendRequest()

//        HttpRequest httpRequest = HttpRequest.httpRequest("https://127.0.0.1:9001/test");
//
//        HttpRequestResponse httpRequestResponse = api.http().sendRequest(httpRequest);
//        api.logging().output().println(httpRequestResponse.response().body());



//        // ===================   测试用例   ========================== //
//        if (webInformationProcessingCenter.addPlaintextCiphertextPair("https://baidu.com/","cyvk","9521")) {
//            System.out.println("添加成功");
//        }
//        if (webInformationProcessingCenter.addPlaintextCiphertextPair("https://www.baidu.com/","ggc","6599")) {
//            System.out.println("添加成功");
//        }

//        registrationTest = api.userInterface().registerContextMenuItemsProvider(new demo());// 右键上下文测试
//
//        api.userInterface().registerContextMenuItemsProvider(new conText());

    }
}




class rpcTest{


    public void run(){

    }

}






//class conText implements ContextMenuItemsProvider{
//    /**
//     * @param event This object can be queried to find out about HTTP request/responses that are associated with the context menu invocation.
//     * @return
//     */
//    @Override
//    public List<Component> provideMenuItems(ContextMenuEvent event) {
//
//        List<Component> list = new ArrayList<>();
//
//        list.add(new textDemo().run());
//
//
//        return list;
//    }
//
//
//}
//
//class demo implements ContextMenuItemsProvider{
//    @Override
//    public List<Component> provideMenuItems(ContextMenuEvent event) {
//
//        List<Component> list = new ArrayList<>();
//
//        JMenuItem conTest = new JMenuItem("ConTest");
//
//
//        conTest.addActionListener(actionEvent -> {
//
//            MessageEditorHttpRequestResponse messageEditorHttpRequestResponse = event.messageEditorRequestResponse().get();
//
////            messageEditorHttpRequestResponse.selectionOffsets().
//
//            HttpRequest request = messageEditorHttpRequestResponse.requestResponse().request();
//            HttpResponse response = messageEditorHttpRequestResponse.requestResponse().response();
//
//
//            httpReqData req = httpReqData.newBuilder()
//                    .setData(ByteString.copyFrom(request.toByteArray().getBytes()))
//                    .setUrl(request.url())
//                    .build();
//
//            httpReqAndRes build = httpReqAndRes.newBuilder().setReq(req).build();// 组装请求
//
//
//            ContextMenuItems conText = ContextMenuItems.newBuilder()
//                    .setHttpReqAndRes(build)
//                    .setName("ConTest")
//                    .build();
//
//            ContextMenuItemsProviderGrpc.ContextMenuItemsProviderBlockingStub contextMenuItemsProviderBlockingStub = ContextMenuItemsProviderGrpc.newBlockingStub(OkHttpChannelBuilder.forTarget("127.0.0.1:9525").usePlaintext().build());
//
//
//            MenuItemsReturn menuItemsReturn = contextMenuItemsProviderBlockingStub.menuItemsProvider(conText);
//
//            if (menuItemsReturn.getIsReviseReq()) {
//                ManGrpcGUI.consoleLog.append("修改请求 \n");
//
//                registrationTest.deregister();
//                ByteString reqData = menuItemsReturn.getReqData();
//                byte[] byteArray = reqData.toByteArray();
//                HttpRequest httpRequest = HttpRequest.httpRequest(ByteArray.byteArray(byteArray));  // 解析要修改的请求
//
//                event.messageEditorRequestResponse().get().setRequest(httpRequest);
//
//            }
//
//
//
//        });
//
//        list.add(conTest);
//
//
////        list.
//
//        return list;
//    }
//}



//// 菜单
//class Menu {
////    MenuItem[] Menu;  // 菜单项
////    Menu[] menus; //菜单
//
//    List<Menu> menu;
//
//    List<MenuItem> menuItems;
//
//    String name;
//
//    public Menu(String name) {
//        this.menu = new ArrayList<>();
//        this.menuItems = new ArrayList<>();
//        this.name = name;
//    }
//
//    public Component get(){
//
//        JMenu jMenu = new JMenu(name);
//
//        for (MenuItem menuItem : menuItems) {
//            jMenu.add(menuItem.get());
//
////            Component component = menuItem.get();
//
//        }
//
//        for (Menu menu1 : menu) {
//            jMenu.add(menu1.get());
//        }
//
//        return jMenu;
//    }
//
//}
//
//// 菜单项
//class MenuItem {
//    String name;
//
//    public MenuItem(String name) {
//        this.name = name;
//    }
//
//    public Component get() {
//
//
//        JMenuItem jMenuItem = new JMenuItem(this.name);
//
////        jMenuItem.
//
//        return new JMenuItem(this.name);
//    }
//}


//class textDemo {
//
//    public Component run() {
//        Menu menu1 = new Menu("一级菜单"); // 菜单
//
//        menu1.menuItems.add(new MenuItem("一级菜单第一个"));
//        menu1.menuItems.add(new MenuItem("一级菜单第二个"));
//
//
//        Menu menu2 = new Menu("二级菜单");
//
//
//
//
//        menu2.menuItems.add(new MenuItem("二级菜单第一个"));
//        menu2.menuItems.add(new MenuItem("二级菜单第二个"));
//
//        Menu menu3 = new Menu("三级菜单");
//
//        menu3.menuItems.add(new MenuItem("三级菜单第一个"));
//        menu1.menu.add(menu2);
//        menu2.menu.add(menu3);
//
//        return menu1.get();
//    }
//
//}










