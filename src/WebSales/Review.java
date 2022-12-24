package WebSales;

public class Review {
	public int id;
	public int point;
	public String content;
	public int userId;
	public int productId;
	
	public Review(int point, String content, int userId, int productId) {
		this.id = Database.getIdReviewCounter();
		this.point = point;
		this.content = content;
		this.userId = userId;
		this.productId = productId;
	}
	
	@Override
	public String toString() {
		String ans = "";
		ans += "\n\t id: " + id;
		ans += "\n\t point: " + point;
		ans += "\n\t content: " + content;
		ans += "\n\t userId: " + userId;
		ans += "\n\t productId: " + productId;
		
		return "Review: {" + ans + "\n}";
	}
}
