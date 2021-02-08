package functions;

public class formatString {

    public static String item(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase().replace("_", " ");
    }

}
