package WebSales;

import java.util.*;
import java.time.LocalDateTime;
import java.util.stream.Collectors;

public class Cart {
	public int userId;
	public int [] productIds;
	
	public Cart(int userId, int[] productIds) {
		this.userId = userId;
		this.productIds = productIds;
	}
	
	public int getTotalPrice() {
		var productPrices = Database.products.stream()
				.filter(product -> Arrays.stream(this.productIds)
							.anyMatch(productId -> productId == product.id))
				.map(product -> product.price)
				.collect(Collectors.toList());
		return productPrices.stream().reduce(0, Integer::sum);
	}
	
	@Override
	public String toString() {
		String ans = "";
        ans += "\n\t userId: " + userId;
        ans += "\n\t productIds: " + Arrays.toString(productIds);
        ans += "\n\t getTotalPrice(): " + getTotalPrice();

        return "Cart: {" + ans + "\n}";
	}
	
	public void addProduct(int productId) {
		productIds = Extensions.append(productIds, productId);
	}
	
	public int pay() {
		Database.orders.add(new Order(userId, LocalDateTime.now(), "pending", productIds));
		int orderId = Database.getIdOrderCounterNotIncrease();
		
		// clear cart products
		productIds = new int[] {};
		
		return orderId;
	}
}
