public class CompoundInterest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate compound interest
        double compoundInterest = principal * Math.pow((1 + (rate / 100)), time) - principal;

        System.out.println("Compound Interest: " + compoundInterest);

        scanner.close();
    }
}
