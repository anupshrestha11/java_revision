package Interface;

public class Main {
    public static void main(String[] args) {
        ITelephone anupsPhone;
        anupsPhone = new DeskPhone(123456);
        anupsPhone.powerOn();
        anupsPhone.callPhone(123456);
        anupsPhone.answer();

        anupsPhone = new MobilePhone(123456);
        anupsPhone.powerOn();
        if (anupsPhone.callPhone(123456)) {
            anupsPhone.answer();
        }
    }
}
