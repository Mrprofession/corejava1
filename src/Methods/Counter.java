package Methods;

public class Counter {

	static int staticCount;
	int nonstaticCount;

	public static void incrementStatic() {
		int result1 = ++staticCount;
		System.out.println(result1);

	}

	public void incrementNonStatic() {
		int result2 = ++nonstaticCount;
		System.out.println(result2);
	}
}
