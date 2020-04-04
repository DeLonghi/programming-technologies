package sync;

public class U1901Bank {
    private int intTo;
    private int intFrom = 220;

    synchronized void calc(int intTransaction, long lngTimeout) {
        System.out.println("(Before) intTo: " + intTo + "    intFrom: " + intFrom + "     currentThread: "
                + Thread.currentThread().getName());
        intFrom -= intTransaction;

        try {
            Thread.sleep(lngTimeout);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        intTo += intTransaction;
        System.out.println("(After) intTo: " + intTo + "    intFrom: " + intFrom + "     currentThread: "
                + Thread.currentThread().getName());
    }
}