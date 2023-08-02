package Before;
public class Waiter implements ResturantEmployee {
    @Override
    public void washDishes() {
        // Not my job
    }

    @Override
    public void serveCustomers() {
        System.out.println("Serving the Customers");
    }

    @Override
    public void cookFood() {
        // Not my job
    }
}

// Clients are implementing unnecessary methods that they do not need.