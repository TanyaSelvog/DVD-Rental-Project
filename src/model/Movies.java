package model;

public class Movies {

    private String title;
    private int movieID;
    private int movieYear;
    private String movieGenre;
    private String movieDesc;
    private String rating;

    public Movies(String title, int movieID, int movieYear, String movieGenre, String movieDesc, String rating){
        this.title = title;
        this.movieID = movieID;
        this.movieYear = movieYear;
        this.movieGenre = movieGenre;
        this.movieDesc = movieDesc;
        this.rating = rating;
    }

    public Movies(String title,  int movieYear, String rating){
        this.title = title;
        this.movieYear = movieYear;
        this.rating = rating;
    }
    public int getMovieID(){
        return movieID;
    }

    public void setMovieID(int movieID){
        this.movieID=movieID;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getMovieYear(){
        return movieYear;
    }

    public void setMovieYear(int movieYear){
        this.movieYear = movieYear;
    }

    public String getMovieGenre(){
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre){
        this.movieGenre = movieGenre;
    }

    public String getMovieDesc(){
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc){
        this.movieDesc = movieDesc;
    }

    public String getRating(){
        return rating;
    }

    public void setRating(String rating){
        this.rating = rating;
    }
}
