//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double purchasePrice = 100.00;
        double salesTaxRate = 0.05;
        double salesTax = purchasePrice * salesTaxRate;

        System.out.println("The purchase price is $" + purchasePrice);
        System.out.println("The computed sales tax is $" + salesTax);
    }
}