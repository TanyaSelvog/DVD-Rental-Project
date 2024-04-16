package utils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Movies;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MoviesDB {

    /**
     * Method for getting all Movies (in an Observable List)
     * @return movie - list of all movies
     */
    public static ObservableList<Movies> getMovieList() {
        ObservableList<Movies> moviesList = FXCollections.observableArrayList();

        try {
            String sqlStatement = "SELECT * FROM film where rating != 'NC-17'";
            PreparedStatement ps = ConnectionJDBC.connect().prepareStatement(sqlStatement);

            ResultSet result = ps.executeQuery();
            while (result.next()) {

                String title = result.getString("title");
                int movieYear = result.getInt("release_year");
                String rating = result.getString("rating");

                Movies movie = new Movies(title, movieYear, rating);
                moviesList.add(movie);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return moviesList;
    }
// TODO @ Tanya - Working on June 9
    public static ObservableList<Movies> getGenre(){
        ObservableList<Movies> genreList = FXCollections.observableArrayList();
        try {
            String sqlStatement = "SELECT f.title AS movie_title, f.rating, c.name AS genre, f.release_year FROM film_category p JOIN film f ON p.film_id = f.film_id " +
                    "Join category c ON p.category_id = c.category_id WHERE f.rating IN ('G', 'PG', 'PG-13');";
            PreparedStatement ps = ConnectionJDBC.connect().prepareStatement(sqlStatement);

            ResultSet result = ps.executeQuery();
            while (result.next()) {
                String title = result.getString("title");
                int movieYear = result.getInt("release_year");
                String rating = result.getString("rating");

                Movies movie = new Movies(title, movieYear, rating);
                genreList.add(movie);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return genreList;
    }

    public static ObservableList<Movies> getHorrorList() {
        ObservableList<Movies> horrorList = FXCollections.observableArrayList();

        try {
            String sqlStatement = "SELECT f.title AS movie_title, f.rating, c.name AS genre, f.release_year FROM film_category p JOIN film f ON p.film_id = f.film_id Join category c ON p.category_id = c.category_id WHERE c.name = 'Horror'AND rating != 'NC-17'";

            PreparedStatement ps = ConnectionJDBC.connect().prepareStatement(sqlStatement);

            ResultSet result = ps.executeQuery();
            while (result.next()) {

                String title = result.getString("movie_title");
                int movieYear = result.getInt("release_year");
                String rating = result.getString("rating");

                Movies movie = new Movies(title, movieYear, rating);
                horrorList.add(movie);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return horrorList;

    }

    //created 4.13. - need to edit

    public static ObservableList<Movies> getComedyList() {
        ObservableList<Movies> comedyList = FXCollections.observableArrayList();

        try {
            String sqlStatement = "SELECT f.title AS movie_title, f.rating, c.name AS genre, f.release_year FROM film_category p JOIN film f ON p.film_id = f.film_id Join category c ON p.category_id = c.category_id WHERE c.name = 'Horror'AND rating != 'NC-17'";

            PreparedStatement ps = ConnectionJDBC.connect().prepareStatement(sqlStatement);

            ResultSet result = ps.executeQuery();
            while (result.next()) {

                String title = result.getString("movie_title");
                int movieYear = result.getInt("release_year");
                String rating = result.getString("rating");

                Movies movie = new Movies(title, movieYear, rating);
                comedyList.add(movie);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return comedyList;

    }
}

// public static ObservableList<Movies> getHorror(){
// For future use - June 10
//SELECT f.title AS movie_title,
//f.rating, c.name AS genre,
//f.release_year FROM film_category p JOIN film f ON p.film_id = f.film_id
//Join category c ON p.category_id = c.category_id WHERE c.name IN ('Horror');

//SELECT f.title AS movie_title,
//f.rating, c.name AS genre,
//f.release_year FROM film_category p JOIN film f ON p.film_id = f.film_id
//Join category c ON p.category_id = c.category_id WHERE c.name IN ('Documentary');


//SELECT f.title AS movie_title,
//f.rating, c.name AS genre,
//f.release_year FROM film_category p JOIN film f ON p.film_id = f.film_id
//Join category c ON p.category_id = c.category_id WHERE c.name IN ('Comedy');
