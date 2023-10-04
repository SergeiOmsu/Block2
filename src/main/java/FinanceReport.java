import java.util.ArrayList;

public class FinanceReport {
    private String name;
    private int date;
    private ArrayList<Payment> payments = new ArrayList<Payment>();

    public FinanceReport(String name, int date){
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public int getSize(){
        return payments.size();
    }

    public void setPayment(int index, Payment payment){
        if (index < payments.size() - 1)
            payments.set(index, payment);
        else
            payments.add(payment);
    }

    public Payment getPayment(int index){
        return payments.get(index);
    }

    public String toString(){
        StringBuilder ret_str = new StringBuilder(String.format("[Автор: %s, дата: %d, Платежи: [\n", name, date));
        for (Payment p: payments){
            ret_str.append(String.format("\tПлательщик: %s, дата: %d.%d.%d сумма: %d руб. %d коп.\n",
                    p.getName(), p.getDate(), p.getMonth(), p.getYear(), (int) p.getSum() / 100, p.getSum() % 100));
        }
        return ret_str.toString();
    }

    public FinanceReport copyPayments(){
        ArrayList<Payment> payments2 = new ArrayList<Payment>();
        Payment p2;
        for (Payment p: payments){
            p2 = new Payment(p.getName(), p.getDate(), p.getMonth(), p.getYear(), p.getSum());
            payments2.add(p2);
        }
        FinanceReport report2 = new FinanceReport(name, date);
        report2.payments = payments2;
        return report2;
    }


}
