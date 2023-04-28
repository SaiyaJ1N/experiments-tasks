public class PrincipalInBank {

    public static void main(String[] args) {
        int resultYear = calculateYears(1000,0.05,0.18,1100);
        System.out.println(resultYear);
    }

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int years = 0;

        while(principal < desired){
            principal += ((interest * principal) - (interest * principal * tax));
            years++;
        }

        return years;
    }
}