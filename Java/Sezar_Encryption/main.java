
public class main extends Sezar{
	
	
	
public static void main(String[] args) throws InterruptedException 
{
 
	Sezar Kripto = new Sezar();
	
	
	Kripto.Encrypt("Alper Be�li", 23);
//  �ifreleme ��lemi i�in ("�ifrelenecek Yaz�",Anahtar Numara)
	
	Kripto.Decrypt("MxCqDlNqFx�", 23);
//  De�ifreleme ��lemi i�in ("�ifrelenmi� Yaz�",Anahtar Numara)
	
	Kripto.BruteForce("MxCqDlNqFx�", 40);
//  BruteForce i�in ("�ifrelenmi� Yaz�",Denenecek Anahtar Say�s�)
	
}


}
