package appliacation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program01 {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

//		list.forEach(new PriceUpdate()); // implementação da interface
//		list.forEach(Product::staticPriceUpdate); // metodo estatico
//		list.forEach(Product::nonStaticPriceUpdate); // metodo não estatico
		double factor = 1.1;
//		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor); // lambda declarado
//		list.forEach(cons);
		list.forEach(p -> p.setPrice(p.getPrice() * factor)); // lambda inline

		list.forEach(System.out::println);
	}

}
