package Q4;

import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;

public class Movie {
    String title;
    GregorianCalendar releaseDate;
    List<String> actors;
    String  director;

    public Movie(String title, GregorianCalendar releaseDate, List<String> actors, String director) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.actors = actors;
        this.director = director;

    }

    public static final Comparator<Movie> releaseDateComparator = new Comparator<Movie>(){

        @Override
        public int compare(Movie m1, Movie m2) {
            return m2.releaseDate.compareTo(m1.releaseDate);
        }
    };

    public void printMovieInformation() {
        System.out.print("Title : " + title + " | Release Date: " + releaseDate.getTime() +
                       " | Actors: ");
        printActors();
        System.out.println("| Directors: " + director);
    }

    public void printActors() {
        for (String a : actors) {
            System.out.print(a + " ");
        }
    }

    public String resetTitleWithYear(){
        title = releaseDate.get(Calendar.YEAR) + " " + title;
        return title;
    }

}
