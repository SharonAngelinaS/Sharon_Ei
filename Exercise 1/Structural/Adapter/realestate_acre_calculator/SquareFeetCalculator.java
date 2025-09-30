public class SquareFeetCalculator {
    private Land land;

    public double determineAcreage(Land land) {
        return (land.getLength() * land.getWidth()) / 43560.0; // 1 acre = 43,560 sqft
    }
}