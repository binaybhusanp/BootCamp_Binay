package com.assignment1;

/**
 * Created by pradhanb on 7/26/2017.
 */
public class MovieService {
    private double price;
    public static void buy (User user, double price) throws InvalidPriceException,InvalidRatingException {
        if (price< 2000 ){
            if(price < 0) {
                InvalidPriceException priceException = new InvalidPriceException("Price can't be negetive");
                throw priceException;
            }
            InvalidPriceException priceException = new InvalidPriceException("Price must be above Rs.2000/-");
            throw  priceException;
        }
        if(user.getRating()<3){
            InvalidRatingException invalidRatingException = new InvalidRatingException("Users can't be rated below 3");
            throw invalidRatingException;
        }

    }
    public static void watch(User user) throws InvalidAgeException,AgeOutOfRangeException {
        if(user.getAge()<20){
            if(user.getAge()<10){
                if(user.getAge()<0) {
                    InvalidAgeException invalidAgeException = new InvalidAgeException("Age can't be negetive");
                    throw invalidAgeException;
                }
                AgeOutOfRangeException ageOutOfRangeException = new AgeOutOfRangeException("Age is below 10");
                throw ageOutOfRangeException;
            }
            AgeOutOfRangeException ageOutOfRangeException = new AgeOutOfRangeException("Age is below 20");
            throw ageOutOfRangeException;
        }
    }
}
