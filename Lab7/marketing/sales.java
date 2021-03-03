package Lab7.marketing;

public class sales extends Lab7.general.employee {
    public sales(int empid, String ename) {
        super(empid, ename);
    }

    public int getEmpId() {
        return empid;
    }

    public double tallowance(int basic) {
        return 0.05 * earnings(basic);
    }
}