package part2;

/**
 * Set the genre to romance. See SciFi example...
 *
 * @author Your name
 */
public class Romance extends Book {

public Romance(String title, String author) {
    super(title, author);
}
@Override
public String getGenre(){
    return "Romance";
}
}
