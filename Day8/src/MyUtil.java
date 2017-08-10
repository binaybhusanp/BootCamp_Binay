/**
 * Created by pradhanb on 7/19/2017.
 */
public class MyUtil {

//    public static Employee[] Sort(Employee[] emp){
//        for (int i = 0; i < emp.length; i++) {
//            for (int j = 0; j < emp.length-i; j++) {
//                if(emp[j].getEmpId() > emp[j+1].getEmpId()) {
//                    Employee temp = emp[j + 1];
//                    emp[j + 1] = emp[j];
//                    emp[j] = temp;
//                }
//            }
//        }
//        return emp;
//    }
//}

    public static Employee[] Sort(Employee[] emp, Comparable comp ){
        for (int i = 0; i < emp.length; i++) {
            for (int j = 0; j < emp.length-i; j++) {
                if(comp.isGreaterThan(emp[j], emp[j+1])>0) {
                    Employee temp = emp[j + 1];
                    emp[j + 1] = emp[j];
                    emp[j] = temp;
                }
            }
        }
        return emp;
    }
}
