public class AlphabeticWar {
    public static void main(String[] args) {
        String al = alphabetWar("zsdbqm");
        System.out.println(al);
    }

    public static String alphabetWar(String fight) {
        int leftSide = 0;
        int rightSide = 0;
        for (int i = 0; i < fight.length(); i++) {
            switch (fight.charAt(i)) {
                case 'z' -> rightSide++;
                case 'd' -> rightSide += 2;
                case 'q' -> rightSide += 3;
                case 'm' -> rightSide += 4;
                case 's' -> leftSide++;
                case 'b' -> leftSide += 2;
                case 'p' -> leftSide += 3;
                case 'w' -> leftSide += 4;
            }
        }
        return leftSide == rightSide ? "Let's fight again!" : rightSide > leftSide ? "Right side wins!" : "Left side wins!";
    }
}
