public class FinanceReportProcessor {
    static FinanceReport nameSort(FinanceReport report, char symbol){
        FinanceReport report1 = new FinanceReport(report.getName(), report.getDate());
        for (int i = 0; i < report.getSize(); i++){
            if (report.getPayment(i).getName().charAt(0) == symbol)
                report1.setPayment(i, report.getPayment(i));
        }
        return report1;
    }

    static FinanceReport sumSort(FinanceReport report, int sum){
        FinanceReport report1 = new FinanceReport(report.getName(), report.getDate());
        for (int i = 0; i < report.getSize(); i++){
            if (report.getPayment(i).getSum() < sum)
                report1.setPayment(i, report.getPayment(i));
        }
        return report1;
    }
}
