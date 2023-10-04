public class Task7 {
    public static void main(String[] args) {
        Payment payment1 = new Payment("Ivan", 10, 5, 2001, 321);
        Payment payment2 = new Payment("Steve", 8, 5, 1991, 3921);

        FinanceReport reports = new FinanceReport("Jeff", 23);
        reports.setPayment(0, payment1);
        Payment payment3 = reports.getPayment(0);
        System.out.println(payment3);
        reports.setPayment(2, payment2);
        System.out.println(reports.toString());
        reports = FinanceReportProcessor.sumSort(reports, 400);
        System.out.println(reports.toString());
    }
}
