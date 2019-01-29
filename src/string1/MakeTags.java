package string1;

public class MakeTags {

	public String makeTags(String tag, String word) {
		  
		  return "<" + tag + ">" + word + "</" + tag + ">" ;
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		makeTags("i", "Yay") → "<i>Yay</i>"	"<i>Yay</i>"	OK	
//		makeTags("i", "Hello") → "<i>Hello</i>"	"<i>Hello</i>"	OK	
//		makeTags("cite", "Yay") → "<cite>Yay</cite>"	"<cite>Yay</cite>"	OK	
//		makeTags("address", "here") → "<address>here</address>"	"<address>here</address>"	OK	
//		makeTags("body", "Heart") → "<body>Heart</body>"	"<body>Heart</body>"	OK	
//		makeTags("i", "i") → "<i>i</i>"	"<i>i</i>"	OK	
//		makeTags("i", "") → "<i></i>"	"<i></i>"	OK	
//		other tests

	}
}
