interface third{
    String size(String str);
}
public class intBlocks {
    public static void main(String args[]) {
        third stroka = (str) -> {
            int size = str.length();
            str = "Длина=" + size;
            return str;
        };
        System.out.println(stroka.size("VASYA"));
    }
}