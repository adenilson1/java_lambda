package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

//		list.removeIf(new ProductPredicate()); // implementação da interface
//		list.removeIf(Product::staticProductPredicate); // referencia para metodo estatitico
//		list.removeIf(Product::nonStaticProductPredicate); // referencia para metodo não estatico
		double min = 100.0;
//		Predicate<Product> pred = p -> p.getPrice() >= min; // espressão lambda declarada
//		list.removeIf(pred);
		list.removeIf(p -> p.getPrice() >= min); // expressão lambda inline

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
