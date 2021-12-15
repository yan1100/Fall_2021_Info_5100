package Q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Netflix {
    List<Genre> genres;

    public Netflix() {
        this.genres = new ArrayList<>();
    }

    public List<Movie> get3LatestMovies() {
        List<Movie> movieList = new ArrayList<>();
        for (Genre g : genres) {
            for (Movie m : g.movies) {
                movieList.add(m);
            }
        }
        Collections.sort(movieList, Movie.releaseDateComparator);
        return movieList.subList(0,3);
    }
}
