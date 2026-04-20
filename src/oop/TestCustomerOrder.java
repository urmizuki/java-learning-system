package oop;

public class TestCustomerOrder {

    public static void main(String[] args) {
        Customer cust1 = new Customer(1, "Alif");
        Customer cust2 = new Customer(2, "Aiman");

        Order order1 = new Order(1, cust1);
        Order order2 = new Order(2, cust2);

        cust1 = new Customer(1, "Alif", order1);
        cust2 = new Customer(2, "Aiman", order2);

        cust1.setId(9);
        cust1.setName("Kareem");
        order1.setOrderNo(5);

        System.out.println("Id:\t" + cust1.getId() + "\n" + "Name:\t" + cust1.getName() + "\n" + "Order:\t" + cust1.getOrder().getOrderNo() + "\n");
        System.out.println("Id:\t" + cust2.getId() + "\n" + "Name:\t" + cust2.getName() + "\n" + "Order:\t" + cust2.getOrder().getOrderNo() + "\n");





    }
}
