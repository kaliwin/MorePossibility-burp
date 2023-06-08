package InformationCenter;


import com.google.common.collect.TreeBasedTable;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

// 明文密文键值对集合, 提供数据存储,检索,持久化操作
public class PlaintextAndCiphertextSetData {

    // 明文密文集合
    // rowKey为 为明文
    // columnKey 为密文
    // value 为 url
   public TreeBasedTable<String, String, String> plaintextAndCiphertextS; // 树状结构存储数据

    public PlaintextAndCiphertextSetData() {
        plaintextAndCiphertextS = TreeBasedTable.create();
    }


    /**
     * @param plaintext: 明文字符串
     * @return java.lang.String
     * @description: 通过明文查找密文
     * @author: cyvk
     * @date: 2023/6/1 下午4:34
     */
    public String findCiphertext(String plaintext) {
        SortedMap<String, String> row = plaintextAndCiphertextS.row(plaintext);
        try {
//            String str = row.firstKey();
            return row.firstKey();
        }catch (Exception e){
            return null;
        }

    }

    /**
     * @param ciphertext: 密文
     * @return java.lang.String
     * @description: 通过密文查找明文
     * @author: cyvk
     * @date: 2023/6/1 下午4:40
     */
    public String findPlaintext(String ciphertext) {
        Map<String, String> column = plaintextAndCiphertextS.column(ciphertext);
        Set<String> strings = column.keySet();

        Iterator<String> iterator = strings.iterator();
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return "";
    }

    /**
     * @param plaintext:  明文
     * @param ciphertext: 密文
     * @return boolean 结果
     * @description: 添加明文密文键值对
     * @author: cyvk
     * @date: 2023/6/1 下午4:44
     */
    public boolean addPlaintextAndCiphertext(String plaintext, String ciphertext,String url) {
        if (plaintextAndCiphertextS.contains(plaintext, ciphertext)) {
            return false;
        }
        plaintextAndCiphertextS.put(plaintext, ciphertext, url);
        return true;
    }


    /**
     * @param plaintext: 明文
     * @return boolean
     * @description: 通过明文删除数据
     * @author: cyvk
     * @date: 2023/6/1 下午4:49
     */
    public boolean deleteText(String plaintext) {
        String ciphertext = findCiphertext(plaintext);
        String remove = plaintextAndCiphertextS.remove(plaintext, ciphertext);
        return remove != null;
    }

}






















