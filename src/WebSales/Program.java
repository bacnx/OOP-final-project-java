package WebSales;
import java.util.*;
import java.util.stream.Collectors;
import java.time.*;

public class Program {
	public static void main(String [] args) {
		Database.createDataDemo();

		// 1. In ra thông tin của tất cả các người dùng trong tên có chữ "Nguyen"
		{
			var users = Database.users.stream()
					.filter(user -> user.name.contains("Nguyen"))
					.collect(Collectors.toList());
			System.out.println(users);
		}
		
		
		// 2. Tìm các đơn hàng có thời gian đặt hàng trong vào ngày 23/12/2022
		{
//			var orders = Database.orders.stream()
//					.filter(order -> order.orderDate.getDayOfMonth() == 23 &&
//									order.orderDate.getMonthValue() == 12 &&
//									order.orderDate.getYear() == 2022)
//					.collect(Collectors.toList());
//			System.out.println(orders);
		}
		
		
		// 3. In ra các sản phẩm có giá từ thấp đến cao
		{
//			var products = Database.products.stream()
//					.sorted(Comparator.comparingInt(Product::getPrice))
//					.collect(Collectors.toList());
//			System.out.println(products);
		}
		
		
		// 4. Tìm giỏ hàng của người có tổng giá các sản phẩm lớn nhất
		{
//			Cart cart = Database.carts.stream()
//					.max(Comparator.comparingInt(Cart::getTotalPrice)).get();
//			System.out.println(cart);
		}
		
		
		// 5. In ra thông tin các đánh giá mà người dùng có id=6 từng đánh giá
		{
//			var reviews = Database.reviews.stream()
//					.filter(review -> review.userId == 6)
//					.collect(Collectors.toList());
//			System.out.println(reviews);
		}
	}
}
