package chapter3;

public class ArrayUtil {

	public static double[] intToDouble(int[] a1) {
		double[] result = null;
		
		
		if(a1 == null) {
			return result;
		}
		
		result = new double[a1.length];
		for(int i = 0; i < a1.length; i++) {
			result[i] = a1[i];
		}
		
		return result;
	}
	

	public static int[] doubleToInt(double[] d) {
		int[] result = null;
		
		if(d == null) {
			return result;
		}
		
		result = new int[d.length];
		for(int i = 0; i < d.length; i++) {
			result[i] = (int)d[i];
		}
		
		return result;
	}

	public static int[] concat(int[] a, int[] b) {
		int size = 0;
		if(a != null) {
			size += a.length;
		}
		if(b != null) {
			size += b.length;
		}
		
		int[] result = new int[size];
		
		int index = 0;
		for(int v : a) {
			result[index++] = v;
		}

		for(int v : b) {
			result[index++] = v;
		}

		return result;
	}


	

}
