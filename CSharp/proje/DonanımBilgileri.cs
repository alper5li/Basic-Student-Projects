using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Threading;

namespace proje
{
    internal abstract class DonanımBilgileri
    {
        
        private String DonanımAdı="";
        internal uint SeriNumarası=0;     
        internal uint KapasiteByte=0;
        internal String UreticiFirma="";
        internal DateTime KullanılmayaBaslanılanTarih;

      
        internal void SetInfo(String DonanımAdı,uint SeriNumarası,uint KapasiteByte,String UreticiFirma)
        {          
            this.DonanımAdı = DonanımAdı;
            this.SeriNumarası = SeriNumarası;
            this.KapasiteByte = KapasiteByte;
            this.UreticiFirma=UreticiFirma;
            this.KullanılmayaBaslanılanTarih = DateTime.Now;
            Console.WriteLine("Donanım Bilgileri Girildi : " + DonanımAdı+"\n");
            Console.WriteLine(GetInfo()+"\n-----------------------\n");
            
        }
        internal String GetInfo()
        {
            return ("[" + this.DonanımAdı + "] \n"+SeriNumarası + "|" + KapasiteByte + "|" + UreticiFirma + "|" + KullanılmayaBaslanılanTarih);
           
        }

        public abstract void SecretKey();


    }
}
