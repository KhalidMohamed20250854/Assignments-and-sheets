class Invoice {
    private String invoiceID;
    private double discount;
    private double totalInvoices;

    // Unparameterized constructor
    public Invoice() {
        this.invoiceID = "1";
        this.discount = 2.5;
        this.totalInvoices = 100.0;
    }

    // Parameterized constructor
    public Invoice(String invoiceID, double discount, double totalInvoices) {
        this.invoiceID = invoiceID;
        this.discount = discount;
        this.totalInvoices = totalInvoices;
    }

    // Accessor methods
    public String getInvoiceID() {
        return invoiceID;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotalInvoices() {
        return totalInvoices;
    }

    // Mutator methods (if needed for changing values)
    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setTotalInvoices(double totalInvoices) {
        this.totalInvoices = totalInvoices;
    }

    // calculatedDiscountPrice method
    public double calculatedDiscountPrice() {
        return totalInvoices - (totalInvoices * discount / 100);
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice();
        System.out.println(inv1.getInvoiceID() + " " + inv1.getDiscount() + " Before discount: " + inv1.getTotalInvoices() + " After discount:" + inv1.calculatedDiscountPrice());

        Invoice inv2 = new Invoice("1", 5.5, 200.0);
        System.out.println(inv2.getInvoiceID() + " " + inv2.getDiscount() + " Before discount: " + inv2.getTotalInvoices() + " After discount:" + inv2.calculatedDiscountPrice());
    }
}
