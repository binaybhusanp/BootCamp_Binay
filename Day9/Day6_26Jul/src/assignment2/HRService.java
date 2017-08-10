package assignment2;
//package name should always be in small letters
public class HRService {
    private final EmployeeService employeeSrevice;

    public HRService(EmployeeService employeeSrevice) {
        this.employeeSrevice = employeeSrevice;
    }

    boolean eligibleForPromotion(String desig) {
        if (employeeSrevice.getDesig().equals(desig)) {
            return true;
        } else
            return false;
    }

    String changeProject() {
        return "You are not eligible to change Project at this moment";
    }

    boolean changeDesignation(String desig) {
        if (eligibleForPromotion(desig)) {
            return true;
        } else
            return false;
    }
}