package mainWork.directlyHomeEquipment;

import mainWork.powerSs.IPowerSource;

public interface IAppliance {
    void turnOn();
    void plugIn(IPowerSource powerSource);
}
