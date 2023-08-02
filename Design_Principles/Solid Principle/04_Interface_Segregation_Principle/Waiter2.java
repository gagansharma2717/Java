public class Waiter2 implements WaiterInterface{
    @Override
    public void takeOrder() {
        System.out.println("Taking Order");
    }

    @Override
    public void serveCustomers() {
        System.out.println("Serving Customers");
    }
}
