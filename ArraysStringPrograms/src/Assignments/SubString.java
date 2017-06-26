package Assignments;

public class SubString {

	public static void main(String[] args) {
		String string = "welcome";
		for (int x= 1; x<=string.length(); x++)
		{
			for(int y=0; y<string.length(); y++)
			{
				int z = y+x ;
				if(z<=string.length())		
				{
		System.out.println(getSubstring(string,y,z));
				}
			}
		}
			
		}
				public static String getSubstring(String text,int startPos,int endPos) {
				String retString = "";
				if((startPos>=0)&&(startPos<endPos)&&(endPos<=text.length()))
				{
				for(int i=startPos;i<endPos;i++){
					retString = retString+text.charAt(i);
				}
				return retString;
				}
				else
				return "Enter Valid start and end positions" ;
			}
		
}

	


