
using proje;


Bilgisayar[] BilgisayarListesi = new Bilgisayar[10]; 

// Örnek Bir uygulama // 
Ssd SSD = new Ssd();
Islemci Islemci = new Islemci();
EkranKartı EkranKartı = new EkranKartı();
Ram Ram = new Ram();

SSD.SetInfo("SSD", 19366481, 4194304, "HyperX");
Islemci.SetInfo("İşlemci", 125672234, 82738, "AMD");
EkranKartı.SetInfo("Ekran Kartı", 55123, 66233, "ASUS");
Ram.SetInfo("Ram", 351321, 224242, "Cougar");
Console.ReadLine();
Console.WriteLine("\n\n\n--------------------------------------------------\n");
SSD.SecretKey();
Islemci.SecretKey();
EkranKartı.SecretKey();
Ram.SecretKey();

Bilgisayar Bilgisayar = new Bilgisayar(SSD, Islemci, EkranKartı, Ram);
BilgisayarListesi[1] = Bilgisayar;
Bilgisayar.GetInfo();
