public class Movie {

    String title;
    double rating;
    int year;


    public Movie (String title, double rating, int year){
        this.title = title;
        this.rating = rating;
        this.year = year;
    }


    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
