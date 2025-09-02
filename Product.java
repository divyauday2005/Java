package day2;

public class Product {

	private int quantity;
	private int discount;
	private double gst;
	private int price;
	private String name;

	public static void main(String[] args) {
		String name;
		int price;
		double gst;
		int discount;
		int  quantity;
		Product P1 = new Product();
		P1.name="Rice";
		P1.price=1500;
		P1.gst=4.5;
		P1.discount=250;
		P1.quantity=25;
		System.out.println("Product name :"+P1.name);
		System.out.println("Product price:"+P1.price);
		System.out.println("GST:"+P1.gst);
		System.out.println("Discount:"+P1.discount);
		System.out.println("Quantity:"+P1.quantity);
	}

}
