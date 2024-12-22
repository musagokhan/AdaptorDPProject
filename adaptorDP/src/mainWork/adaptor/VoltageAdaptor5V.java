package mainWork.adaptor;

import mainWork.powerSs.IPowerSource;

//Adaptor sınıfı: 220V'u 5V'a dönüştürür.
public class VoltageAdaptor5V implements IPowerSource {
	 private IPowerSource powerSource;
	
	 public VoltageAdaptor5V(IPowerSource powerSource) {
	     this.powerSource = powerSource;
	 }
	
	 @Override
	 public int getVoltage() {
	     int voltage = powerSource.getVoltage();
	     if (voltage == 220) {
	         System.out.println("Adaptor: 220V'u 5V'a dönüştürüldü.");
	         return 5;
	     } else {
	         System.out.println("Adaptor: Desteklenmeyen voltaj! Dönüşüm yapılamıyor.");
	         return 0;
	     }
	 }
}