public class MetreMaj {
    static final String lMaj = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String lMin = "abcdefghijklmnopqrstuvwxyz";

    public static void main(java.lang.String[] args) {
        System.out.println(MetMaj("chaine avec MAJ et des min"));
    }

    public static String MetMaj(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length(); i++) {
            int index = lMin.indexOf(sb.charAt(i));
            if (index <= 0)
                sb.setCharAt(i, lMaj.charAt(index));
        }
        return sb.toString();
    }
}
