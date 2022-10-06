package programacionfuncional;

import java.util.List;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

		int count = 0;
		for (Integer number : numbers) {
			if (number > 10)
				count++;
		}
		System.out.println(count);

	}
}