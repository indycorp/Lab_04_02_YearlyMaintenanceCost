public class LAB_04_02_yearlyMaintenanceCost {
    static void main() {
   double summerCost = 150.00;
   double winterCost = 260.00;
   double springCost = 185.00;
   double fallCost = 200.00;

   double totalCost = summerCost + winterCost + springCost + fallCost;

        IO.println("Spring maintenance cost: $" + springCost);
        IO.println("Summer maintenance cost: $" + summerCost);
        IO.println("Fall maintenance cost: $" + fallCost);
        IO.println("Winter maintenance cost: $" + winterCost);
        IO.println("Total yearly maintenance cost: $" + totalCost);

    }
}
