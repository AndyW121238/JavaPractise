public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append("d");
        sb.append("e");
        String str = sb.toString();
        System.out.println(sb);
        System.out.println(str);

    }
}
