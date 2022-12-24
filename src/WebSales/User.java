package WebSales;

import java.util.stream.Collectors;

public class User {
	public int id;
	public String name;
	public String phone;
	public String email;
	
	public User(String name, String phone, String email) {
		this.id = Database.getIdUserCounter();
		this.name = name;
		this.phone = phone;
		this.email = email;

		// add new cart
		Database.carts.add(new Cart(this.id, new int[] {}));
	}
	
	@Override
	public String toString() {
		String ans = "";
        ans += "\n\t id: " + id;
        ans += "\n\t name: " + name;
        ans += "\n\t phone: " + phone;
        ans += "\n\t email: " + email;

        return "User: {" + ans + "\n}";
	}
	
	public void review(int productId, int point, String content) {
		var products = Database.products.stream()
				.filter(item -> item.id == productId)
				.collect(Collectors.toList());
		
		Product product;
		if(products.size() > 0)
			product = products.get(0);
		else
			return;

		Database.reviews.add(new Review(point, content, this.id, productId));
		
		int reviewId = Database.getIdReviewCounterNotIncrease();
		product.reviewIds = Extensions.append(product.reviewIds, reviewId);
	}
	
	public void review(int productId, int point) {
		var products = Database.products.stream()
				.filter(item -> item.id == productId)
				.collect(Collectors.toList());
		
		Product product;
		if(products.size() > 0)
			product = products.get(0);
		else
			return;

		Database.reviews.add(new Review(point, "", this.id, productId));
		
		int reviewId = Database.getIdReviewCounterNotIncrease();
		product.reviewIds = Extensions.append(product.reviewIds, reviewId);
	}
}
