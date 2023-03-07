
public class Sezar {
	public String alphabet = " abcçdefgðhýijklmnoöpqrsþtuüvwxyzABCÇDEFGÐHIÝJKLMNOÖPQRSÞTUÜVWXYZ";
	//                        (mod65) with space 
	public void Encrypt(String text,int key) 
	{
	String Empty="";
	
		for(int i=0;i<text.length();i++) 
		{
			int j=0;
			while(text.charAt(i)!=alphabet.charAt(j)) {
				j++;
			}
			char replace = alphabet.charAt((j+key)%65);
			//char replace = alphabet.charAt((i+j+key)%64);
			Empty += replace;
			
		}
		
		
		 System.out.println("Text = "+ text);
		 System.out.println("Cipher Text = "+ Empty);
		 
	}
	
	public void Decrypt(String text, int key) {
		String Empty="";
		for (int i=0; i<text.length();i++) 
		{
			char replace;
			int j=0;
			while(text.charAt(i)!=alphabet.charAt(j)) {
				j++;
			}
			
			if ((j-key)< 0) 
			{
				replace = alphabet.charAt(((j-key)*(-1))%65);
			}
			else 
			{
				replace = alphabet.charAt(((j-key)%65));
			}
			
			//char replace = alphabet.charAt((i+j+key)%64);
			Empty += replace;
		}
		System.out.println("Decrypted = "+Empty);
	}
	
	public void BruteForce(String text, int keyAttempt) throws InterruptedException 
	{
		System.out.println("[*] Will try to decrypt this text --> ["+text+"]");
		System.out.println("[*] Starting BruteForce in 3 seconds...");
		
		Thread.sleep(3000);
		for (int i=1;i<keyAttempt;i++) 
		{
			
			String Complete="";
			
			
			for(int j=0;j<text.length();j++) 
			{
				char replace;
				int k=0;
				while(text.charAt(j)!=alphabet.charAt(k)) {
					k++;
				}
				if ((k-i)< 0) 
				{
					replace = alphabet.charAt(((k-i)*(-1))%65);
				}
				else 
				{
					replace = alphabet.charAt(((k-i)%65));
				}
				
				
				//char replace = alphabet.charAt((i+j+key)%64);
				Complete += replace;
				
			}			
			
			System.out.println("[*]  Key ["+i+"] Output -->  ["+Complete+"]");
			
		}
		
	}
}
