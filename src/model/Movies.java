package model;

public class Movies {

    private String title;
    private int movieID;
    private int movieYear;
    private String movieGenre;
    private String movieDesc;

    public Movies(String title, int movieID, int movieYear, String movieGenre, String movieDesc){
        this.title = title;
        this.movieID = movieID;
        this.movieYear = movieYear;
        this.movieGenre = movieGenre;
        this.movieDesc = movieDesc;
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
}
