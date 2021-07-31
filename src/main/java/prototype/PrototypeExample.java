package prototype;

public class PrototypeExample {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns in Java");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Idiocracy");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());

        Movie thirdMovie = (Movie) registry.createItem("Movie");
        thirdMovie.setTitle("Godzilla");

        System.out.println(thirdMovie);
        System.out.println(thirdMovie.getRuntime());
        System.out.println(thirdMovie.getTitle());
        System.out.println(thirdMovie.getUrl());

        Book book = (Book) registry.createItem("Book");
        book.setTitle("My Book");

        System.out.println(book);
        System.out.println(book.getNumberOfPages());
        System.out.println(book.getTitle());
        System.out.println(book.getUrl());
    }
}
