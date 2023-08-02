class Marker{
    String name;
    String color;
    int price;
    int year;

    public Marker(String name, String color, int price, int year) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }
}

/*public class Invoice{
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price = ((marker.price) * this.quantity);
        return  price;
    }

    public void printInvoice(){
        // Print the Invoice
    }

    public void saveToDB(){
        // Save the Invoice to DB
    }
}*/

// This class is having 3 responsibilities in 1 class which is generating total, printing invoice and saving to database.
// This should be in different classes.

public class Invoice{
    private final Marker marker;
    private final int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price = ((marker.price) * this.quantity);
        return  price;
    }
}