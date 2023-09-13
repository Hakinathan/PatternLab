package be.nathan;

import be.nathan.model.evaluation.Evaluation;
import be.nathan.model.factory.CSVFactory;
import be.nathan.model.factory.PDFFactory;
import be.nathan.model.factory.ReportFactory;
import be.nathan.model.report.Report;

public class Application {
    public static void main(String[] args) {

        //The abstract factory pattern in action :)
        ReportFactory reportPDFFactory = new PDFFactory();
        Report report = reportPDFFactory.generateReport();
        Evaluation evaluation = reportPDFFactory.generateEvaluation();
        report.generate();
        evaluation.evaluate();

        ReportFactory reportPDFFactory2 = new CSVFactory();
        Report report2 = reportPDFFactory2.generateReport();
        Evaluation evaluation2 = reportPDFFactory2.generateEvaluation();
        report2.generate();
        evaluation2.evaluate();
    }
}