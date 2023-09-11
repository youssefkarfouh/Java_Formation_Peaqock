import java.math.BigDecimal;

/*6187.50 000
5 years

principal => 4500
interest 7.5*/


public class InterestCalculator {

    BigDecimal principle;
    BigDecimal interest;

    public InterestCalculator(String principle, String interest) {
        this.principle = new BigDecimal(principle);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }


    public BigDecimal calculateTotalValue(int nbOfYear) {

        BigDecimal years = new BigDecimal(nbOfYear);

        return principle.add(principle.multiply(interest).multiply(years));

    }
}
