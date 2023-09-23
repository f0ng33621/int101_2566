package int101.homework01;

public class work02Question {
    public static void main  (String[] args) {
        work02Question(1, 2, 3, 4, 5, 6);
        work02Answer(1, 2, 3, 4, 5, 6);
    }
    static void work02Question(int v1, int v2, int v3, int v4, int v5, int v6) {
        boolean b = ((v1 << v2) < v3) != (v3 > ((v4 ^ v5) | v6));
        System.out.println("Work02:Question: b = " + b);
    }
    static void work02Answer(int v1, int v2, int v3, int v4, int v5, int v6) {
        boolean b = (v1 << v2 < v3) != (v3 > (v4 ^ v5 | v6));
        System.out.println("Work02: Question: b = " + b);
    }
}
