package burp;

import BurpGrpc.achieve.RunAchieve;
import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;
import burp.api.montoya.logging.Logging;


// 插件入口
public class MorePossibility implements BurpExtension {
    // burpAPI
    public static MontoyaApi burpApi;
    // 打印函数
    public static Logging logging;
    // burpAPI的工具类用于注册burp服务和与Grpc的对接
    public static BurpApiTool burpApiTool;
    // 启动实现, 关于Grpc通信类,提供服务监听,建立rpc连接通信
    public static RunAchieve runAchieve;

    // 初始化
    private void init() {
        burpApiTool = new BurpApiTool();  //burpAPI的工具类,
        runAchieve = new RunAchieve();    //grpc 通讯的类
        logging = burpApi.logging();

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

//        api.extension().setName("MorePossibility_test");
//        api.logging().output().println("启动了");
//
//
//        burpApiTool.registerIntruderPayloadProcessor("127.0.0.1:9525", "goPayload");
//
//        burpApiTool.registerIntruderGeneratorPayload("127.0.0.1:9525", "goGenerator");
//        runAchieve.startServer(9588);


//        api.userInterface().registerContextMenuItemsProvider()




    }
}
