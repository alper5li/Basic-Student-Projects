
public class main extends Sezar{
	
	
	
public static void main(String[] args) throws InterruptedException 
{
 
	Sezar Kripto = new Sezar();
	
	
	Kripto.Encrypt("Alper Besli", 23);
//  Sifreleme islemi icin ("Sifrelenecek Yazi",Anahtar Numara)
	
	Kripto.Decrypt("XIMBOwYBPIF",23);
//  Desifreleme Islemi icin ("Sifrelenmis Yazi",Anahtar Numara)
	
	Kripto.BruteForce("XIMBOwYBPIF", 40);
//  BruteForce icin ("Sifrelenmis Yazi",Denenecek Anahtar Sayisi)
	
}


}
