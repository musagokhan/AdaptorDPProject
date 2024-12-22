package mainWork.directlyHomeEquipment;

import mainWork.powerSs.IPowerSource;

public class Refrigerator implements IAppliance {
    private IPowerSource powerSource;

    @Override
    public void turnOn() {
        if (powerSource != null && powerSource.getVoltage() == 220) {
            System.out.println("Buzdolabı çalışıyor (220V).");
        } else {
            System.out.println("Buzdolabı çalışmıyor: Yanlış voltaj.");
        }
    }

    @Override
    public void plugIn(IPowerSource powerSource) {
    	System.out.println("Buzdolabı fişi takıldı. Durum : ");
        this.powerSource = powerSource;
    }
}
