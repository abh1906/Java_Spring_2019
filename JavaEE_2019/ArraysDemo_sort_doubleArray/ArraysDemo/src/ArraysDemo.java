import java.util.Arrays;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		double[] doubleArray = { 5.2, 2.3, 7.6, 3.4, 9.8 };
		Arrays.sort(doubleArray);

		System.out.println("The sorted double array is:");
		int i = 0;
		for (double number : doubleArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}
	}
}
