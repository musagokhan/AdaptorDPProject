package mainWork.depentAdaptorHomeEq;

//5V ile çalışan cihaz
public class Phone {
	 public void charge(int voltage) {
	     if (voltage == 5) {
	         System.out.println("Telefon şarj oluyor (5V).");
		 } else {
		     System.out.println("Hata: Telefon yalnızca 5V ile çalışır.");
		 }
	}
}