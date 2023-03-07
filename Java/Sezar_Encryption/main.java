
public class main extends Sezar{
	
	
	
public static void main(String[] args) throws InterruptedException 
{
 
	Sezar Kripto = new Sezar();
	
	
	Kripto.Encrypt("Alper Beþli", 23);
//  Þifreleme Ýþlemi için ("Þifrelenecek Yazý",Anahtar Numara)
	
	Kripto.Decrypt("MxCqDlNqFxü", 23);
//  Deþifreleme Ýþlemi için ("Þifrelenmiþ Yazý",Anahtar Numara)
	
	Kripto.BruteForce("MxCqDlNqFxü", 40);
//  BruteForce için ("Þifrelenmiþ Yazý",Denenecek Anahtar Sayýsý)
	
}


}
