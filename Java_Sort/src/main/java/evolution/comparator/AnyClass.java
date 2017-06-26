package evolution.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import evolution.AnyPojo;

public class AnyClass {
	public static void main(String[] args) {
		Comparator<AnyPojo> comparator = new Comparator<AnyPojo>() {
			public int compare(AnyPojo o1, AnyPojo o2) {
				return o1.getId() - o2.getId() > 0 ? 1 : -1;
			}
		};
		List<AnyPojo> anyPojos = Arrays.asList(new AnyPojo(1l, "Chen"), new AnyPojo(0l, "Ling"));
		Collections.sort(anyPojos, comparator);
		System.out.println(anyPojos);
	}
}
