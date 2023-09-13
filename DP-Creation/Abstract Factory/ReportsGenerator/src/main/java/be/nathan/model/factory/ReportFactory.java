package be.nathan.model.factory;

import be.nathan.model.evaluation.Evaluation;
import be.nathan.model.report.Report;

public interface ReportFactory {
    Report generateReport();
    Evaluation generateEvaluation();
}
