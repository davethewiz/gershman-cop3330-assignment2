package ex26;

public class PaymentCalculator {
    public static int calculateMonthsUntilPaidOff(double dailyRate, double balance, double monthlyPayment) {
        double months = -(1d/30d) * Math.log(1 + balance/monthlyPayment * (1 - Math.pow(1 + dailyRate, 30))) / Math.log(1 + dailyRate);
        return (int)Math.ceil(months);
    }
}
