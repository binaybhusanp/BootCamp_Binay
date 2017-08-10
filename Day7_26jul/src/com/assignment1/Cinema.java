package com.assignment1;

/**
 * Created by pradhanb on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        User user1 = new User(13, "Sushant", 23, 4);
        User user2 = new User(14, "Harshita", 21, 2);
        User user3 = new User(15, "Snigdha", 8, 5);
        User user4 = new User(16, "Harshala", 12, 2);
        User user5 = new User(17, "Mukta", 18, 3);

        try {
            MovieService.buy(user2,3000);
        } catch (InvalidPriceException p) {
            System.out.println(p.getMessage());
        } catch (InvalidRatingException r) {
            System.out.println(r.getMessage());
        }
        try {
            MovieService.watch(user3);
        } catch (InvalidAgeException i) {
            System.out.println(i.getMessage());
        } catch (AgeOutOfRangeException o) {
            System.out.println(o.getMessage());
        }
    }
}
