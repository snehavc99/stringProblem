package apple.stringPblm.main;
/*
 * @author-Sneha
 */
public class StringPblm {
	//using iterative method
	public String iterateMtd(String originalStr, char toRemove) {
		StringBuilder  newString = new StringBuilder();
		for (int i = 0; i <= originalStr.length() - 1; i++) {
			char toCompare = originalStr.charAt(i);
			if (toCompare != toRemove) {
				newString.append(toCompare);

			}
		}
		return newString.toString();
	}
	// uses the StringAPI functionality
	public  String stringAPI(String originalStr, Character toRemove){
		String newString =originalStr.replaceAll(toRemove.toString(), "");
		return newString;
		
	}
}
