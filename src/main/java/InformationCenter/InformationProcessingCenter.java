package InformationCenter;


import java.util.HashMap;
import java.util.Map;

/**
 * @description: 信息处理中心, 提供所有信息的整合以及API,包含以下功能
 * 1、信息接收,接收零号和斥候返回的数据
 * 2、整合发布,各个host、url、目标资产的信息和可用载荷
 * 3、向http编辑器、仪表盘、提供信息渲染
 * @author: cyvk
 * @date: 2023/6/1 下午5:18
 */
public class InformationProcessingCenter {

    Map<String, availableLoad> targetSet;  //目标集合由ip:port 作为key

    public InformationProcessingCenter() {
        this.targetSet = new HashMap<>();
    }

    /**
     * @param target: 目标 "ip:port" 示例 www.ggc.com:9544 (80或443也要写)
     * @return burp.availableLoad  目标可用载荷
     * @description: 获取目标可用载荷, 包含信息, 待攻击payload
     * @author: cyvk
     * @date: 2023/6/1 下午5:39
     */
    public availableLoad getAvailableLoad(String target) {
        return this.targetSet.get(target);
    }

    /**
     * @description: 添加目标
     * @param target:  目标  ip:port
     * @return boolean  是否存在 ,不存在会添加
     * @author: cyvk
     * @date: 2023/6/1 下午6:08
     */
    public boolean addTarget(String target){
        availableLoad availableLoad = getAvailableLoad(target);
        if (availableLoad != null){
            return false;
        }
        targetSet.put(target,new availableLoad(target));
        return true;
    }

}


/**
 * @description: 信息
 * web信息: 包含明文密文键值对、敏感信息、框架版本、可用攻击载荷
 * 主机信息:开放的端口服务、可用攻击载荷
 * 目标架构: 域名 公司 供应商 、可用刺探载荷
 * <p>
 * 截止6.1号 只对明文密文键值开发
 * @author: cyvk
 * @date: 2023/6/1 下午5:45
 */
class information {
    webInfo webInfo; // web信息
}


// 攻击载荷,包含poc、exp、刺探载荷
class AttackPayload {
    String index; //索引
}


//web信息: 包含明文密文键值对
class webInfo {
    PlaintextAndCiphertextSetData plaintextAndCiphertextSetData; // 明文密文集合
    String target; //目标


    public webInfo(String target) {
        this.target = target;
    }


    /**
     * @description: 获取明文或者密文
     * @param data : 要匹配的数据
     * @return java.lang.String
     * @author: cyvk
     * @date: 2023/6/8 下午5:01
     */
    public String getKeyOrValue(String data){

//        plaintextAndCiphertextSetData.plaintextAndCiphertextS.

        return null;
    }



}


















































