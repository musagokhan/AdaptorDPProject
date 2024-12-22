package mainWork.directlyHomeEquipment;

import mainWork.powerSs.IPowerSource;

public class Iron implements IAppliance {
    private IPowerSource powerSource;

    @Override
    public void turnOn() {
        if (powerSource != null && powerSource.getVoltage() == 220) {
            System.out.println("Ütü çalışıyor (220V).");
        } else {
            System.out.println("Ütü çalışmıyor: Yanlış voltaj.");
        }
    }

    @Override
    public void plugIn(IPowerSource powerSource) {
    	System.out.println("ütü fişi takıldı. Durum : ");
        this.powerSource = powerSource;
    }
}
