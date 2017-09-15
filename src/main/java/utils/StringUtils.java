package utils;

public class StringUtils {

    public static boolean isEmpty(String data){
        return data.length() == 0;
    }

    public static boolean hasNoValue(String data){
        return data == "";
    }
}
