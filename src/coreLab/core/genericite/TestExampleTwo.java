package coreLab.core.genericite;

import java.time.LocalDate;
import java.util.Date;

public class TestExampleTwo {

	public static void main(String[] args) {
		
		ExampleTwo<Integer> et = new ExampleTwo<Integer>(3,5);
		ExampleTwo<LocalDate> etd = new ExampleTwo<>(LocalDate.of(2024, 3, 27), LocalDate.now());
		
		System.out.println(et.getA());
		System.out.println(etd.getA());
		
		System.out.println(et.getB());
		System.out.println(etd.getB());
	}

}
