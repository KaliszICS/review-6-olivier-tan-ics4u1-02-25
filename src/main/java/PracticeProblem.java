public class PracticeProblem {

	public static void main(String args[]) {
	
	}
	
	//question 1
	public static int _sum_(int num1, int num2){
	int sum = num1+num2;
	return sum;
	}

	//question 2
	public static int _difference_(int num1, int num2){
	int diff = num1-num2;
	return diff;
	}

	//question 3
	public static double _product_(double num1, double num2){
	double product = num1*num2;
	return product;
	}

	//question 4
	public static void _removeFirst_(String word){
	return word.substring(1);
	}

	//question 5
	public static int _combinedLength_(String word1, String word2){
	return word1.length()+word2.length();

	}

	//question 6
	public static boolean _isEven_(int num){
	return (num%2==0);
	}

	//question 7
	public static boolean _isOdd_(int num){
	return (num%2==1);	
	}
	
	//question 8
	public static boolean _isPositive_(int num){
	return (num>0);
	}

	//question 9
	public static boolean _isNegative_(int num){
	return (num<0);
	}

}
