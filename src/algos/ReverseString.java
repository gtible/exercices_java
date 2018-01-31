package algos;

public class ReverseString {

	public String evaluate(String s) {
		// TODO Auto-generated method stub

		
		char[] sArray = s.toCharArray();
		
		String solution = "";
		
		for (int i = sArray.length -1; i >= 0 ; i--) {
			solution += sArray[i];
		}
		
		return solution;
	}

}
