package application;

public class Program03 {

	public static void main(String[] args) {
		
		//eXPRESSIVIDADE / CODIGO CONCISO
		Integer sum = 0;
		for(Integer x : list) {
			sum += x;
		}
		
		Integer sum = list.stream().reduce(0, Integer:: sum);

	}

}
