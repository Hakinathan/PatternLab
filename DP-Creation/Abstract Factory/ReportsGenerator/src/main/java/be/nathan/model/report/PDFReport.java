package be.nathan.model.report;

public class PDFReport implements Report {
    @Override
    public void generate() {
        System.out.println("PDF report generated");
    }
}
