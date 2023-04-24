public class AlphabeticWar {
    public static void main(String[] args) {
        String al = alphabetWar("zsdbqm");
        System.out.println(al);
    }
    public static String alphabetWar(String fight){
        int leftSide = 0;
        int rightSide = 0;
        for(int i = 0; i < fight.length(); i++){
            switch(fight.charAt(i)){
                case 'z' : rightSide++;
                    break;
                case 'd' : rightSide += 2;
                    break;
                case 'q' : rightSide += 3;
                    break;
                case 'm' : rightSide += 4;
                    break;

                case 's' : leftSide++;
                    break;
                case 'b' : leftSide += 2;
                    break;
                case 'p' : leftSide += 3;
                    break;
                case 'w' : leftSide += 4;
                    break;
            }
        }
        return leftSide == rightSide ? "Let's fight again!" : rightSide > leftSide ? "Right side wins!" : "Left side wins!";
    }
}
