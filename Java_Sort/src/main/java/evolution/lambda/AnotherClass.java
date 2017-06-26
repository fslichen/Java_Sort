package evolution.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import evolution.AnyPojo;

public class AnotherClass {
	public static void main(String[] args) {
		List<AnyPojo> anyPojos = Arrays.asList(new AnyPojo(1l, "Chen"), new AnyPojo(0l, "Ling"));
		anyPojos.stream().sorted(Comparator.comparing(AnyPojo::getId).thenComparing(AnyPojo::getName));
		System.out.println(anyPojos);
	}
}
