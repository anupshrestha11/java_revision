package Interface;

public interface ITelephone {

    //this methods must be declered where this interface is implemented
     void powerOn();
     void dial(int phoneNumber);
     void answer();
     boolean callPhone(int phoneNumber);
     boolean isRinging();

    }
