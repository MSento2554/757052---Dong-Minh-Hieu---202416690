public class ConcatenationInLoops {
    public static void main(String[] args) {
        long start;
        String s = "";

        start = System.currentTimeMillis();
        for (int i = 0; i < 65536; i++) {
            s += i % 2;
        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb.append(i % 2);
        }
        s = sb.toString();
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < 65536; i++) {
            sbuf.append(i % 2);
        }
        s = sbuf.toString();
        System.out.println(System.currentTimeMillis() - start);
    }
}
