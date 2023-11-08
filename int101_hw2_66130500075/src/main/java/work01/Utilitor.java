package work01;

public class Utilitor {
    public static String testString(String value){
        if(value == null){
            throw new NullPointerException();
        }
        if(value.isBlank()){
            throw new IllegalArgumentException();
        }
        return value;

    }
    public static Double testPositive(Double value){
        if (value>=0.0){
            return value;
        }
        else{
            throw new IllegalArgumentException("Must be positive");
        }
    }
    public static long computeIsbn10(long isbn10){
        int output;
        long total=0L,count=2L;
        while(isbn10>0){
            total += ((isbn10%10L)*count);
            isbn10 = isbn10 / 10L;
            count++;

        }
        output = (int) ((11-(total)%11)%11);
        return output;
    }
}
