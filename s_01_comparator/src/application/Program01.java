package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<Product>();

		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));

		// sintaxe de classe anonim - com lambda (função anonima) para fica menos
		// verbosa

//		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

		// sintaxe de classe anonima - muito verbosa
//		Comparator<Product> comp = new Comparator<Product>() {
//			@Override
//			public int compare(Product p1, Product p2) {
//				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//			}
//		};

//		list.sort(new MyComparator()); // uma forma de comparator
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
