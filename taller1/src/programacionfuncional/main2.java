package programacionfuncional;

import java.util.List;

public class main2 {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

		System.out.println(numbers.stream().filter(num -> num > 10).count());

	}
}
