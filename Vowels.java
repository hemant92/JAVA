
public class Vowels_2Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vowel_String= "Core Java programming"; 
		String vowels="oeaiOEAI";
		//Test_Case 1 if the given string is empty 
		String print="";
		if(vowel_String!=""){
			for(int i=0;i<vowel_String.length();i++){
				for(int j=0;j<vowels.length();j++){
					if(vowel_String.charAt(i)==vowels.charAt(j)){
						if(i<=1){
							// Testing if the index is equal and below the range 1
							if(i==0){
								System.out.println(vowel_String.charAt(i));
							}
							else{
							print+=vowel_String.charAt(i-1);
							print+=vowel_String.charAt(i);
							System.out.println(print);
							print="";
							}
						}
						else{
							print+=vowel_String.charAt(i-2);
							print+=vowel_String.charAt(i-1);
							print+=vowel_String.charAt(i);
							System.out.println(print);
							print="";
						}
					}
				}
			}
		}else {
			System.out.println("Given string is empty");
		}
	}

}
