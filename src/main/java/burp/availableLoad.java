package burp;

/**
 * @author cyvk
 */ // 可用载荷 信息 / 行动
public class availableLoad {
    public String target;
    information information;
    AttackPayload attackPayload;

    public availableLoad(String target) {
        this.target = target;
        this.information = new information();
        this.attackPayload = new AttackPayload();
    }
}
