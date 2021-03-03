import Lab7.marketing.sales;

public class total_earnings {
    public static void main(String[] args) {
        sales s = new sales(101, " Atharv ");
        double total = s.earnings(10100) + s.tallowance(1000);
        System.out.println(" Emp ID : " + s.getEmpId() + " Total Earnings : " + total);
    }
}