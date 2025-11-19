package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<Product>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));

		list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice())); // expressãp lambda

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
