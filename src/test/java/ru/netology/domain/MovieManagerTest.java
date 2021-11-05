package ru.netology.domain;

import org.junit.Test;
import ru.netology.manager.MovieManager;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {
    Movie first = new Movie("Дом-монстр", "мультфильм");
    Movie second = new Movie("Прочь", "ужасы");
    Movie third = new Movie("Золотой компас", "фантастика");
    Movie fourth = new Movie("Побег из Шоушенга", "драмма");
    Movie fifth = new Movie("Интерстеллар", "фантастика");
    Movie sixth = new Movie("Криминальное чтиво", "криминал");
    Movie seventh = new Movie("Клаус", "семейный");
    Movie eighth = new Movie("Джентельмены удачи", "комедия");
    Movie ninth = new Movie("Остров проклятых", "триллер");
    Movie tenth = new Movie("А зори здесь тихие", "военный");
    Movie eleventh = new Movie("Душа", "мультфильм");



    @Test
    public void lastTenMovies() {
        MovieManager movieManager = new MovieManager();
        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);
        movieManager.add(fourth);
        movieManager.add(fifth);
        movieManager.add(sixth);
        movieManager.add(seventh);
        movieManager.add(eighth);
        movieManager.add(ninth);
        movieManager.add(tenth);
        movieManager.add(eleventh);
        Movie[] actual = movieManager.getMoviesForFeed();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);


    }

    @Test
    public void lastFiveMovies() {
        MovieManager movieManager = new MovieManager(5);
        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);
        movieManager.add(fourth);
        movieManager.add(fifth);
        movieManager.add(sixth);
        movieManager.add(seventh);
        movieManager.add(eighth);
        movieManager.add(ninth);
        movieManager.add(tenth);
        movieManager.add(eleventh);
        Movie[] actual = movieManager.getMoviesForFeed();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void lastSevenMovies() {
        MovieManager movieManager = new MovieManager();
        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);
        movieManager.add(fourth);
        movieManager.add(fifth);
        movieManager.add(sixth);
        movieManager.add(seventh);
        movieManager.add(eighth);
        Movie[] actual = movieManager.getMoviesForFeed();
        Movie[] expected = new Movie[]{eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);

    }
}