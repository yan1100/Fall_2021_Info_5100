package Q4;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Netflix netflix = new Netflix();

        Genre genre1 = new Genre();
        Genre genre2 = new Genre();

        Movie movie1 = new Movie("Movie1",new GregorianCalendar(1998, Calendar.JULY,6),
                Arrays.asList("Alice","Amy"), "William");
        Movie movie2 = new Movie("Movie2",new GregorianCalendar(2008, Calendar.JULY,9),
                Arrays.asList("Ben","Bryan"), "Kate");
        Movie movie3 = new Movie("Movie3",new GregorianCalendar(1988, Calendar.MAY,10),
                Arrays.asList("Candice","Charlie"), "Julie");
        Movie movie4 = new Movie("Movie4",new GregorianCalendar(2010, Calendar.MAY,21),
                Arrays.asList("Danny","Michelle"), "Jack");

        genre1.movies.add(movie1);
        genre1.movies.add(movie2);
        genre2.movies.add(movie3);
        genre2.movies.add(movie4);

        netflix.genres.add(genre1);
        netflix.genres.add(genre2);

        //get all movies in a list;
        List<Movie> movieList = new ArrayList<>();
        for (Genre genre : netflix.genres) {
            for (Movie movie : genre.movies) {
                movieList.add(movie);
            }
        }


        //For all movies released before 2000, add the string "(Classic)" to the title of the movie using
        //flatMap.
        System.out.println("Task2: add Classic to the title for movie before 2000");
        netflix.genres.stream()
                .flatMap(s -> s.movies.stream())
                .filter(d ->d.releaseDate.get(Calendar.YEAR)<2000 )
                .forEach(t->t.title=( "Classic " + t.title));
        System.out.println(movie2.title);
        System.out.println(movie3.title);
        System.out.println(" ");



        //Get the latest 3 movies released using .limit() method of stream.
        System.out.println("Task3: 3 latest movies");
        List<Movie> list=netflix.genres.stream()
                .flatMap(m -> m.movies.stream())
                .collect(Collectors.toList());
        Collections.sort(list,(m1,m2)->m2.releaseDate.get(Calendar.YEAR)-m1.releaseDate.get(Calendar.YEAR));
        list.stream().limit(3).forEach(movie -> {System.out.println(movie.title + " " + movie.releaseDate.get(Calendar.YEAR));});
        System.out.println(" ");



        //Create a predicate for release date before 2000 and a predicate for release date before 1990
        //and then Chain the predicates for finding movies between 1990 and 2000.
        System.out.println("Task4: Create a predicate");
        List<Movie> movieList2 = filterMovies(movieList,isAfter1990());
        List<Movie> movieList3 = filterMovies(movieList2,isBefore2000());
        for (Movie movie : movieList3) {
            movie.printMovieInformation();
        }
        System.out.println(" ");



        //Write a method which that will add release year in the title of the movie and return the title and
        //then use this method for all the movies.
        System.out.println("Task5: add year to title ");
        for (Movie movie: movieList){
            System.out.println(movie.resetTitleWithYear());
        }
        System.out.println(" ");



        //Sorting on one of the feature(Released year) which will use comparator.
        System.out.println("Task6: Sort movie according to release year ");
        Collections.sort(movieList, Movie.releaseDateComparator);
        for (Movie movie:movieList) {
            movie.printMovieInformation();
        }

    }

    public static Predicate<Movie> isAfter1990() {
        return m -> m.releaseDate.get(Calendar.YEAR) > 1990;
    }

    public static Predicate<Movie> isBefore2000() {
        return m -> m.releaseDate.get(Calendar.YEAR) < 2000;
    }

    public static List<Movie> filterMovies (List<Movie> movies, Predicate<Movie> predicate) {
        return movies.stream()
                .filter(predicate)
                .collect(Collectors.<Movie>toList());
    }

}
