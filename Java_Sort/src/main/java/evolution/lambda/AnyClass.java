package evolution.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import evolution.AnyPojo;

public class AnyClass {
	public static void main(String[] args) {
		List<AnyPojo> anyPojos = Arrays.asList(new AnyPojo(1l, "Chen"), new AnyPojo(0l, "Ling"));
		Collections.sort(anyPojos, (o1, o2) -> {
			return o1.getId() - o2.getId() > 0 ? 1 : -1;
		});
		System.out.println(anyPojos);
	}
}
