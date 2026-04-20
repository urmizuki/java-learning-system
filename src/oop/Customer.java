package oop;

public class Customer {

    private int id;
    private String name;
    private Order order;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer(int id, String name, Order order) {
        this.id = id;
        this.name = name;
        this.order = order;
    }

    public int getId() {
        return id; 
    }

    public String getName() {
        return name;
    }

    public Order getOrder() {
        return order;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
