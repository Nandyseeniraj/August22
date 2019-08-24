package Task1.Day1;

public class reversestring {

	public static void main(String[] args) {
	String original="GreensTechnologies";
	StringBuffer stb=new StringBuffer(original);
    
	StringBuffer reverse=new StringBuffer(stb).reverse();
    System.out.println(reverse);
	
	

	}

}
