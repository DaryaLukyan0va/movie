package ru.netology.domain;

import org.junit.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {
    @Test
    public void movieName() {
        Movie movie = new Movie();
        movie.setMovieName("");
        String actual = movie.getMovieName();
        String expected = movie.movieName;
        assertEquals(expected, actual);
    }
    @Test
    public void genreName() {
        Movie movie = new Movie();
        movie.setGenreName("");
        String actual = movie.getGenreName();
        String expected = movie.genreName;
        assertEquals(expected, actual);
    }

}
