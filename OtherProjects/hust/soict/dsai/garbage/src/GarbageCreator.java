public class GarbageCreator {
    public static void main(String[] args) {
        long start, end;
        String outputString = "";

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            outputString += i;
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        outputString = sb.toString();
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
