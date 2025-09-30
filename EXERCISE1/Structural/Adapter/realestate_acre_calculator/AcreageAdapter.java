public class AcreageAdapter {
    SquareFeetCalculator calculator;

    public AcreageAdapter() {
        calculator = new SquareFeetCalculator();
    }

    public double getAcreage(Estate estate) {
        // Convert Estate (sqft) into Land equivalent
        double area = estate.getAreaInSqft();
        Land land = new Land(Math.sqrt(area), Math.sqrt(area)); // assume square plot
        return calculator.determineAcreage(land);
    }
}