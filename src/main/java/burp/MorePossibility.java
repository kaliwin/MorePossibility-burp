package burp;

import BurpGrpc.achieve.RunAchieve;
import InformationCenter.WebInformationProcessingCenter;
import UI.ManGUI;
import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;
import burp.api.montoya.ui.contextmenu.AuditIssueContextMenuEvent;
import burp.api.montoya.ui.contextmenu.ContextMenuEvent;
import burp.api.montoya.ui.contextmenu.ContextMenuItemsProvider;
import burp.api.montoya.ui.contextmenu.WebSocketContextMenuEvent;

import java.awt.*;
import java.util.List;


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

        api.userInterface().registerSuiteTab("MorePossibility", new ManGUI());


//        // ===================   测试用例   ========================== //
//        if (webInformationProcessingCenter.addPlaintextCiphertextPair("https://baidu.com/","cyvk","9521")) {
//            System.out.println("添加成功");
//        }
//        if (webInformationProcessingCenter.addPlaintextCiphertextPair("https://www.baidu.com/","ggc","6599")) {
//            System.out.println("添加成功");
//        }


        api.userInterface().registerContextMenuItemsProvider(new ContextMenuItemsProvider() {
            /**
             * @param event This object can be queried to find out about HTTP request/responses that are associated with the context menu invocation. 
             * @return
             */
            @Override
            public List<Component> provideMenuItems(ContextMenuEvent event) {
                return ContextMenuItemsProvider.super.provideMenuItems(event);
            }

            /**
             * @param event This object can be queried to find out about WebSocket messages that are associated with the context menu invocation. 
             * @return
             */
            @Override
            public List<Component> provideMenuItems(WebSocketContextMenuEvent event) {
                return ContextMenuItemsProvider.super.provideMenuItems(event);
            }

            /**
             * @param event This object can be queried to find out about audit issues that are associated with the context menu invocation. 
             * @return
             */
            @Override
            public List<Component> provideMenuItems(AuditIssueContextMenuEvent event) {
                return ContextMenuItemsProvider.super.provideMenuItems(event);
            }
        });
        
        

    }
}








class conText implements ContextMenuItemsProvider{
    /**
     * @param event This object can be queried to find out about HTTP request/responses that are associated with the context menu invocation. 
     * @return
     */
    @Override
    public List<Component> provideMenuItems(ContextMenuEvent event) {




        return ContextMenuItemsProvider.super.provideMenuItems(event);
    }

    /**
     * @param event This object can be queried to find out about WebSocket messages that are associated with the context menu invocation. 
     * @return
     */
    @Override
    public List<Component> provideMenuItems(WebSocketContextMenuEvent event) {
        return ContextMenuItemsProvider.super.provideMenuItems(event);
    }

    /**
     * @param event This object can be queried to find out about audit issues that are associated with the context menu invocation. 
     * @return
     */
    @Override
    public List<Component> provideMenuItems(AuditIssueContextMenuEvent event) {
        return ContextMenuItemsProvider.super.provideMenuItems(event);
    }
}











