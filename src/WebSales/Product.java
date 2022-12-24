package WebSales;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Product {
	public int id;
	public String name;
	public String type;
	public String description;
	public int price;
	public int[] reviewIds;
	
	public int getPrice() {
		return price;
	}

	public Product(String name, int price, String type) {
		this.id = Database.getIdProductCounter();
		this.name = name;
		this.type = type;
		this.description = "";
		this.price = price;
		this.reviewIds = new int[] {};
	}
	public Product(String name, int price, String type, String description) {
		this.id = Database.getIdProductCounter();
		this.name = name;
		this.type = type;
		this.description = description;
		this.price = price;
		this.reviewIds = new int[] {};
	}
	
	public double getPoint() {
		var reviewPoints = Database.reviews.stream()
				.filter(review -> Arrays.stream(reviewIds)
						.anyMatch(reviewId -> review.id == reviewId))
				.map(review -> review.point)
				.collect(Collectors.toList());
		return reviewPoints.stream()
				.mapToDouble(d -> d)
				.average()
				.orElse(0.0);
	}
	
	@Override
	public String toString() {
		String ans = "";
		ans += "\n\t id: " + id;
		ans += "\n\t name: " + name;
		ans += "\n\t type: " + type;
		ans += "\n\t price: " + price;
		ans += "\n\t description: " + description;
		ans += "\n\t getPoint(): " + getPoint();
		ans += "\n\t reviewIds: " + Arrays.toString(reviewIds);
		
		return "Product: {" + ans + "\n}";
	}
}
