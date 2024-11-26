public class testingDemo
{
	@FunctionalInterface
	public interface sumInterface
	{
		public int sumOfRange(int a, int b);
	}

	public static void main(String[] args)
	{
        sumInterface rangeSum = (a, b) -> {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            return sum;
        };
	}
}