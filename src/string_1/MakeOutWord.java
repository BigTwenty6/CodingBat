package string_1;

public class MakeOutWord {
	
	public String makeOutWord(String out, String word) {
		  
		  return out.substring(0,2) + word + out.substring(2);
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		makeOutWord("<<>>", "Yay") → "<<Yay>>"	"<<Yay>>"	OK	
//		makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"	"<<WooHoo>>"	OK	
//		makeOutWord("[[]]", "word") → "[[word]]"	"[[word]]"	OK	
//		makeOutWord("HHoo", "Hello") → "HHHellooo"	"HHHellooo"	OK	
//		makeOutWord("abyz", "YAY") → "abYAYyz"	"abYAYyz"	OK	
		
		
	}

}
