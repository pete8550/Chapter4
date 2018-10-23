import java.util.Random;

public class FourSixteen {

    public static void main(String[] args) {

        int n = (int)(65 + Math.random() * 26);
        char c = (char) n;
        c = Character.toLowerCase(c);

        System.out.println(c);
    }
}
