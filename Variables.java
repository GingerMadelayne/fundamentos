
package fundamentos;

	class CuentaBancaria {
    public int saldo;
    public static int numero=0;
    
}

    public class Variables{
    public static void sumarSaldo(CuentaBancaria cta){
        cta.saldo+=10;
        
    }
    public static void sumarSaldo (int saldo){
        saldo+=10;
        
}
    public static void main(String[] args){
        CuentaBancaria ct1 = new CuentaBancaria();
  
        ct1.saldo=1000;
        sumarSaldo(ct1);
        sumarSaldo(ct1);
    
        System.out.println("Objeto 1: "+ct1.saldo); //IMPRIME 1020
        
        CuentaBancaria aip = new CuentaBancaria();
        aip.saldo=200;
        sumarSaldo(aip);

        System.out.println("Objeto 2: "+aip.saldo);	//IMPRIME 210
        
        CuentaBancaria aes = new CuentaBancaria();
        aes.saldo=590;
        sumarSaldo(aes);
        sumarSaldo(aes);

        System.out.println("Objeto 3: "+aes.saldo);	//IMPRIME 610
        
        CuentaBancaria ae = new CuentaBancaria();
        ae.saldo=3000;
        sumarSaldo(ae);
        sumarSaldo(ae);
        sumarSaldo(ae);

        System.out.println("Objeto 4: "+ae.saldo);	//IMPRIME 3030
        
        CuentaBancaria aei = new CuentaBancaria();
        aei.saldo=500;
        sumarSaldo(aei);
        sumarSaldo(aei);
        sumarSaldo(aei);
        sumarSaldo(aei);

        System.out.println("Objeto 5: "+aei.saldo);	//IMPRIME 540
        
        CuentaBancaria ct = new CuentaBancaria();
        ct.saldo=4000;
        sumarSaldo(ct);
        sumarSaldo(ct);
        sumarSaldo(ct);
        sumarSaldo(ct);
        sumarSaldo(ct);

        System.out.println("Objeto 6: "+ct.saldo);	//IMPRIME 4050
        
        CuentaBancaria cut = new CuentaBancaria();
        cut.saldo=950;
        sumarSaldo(cut);
        sumarSaldo(cut);
        sumarSaldo(cut);

        System.out.println("Objeto 7: "+cut.saldo);	//IMPRIME 980
        
        CuentaBancaria cba = new CuentaBancaria();
        cba.saldo=2000;
        sumarSaldo(cba);
        sumarSaldo(cba);
        sumarSaldo(cba);
        sumarSaldo(cba);
        sumarSaldo(cba);
        sumarSaldo(cba);

        System.out.println("Objeto 8: "+cba.saldo);	//IMPRIME 2060
        
        CuentaBancaria cta = new CuentaBancaria();
        cta.saldo=2450;
        sumarSaldo(cta);
        sumarSaldo(cta);
        sumarSaldo(cta);
        sumarSaldo(cta);
        sumarSaldo(cta);

        System.out.println("Objeto 9: "+cta.saldo);	//IMPRIME 2500
        
        CuentaBancaria banc = new CuentaBancaria();
        banc.saldo=0;
        sumarSaldo(banc);
        sumarSaldo(banc);
        sumarSaldo(banc);

        System.out.println("Objeto 10: "+banc.saldo);	//IMPRIME 30

    }
}
