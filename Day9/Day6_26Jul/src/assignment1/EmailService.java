package assignment1;

/**
 * Created by pradhanb on 7/25/2017.
 */
class EmailService  {

    void sendEmail(String user,String email,String message){
        if(LocationService.checkLocation(LocationService.retrieveLocation(email))){
            if(SecurityService.checkPermission(user)){
                if(SecurityService.exists(email)){
                    System.out.println("Email is sent to "+email+ " with message : "+message);
                }
            }
        }
    }


}