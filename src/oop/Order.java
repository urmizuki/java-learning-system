package labProgramming;

public class Order {

    private int orderNo;
    private Customer cust;

    public Order(int orderNo) {
        this.orderNo = orderNo;
    }

    public Order(int orderNo, Customer cust) {
        this.orderNo = orderNo;
        this.cust = cust;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public Customer getCust() {
        return cust;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

}
