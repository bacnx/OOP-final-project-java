package WebSales;
import java.time.LocalDateTime;
import java.util.*;

public class Database {
	private static int idUserCounter = 0;
	public static int getIdUserCounter() {
		return ++idUserCounter;
	}
	private static int idProductCounter = 0;
	public static int getIdProductCounter() {
		return ++idProductCounter;
	}
	private static int idOrderCounter = 0;
	public static int getIdOrderCounter() {
		return ++idOrderCounter;
	}
	public static int getIdOrderCounterNotIncrease() {
		return idOrderCounter;
	}
	private static int idReviewCounter = 0;
	public static int getIdReviewCounter() {
		return ++idReviewCounter;
	}
	public static int getIdReviewCounterNotIncrease() {
		return idReviewCounter;
	}
	
	
	public static List<Cart> carts = new ArrayList<Cart>(); // declare before users to add new cart when add new user (at ./User.cs:line 18)
	public static List<User> users = new ArrayList<User>();
	public static List<Product> products = new ArrayList<Product>();
	public static List<Order> orders = new ArrayList<Order>();
	public static List<Review> reviews = new ArrayList<Review>();
	
	public static void createDataDemo() {
		//users
        users.add(new User("Phan Thi Hong Nam", "067851000", "linnea99@hotmail.com"));
        users.add(new User("Lee Thi Ngoc Thuy", "001413356", "katharina.pagac@yahoo.com"));
        users.add(new User("Le Hong Nguyen", "036971124", "ellsworth.beer@hotmail.com"));
        users.add(new User("Pham Duy Hong", "059598368", "thad_goldner@gmail.com"));
        users.add(new User("Duong Quoc Thai", "0160567225", "lelah.west@hotmail.com"));
        users.add(new User("Tran Thi Thu", "035766290", "celine_rosenbaum@gmail.com"));
        users.add(new User("Nguyen Le Tuan", "026239572", "marcelina.walker4@gmail.com"));
        users.add(new User("Phung Thi Bich Thuy", "073038164", "michale51@hotmail.com"));
        users.add(new User("Nguyen Thanh Binh", "026051436", "hertha.farrell72@hotmail.com"));
        users.add(new User("Do Thi Thanh Huyen", "070427798", "jackeline57@hotmail.com"));
        users.add(new User("Nguyen Quoc Hung", "037215528", "maci.rohan69@yahoo.com"));
        users.add(new User("Nguyen Van Son", "0168544290", "onie.swaniawski53@hotmail.com"));

        // products
        products.add(new Product("MacBook Air 2022", 25900000, "laptop"));
        products.add(new Product("Dell XPS 13 9310", 19990000, "laptop"));
        products.add(new Product("Levono ThinkPad X1 Nano Gen 2", 36990000, "laptop"));
        products.add(new Product("Dell XPS 13 Plus 9320", 24190000, "laptop"));
        products.add(new Product("Microsoft Surface Pro 9", 26990000, "laptop"));

        products.add(new Product("Bàn phím Keychron K6 (Case Nhôm - Gateron Brown Switch - Hotswap)", 1590000, "keyboard"));
        products.add(new Product("Bàn phím Keychron K3 v2 (Optical Red Switch - Led RGB)", 2190000, "keyboard"));
        products.add(new Product("Bàn phím cơ AKKO 3087 Steam Engine (AKKO V2 Pink Switch)", 1499000, "keyboard"));
        products.add(new Product("Bàn phím cơ AKKO 3068B Plus World Tour Tokyo R2 (AKKO CS Switch Jelly Pink)", 1949000, "keyboard"));

        products.add(new Product("Loa Bluetooth Harman Kardon Aura Studio 3", 6900000, "sound"));
        products.add(new Product("Loa Bluetooth Harman Kardon Onyx Studio 5", 3900000, "sound"));
        products.add(new Product("Loa Harman Karrdon Go + Play", 5990000, "sound"));
        products.add(new Product("Loa Bluetooth Harman Kardon Soundstick 4", 7990000, "sound"));
        products.add(new Product("Loa Marshall Emberton (Black & Brass)", 2990000, "sound"));

        products.add(new Product("Chuột Logitech G102 (G203) LIGHTSYNC (BLack)", 420000, "mouse"));
        products.add(new Product("Chuột logitech M331 Silent (Black)", 359000, "mouse"));
        products.add(new Product("Chuột không dây Microsoft Arc Mouse Bluetooth (ELG-00005)", 990000, "mouse"));

        // orders
        orders.add(new Order( 1, LocalDateTime.of(2022, 11, 5, 23, 4, 5), "done", new int[] { 1, 1, 2, 4 } ));
        orders.add(new Order( 1, LocalDateTime.of(2022, 12, 14, 20, 45, 00), "pending", new int[] { 1, 3, 4 } ));
        orders.add(new Order( 2, LocalDateTime.of(2022, 12, 15, 19, 45, 54), "done", new int[] { 2, 3, 5 } ));
        orders.add(new Order( 2, LocalDateTime.of(2022, 12, 23, 9, 23, 4), "done", new int[] { 1, 2, 3, 14, 5 } ));
        orders.add(new Order( 2, LocalDateTime.of(2022, 12, 23, 6, 32, 17), "pending", new int[] { 9, 8, 7, 6, 5, 12 } ));

        // fake user review
        users.get(2).review(1, 4, "Do dep qua shop a <3");
        users.get(1).review(1, 3);
        users.get(3).review(1, 5);
        users.get(4).review(1, 5);
        users.get(1).review(1, 4);
        users.get(4).review(1, 3);
        users.get(6).review(2, 2);
        users.get(0).review(2, 5);
        users.get(5).review(2, 5);
        users.get(0).review(2, 4);
        users.get(7).review(3, 3);
        users.get(5).review(3, 2);
        users.get(2).review(3, 5);
        users.get(3).review(3, 5);
        users.get(4).review(4, 4);
        users.get(1).review(4, 3);
        users.get(6).review(4, 2);
        users.get(6).review(4, 2);
        users.get(7).review(5, 1);
        users.get(9).review(5, 4);
        users.get(2).review(5, 3);
        users.get(0).review(6, 2);
        users.get(0).review(7, 2);
        users.get(5).review(7, 1);
        users.get(1).review(8, 4);
        users.get(1).review(8, 3);
        users.get(1).review(9, 2);
        users.get(2).review(9, 2);
        users.get(3).review(9, 1);
        users.get(3).review(10, 4);
        users.get(4).review(10, 3);
        users.get(4).review(11, 4);
        users.get(5).review(11, 5);
        users.get(5).review(11, 5);
        users.get(6).review(12, 4);
        users.get(6).review(12, 3);
        users.get(6).review(12, 4);
        users.get(7).review(13, 5);
        users.get(7).review(14, 5);
        users.get(8).review(14, 4);
        users.get(8).review(15, 3);
        users.get(9).review(15, 4);
        users.get(9).review(15, 5);
        users.get(3).review(16, 5);
        users.get(1).review(16, 4);
        users.get(2).review(16, 3);
        users.get(2).review(16, 4);
        users.get(1).review(16, 5);
        users.get(3).review(16, 5);

        // add products to carts
        carts.get(0).addProduct(1);
        carts.get(0).addProduct(2);
        carts.get(0).addProduct(3);
        carts.get(0).addProduct(1);
        carts.get(0).addProduct(1);
        carts.get(1).addProduct(2);
        carts.get(1).addProduct(3);
        carts.get(1).addProduct(4);
        // add products to cart of user with id=9
        carts.get(8).addProduct(1);
        carts.get(8).addProduct(1);
        carts.get(8).addProduct(2);
        carts.get(8).addProduct(3);
        carts.get(8).addProduct(4);

        // pay cart
        int order_id_1 = carts.get(0).pay();
        carts.get(1).pay();
        
        // change order status with order_id_1: pending -> done
        orders.stream()
        	.filter(order -> order.id == order_id_1)
        	.findAny()
        	.orElse(null)
        	.done();
	}
}
