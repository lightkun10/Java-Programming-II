package creating_generic_interfaces;

/*
Below, the class MovieList defines the type parameter when
it implements List. The MovieList is meant only for handling movies.
*/

import creating_generic_interfaces.List;

public class MovieList implements List<Movie> {

    // object variables

    @Override
    public void add(Movie value) {
        // implementation
    }

    @Override
    public Movie get(int index) {
        // implementation
    }

    @Override
    public Movie remove(int index) {
        // implementation
    }

}
