package be.nathan.model.report;

public class CSVReport implements Report {
    @Override
    public void generate() {
        System.out.println("CSV report generated");
    }
}
