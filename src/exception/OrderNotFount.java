package exception;

public class OrderNotFount extends RuntimeException {

    OrderNotFount(String message){
        super(message);
    }
}
