package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
    private int limitManager;

    public MovieManager(int limitManager) {
        this.limitManager = limitManager;
    }

    public MovieManager() {
        this.limitManager = 10;
    }

    private Movie[] movies = new Movie[0];

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] getMoviesForFeed() {
        int resultLimited;
        if (limitManager > movies.length) {
            resultLimited = movies.length;
        } else {
            resultLimited = limitManager;
        }

        Movie[] result = new Movie[resultLimited];

        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}


