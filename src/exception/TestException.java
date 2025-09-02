package exception;

public class TestException {

    public void getOrder(int orderId) throws OrderNotFount{
        if(orderId==10){
            throw new OrderNotFount("Order not found exception");
        }
    }

    public static void main(String[] args) throws OrderNotFount {
       TestException test= new TestException();
        test.getOrder(10);


    }
}
