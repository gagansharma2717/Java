package Before;
public class Chef implements ResturantEmployee {
    @Override
    public void washDishes() {
        // Not my Job
    }

    @Override
    public void cookFood() {
        System.out.println("Cooking Food");
    }

    @Override
    public void serveCustomers() {
        // Not my job
    }
}

// Clients are implementing unnecessary methods that they do not need.