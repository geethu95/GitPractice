class StringPalindrome{
	public static void main(String args[]){
	String s= "Teet";
	String rev="";
	for(int i=s.length()-1;i>=0;i--){
		rev=rev+s.charAt(i);
		//System.out.print(rev);
	}
	if(s.equalsIgnoreCase(rev)){
		System.out.println("palindrome");
	}
	else{
		System.out.println("not palindrome");
	}
	}
}