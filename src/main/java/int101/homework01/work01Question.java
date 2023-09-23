package int101.homework01;

public class work01Question {
    public static void main (String[] args){
        work01Question(true, false, true, false, true, false);
        work01Answer(true, false, true, false, true, false);
    }
    static void work01Question(boolean b1, boolean b2, boolean b3,
                               boolean b4, boolean b5, boolean b6) {
        boolean b = ((b1 ^ (b2 | b3)) && b4) || (b5 & b6);
        System.out.println("Work01:Question: b = " + b);
    }
    static void work01Answer(boolean b1, boolean b2, boolean b3,
                             boolean b4, boolean b5, boolean b6) {
        boolean b = (b1 ^ b2 | b3 && b4) || (b5 & b6);
        System.out.println("Work01:Answer: b = " + b);
    }
}
