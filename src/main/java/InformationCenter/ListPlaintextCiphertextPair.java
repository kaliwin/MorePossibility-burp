package InformationCenter;

/**
 * @author cyvk
 * @description: 列表信息用于添加和匹配检索
 */
public class ListPlaintextCiphertextPair {

    public String data;     // 数据
    public int associate;   // 关联的下标


    public ListPlaintextCiphertextPair(String data, int associate) {
        this.data = data;
        this.associate = associate;
    }
}
