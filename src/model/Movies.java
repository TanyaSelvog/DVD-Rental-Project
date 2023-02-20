package model;

public class Movies {

    private String title;
    private int movieID;

    public Movies(String title, int movieID){
        this.title = title;
        this.movieID = movieID;
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
}
