public class InvoiceDao{
    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // Save to Database
    }
}

// Problem in this approach is if some new requirement came like save to file then we cannot add that feature in this class
// That Problem we will resolve in Open-Closed Principle