using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace proje
{
    internal class Bilgisayar
    {
        int count;
        Islemci islemci;
        EkranKartı ekranKartı;
        Ram ram;
        Ssd ssd;
        internal Bilgisayar(Ssd ssd,Islemci islemci,EkranKartı ekranKartı, Ram ram)
        {
            this.ssd = ssd;
            this.islemci = islemci;
            this.ekranKartı = ekranKartı;
            this.ram = ram;
            count++;
        }
        Bilgisayar()
        {
            count++;
        }
        internal void GetInfo()
        {
            Console.WriteLine("Bilgisayar Numarası : " + count);
            islemci.GetInfo();
            ekranKartı.GetInfo();
            ram.GetInfo();
            ssd.GetInfo();
        }
        private void GetSecretKey()
        {
            islemci.SecretKey();
            ekranKartı.SecretKey();
            ram.SecretKey();
            ssd.SecretKey();

        }
    }
}
