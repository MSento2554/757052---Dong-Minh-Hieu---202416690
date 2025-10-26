public class NoGarbage {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 200000; i++) {
            sb.append(i);
        }
        String result = sb.toString();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("Done");
    }
}
