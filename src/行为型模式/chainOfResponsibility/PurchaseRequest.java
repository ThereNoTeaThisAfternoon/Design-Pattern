package 行为型模式.chainOfResponsibility;

import java.util.UUID;

public class PurchaseRequest {
    private int type = 0;//请求类型
    private float price = 0.0f;//金额
    private String id;//id

    public PurchaseRequest(int type, float price) {
        this.type = type;
        this.price = price;
        this.id = UUID.randomUUID().toString();
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }
}
