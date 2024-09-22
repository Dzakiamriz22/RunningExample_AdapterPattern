public class Client {
    public static void main(String[] args) {
        // Client only knows the UsbTypeC interface
        TypeC usbTypeCPhone = new Adapter(new MicroUsb());

        // Client can charge using USB Type-C
        usbTypeCPhone.chargeWithTypeC();
    }
}
