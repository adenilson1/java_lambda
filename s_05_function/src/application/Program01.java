package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class Program01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<Product>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// transforma uma lista de Product em uma String
//		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); // implementação de interface
//		List<String> names = list.stream().map(Product::staticUpperCase).collect(Collectors.toList()); // metodo estatico
//		List<String> names = list.stream().map(Product::nonStaticUpperCase).collect(Collectors.toList()); // metodo não estatico
//		Function<Product, String> func = p -> p.getName().toUpperCase();
//		List<String> names = list.stream().map(func).collect(Collectors.toList()); // expressão lambda declarada
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()); // expressão lambda inline

		names.forEach(System.out::println);

	}

}
