public class Main {

    public static void main(String[] args) {
        System.out.println("abba".startsWith("ab"));
        System.out.println("abba".endsWith("ab"));
        System.out.println("abba".indexOf('b'));
        System.out.println("abba".lastIndexOf('b'));
        System.out.println("abba".indexOf("ab"));
        System.out.println("abba".lastIndexOf("aba"));
        System.out.println("abba".replace('b','c'));
        System.out.println("abba".replace("bb","rbr"));

        System.out.println("abba".indexOf('b',2));
    }
}

