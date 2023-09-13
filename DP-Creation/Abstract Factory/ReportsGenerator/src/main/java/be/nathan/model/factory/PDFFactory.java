package be.nathan.model.factory;

import be.nathan.model.evaluation.Evaluation;
import be.nathan.model.evaluation.PDFEvaluation;
import be.nathan.model.report.PDFReport;
import be.nathan.model.report.Report;

public class PDFFactory implements ReportFactory {
    @Override
    public Report generateReport() {
        return new PDFReport();
    }

    @Override
    public Evaluation generateEvaluation() {
        return new PDFEvaluation();
    }
}
