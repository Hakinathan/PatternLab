package be.nathan.model.factory;

import be.nathan.model.evaluation.CSVEvaluation;
import be.nathan.model.evaluation.Evaluation;
import be.nathan.model.report.CSVReport;
import be.nathan.model.report.Report;

public class CSVFactory implements ReportFactory {
    @Override
    public Report generateReport() {
        return new CSVReport();
    }

    @Override
    public Evaluation generateEvaluation() {
        return new CSVEvaluation();
    }
}
