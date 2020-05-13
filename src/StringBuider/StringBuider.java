package StringBuider;

public class StringBuider {
    public static void main(String[] args) {
        StringBuffer buider1 = new StringBuffer("Hello");
        buider1.append("Word");
        System.out.println(buider1);
        //check time
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Hello");
        for (int i=0; i<100000; i++){
            buffer.append("Word");
        }
        System.out.println("StringBuffer is: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder buider = new StringBuilder("Hello");
        for (int i=0; i<100000; i++){
            buider.append("Word");
        }
        System.out.println("StringBuilder is: " + (System.currentTimeMillis() - startTime) + "ms");

    }
}
