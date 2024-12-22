package mainWork;

import mainWork.powerSs.IPowerSource;
import mainWork.powerSs.Socket220V;
import mainWork.adaptor.VoltageAdaptor5V;
import mainWork.depentAdaptorHomeEq.Phone;
import mainWork.directlyHomeEquipment.IAppliance;
import mainWork.directlyHomeEquipment.Iron;
import mainWork.directlyHomeEquipment.Refrigerator;

public class Manager {

	public static void main(String[] args) {

        IPowerSource socket = new Socket220V();

        IAppliance refrigerator = new Refrigerator();
        IAppliance iron = new Iron();

        refrigerator.plugIn(socket);
        refrigerator.turnOn();
        iron.plugIn(socket);
        iron.turnOn();

        Phone phone = new Phone();
        VoltageAdaptor5V phoneAdaptor = new VoltageAdaptor5V(socket);
        phone.charge(phoneAdaptor.getVoltage());
    }

}
