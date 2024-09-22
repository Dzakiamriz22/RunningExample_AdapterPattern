public class Adapter implements TypeC {
    private MicroUsb microUsbPhone;

    public Adapter(MicroUsb microUsbPhone) {
        this.microUsbPhone = microUsbPhone;
    }

    @Override
    public void chargeWithTypeC() {
        System.out.println("Adapter converting USB Type-C to MicroUSB...");
        microUsbPhone.chargeWithMicroUsb();
    }
}
