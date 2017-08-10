package assignment1;

/**
 * Created by pradhanb on 7/25/2017.
 */
public class SecurityService {
    static boolean exists(String email){
        //20 loc to check in DB
        if(email.endsWith("@yahoo.com")) {
            return true;
        }else{
            return false;
        }
    }

    static boolean checkPermission(String user){
        //20 loc to check in DB
        if(user.equals("admin")) {
            return true;
        }else{
            return false;
        }
    }
}
