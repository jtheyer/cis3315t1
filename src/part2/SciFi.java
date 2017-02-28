package part2;

/**
 * This SciFi class is finished. Use it as a model for Horror and Romance.
 *
 * @author John Phillips
 */
public class SciFi extends Book {

    public SciFi(String title, String author) {
        super(title, author);
    }

    @Override
    public String getGenre() {
        return "sci-fi";
    }

    @Override
    public String toString() {
        return "Title " + title + "; Author: " + author + "Genre: sci-fi";
    }
}
