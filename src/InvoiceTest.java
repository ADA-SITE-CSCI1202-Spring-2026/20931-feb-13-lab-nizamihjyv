import week03.Invoice.Invoice;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice1 = new Invoice("P101", "USB Cable", 5, 3.5);

        System.out.println("=== Invoice 1 ===");
        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per item: " + invoice1.getPricePerItem());
        System.out.println("Total amount: " + invoice1.getInvoiceAmount());

        System.out.println();

        Invoice invoice2 = new Invoice("P202", "Keyboard", -4, -10.0);

        System.out.println("=== Invoice 2 (invalid values test) ===");
        System.out.println("Part Number: " + invoice2.getPartNumber());
        System.out.println("Description: " + invoice2.getPartDescription());
        System.out.println("Quantity: " + invoice2.getQuantity()); // should become 0
        System.out.println("Price per item: " + invoice2.getPricePerItem()); // should become 0.0
        System.out.println("Total amount: " + invoice2.getInvoiceAmount());

        System.out.println();

        invoice2.setQuantity(10);
        invoice2.setPricePerItem(12.5);

        System.out.println("=== After updating Invoice 2 ===");
        System.out.println("Quantity: " + invoice2.getQuantity());
        System.out.println("Price per item: " + invoice2.getPricePerItem());
        System.out.println("Total amount: " + invoice2.getInvoiceAmount());
    }
}
