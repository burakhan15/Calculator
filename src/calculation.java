import javax.swing.JOptionPane;
public class calculation {

    
    public static void main(String[] args) {
         Double a = new Double(args[0]);
       Double c = new Double(args[2]);
  
       hesapMak hesapla = new hesapMak();
       hesapla.sayi1 = a;
       hesapla.sayi2 = c;

       if (args[1].charAt(0) == '+')
       {

           hesapla.toplam();    //toplam fonksiyonu çağırılıyor
          
       }

       if (args[1].charAt(0) == '-')
       {

           hesapla.cikar();    //cikar fonksiyonu çağırılıyor
       }
       
      if (args[1].charAt(0) == 'x')
       {

           hesapla.carp();    //carp fonksiyonu çağırılıyor
       }

       if (args[1].charAt(0) == '/')
       {

           hesapla.bol();    //bol fonksiyonu çağırılıyor
       }

   }
   
   }

   class hesapMak
   {
       double sayi1;
       double sayi2;
       public void toplam(){
           System.out.println(sayi1 + sayi2);
       }

       public void cikar()
       {
           System.out.println(sayi1 - sayi2);
       }

       public void carp()
       {
           System.out.println((sayi1 * sayi2));
         
       }

       public void bol()
       {
           System.out.println((sayi1) / (sayi2));
       }
    }
    

