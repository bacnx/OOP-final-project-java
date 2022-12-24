package WebSales;

import java.util.*;
import java.time.*;
import java.util.stream.Collectors;

public class Order {
	public int id;
	public int userId;
	public LocalDateTime orderDate;
	public String status;
	public int[] productIds;

	public Order(int userId, LocalDateTime orderDate, String status, int[] productIds) {
		this.id = Database.getIdOrderCounter();
		this.userId = userId;
		this.orderDate = orderDate;
		this.status = status;
		this.productIds = productIds;
	}
	public Order(int userId, LocalDateTime orderDate, String status) {
		this.id = Database.getIdOrderCounter();
		this.userId = userId;
		this.orderDate = orderDate;
		this.status = status;
		this.productIds = new int[] {};
	}
	
	public int getTotalPrice() {
		var productPrices = Database.products.stream()
				.filter(product -> Arrays.stream(this.productIds)
						.anyMatch(productId -> product.id == productId))
				.map(product -> product.price)
				.collect(Collectors.toList());
		return productPrices.stream().reduce(0, Integer::sum);
	}
	
	@Override
	public String toString() {
		String ans = "";
		ans += "\n\t id: " + id;
		ans += "\n\t userId: " + userId;
		ans += "\n\t orderDate: " + orderDate;
		ans += "\n\t status: " + status;
		ans += "\n\t getTotalPrice(): " + getTotalPrice();
		ans += "\n\t productIds: " + Arrays.toString(productIds);
		
		return "Order: {" + ans + "\n}";
	}
	
	// Status: pending -> done
	public void done() {
		status = "done";
	}
}
