import java.util.Date;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

public class BMSService  {

    List<CinemaHall> cinemas;

    public List<Movie> getMovies(Date date, String city) {
        return null;
    }

    public List<CinemaHall> getCinemalHalls(String city) {
        return null;
    }

}

public class CinemaHall {

    int cinemaHallId;
    String cinemaHallName;

    Address address;

    List<Audi>audiList;

    public Map<Date, Movie> getMovies(List<Date> dateList) {
        return null;
    }

    public Map<Date, Show> getShows(List<Date> dateList) {
        return null;
    }

}

public class Address {

    int pinCode; //ZipCode
    String street;
    String city;
    String state;
    String country;

}

public class Audi {

    int audiId;
    String audiName;
    int totalSeats;

    List<Show> shows;

}

public class Show {

    int showId;
    Movie movie;
    Date startTime;
    Date endTime;
    CinemaHall cinemaPlayedAt;
    List<Seat> seats;

}

public class Seat {

    int seatId;
    SeatType seatType;
    SeatStatus seatStatus;
    Double price;

}


public enum SeatType {

    DELUX, VIP, ECONOMY, OTHER;

}

public enum SeatStatus {

    BOOKED, AVAILABLE, RESERVED, NOT_AVAILABLE;

}

public class Movie {

    String movieName;
    int movieId;
    int durationInMins;
    String language;
    Genre genre;
    Date releaseDate;
    Map<String, List<Show>> cityShowMap;

}

public enum Genre {

    SCI_FI, DRAMA, ROM_COM, FANTASY;
}

public class User {

    int userId;
    Search searchObj;

}

public class SystemMember extends User {

    Account account;
    String name;
    String email;
    Address address;

}



public abstract class Member extends SystemMember {

    public abstract Booking makeBooking(Booking booking);
    public abstract List<Booking> getBooking();

}

public abstract class Admin extends SystemMember {

    public abstract boolean addMovie(Movie moivie);
    public abstract boolean addShow(Show show);

}

public class Account {

    String userName;
    String password;

}

public abstract class Search {

    public abstract List<Movie> searchMoviesByNames(String name);
    public abstract List<Movie> searchMoviesByGenre(Genre genre);
    public abstract List<Movie> searchMoviesByLanguage(String language);
    public abstract List<Movie> searchMoviesByDate(Date releaseDate);
}

public abstract class Booking {

    String bookingId;
    Date bookingDate;
    Member member;
    Audi audi;
    Show show;
    BookingStatus bookingStatus;
    double totalAmount;
    List<Seat> seats;
    Payment paymentObj;

    public abstract boolean makePayment(Payment payment);

}

public class Payment {

    double amount;
    Date paymentDate;
    int transactionId;
    PaymentStatus paymentStatus;

}

public enum BookingStatus {

    REQUESTED, PENDING, CONFIRMED, CANCELLED;
}

public enum PaymentStatus {

    UNPAID, PENDING, COMPLETED, DECLINED, CANCELLED, REFUNDED;

}
}