package Network;

/**
 * This class stores information about a post in a social network. 
 * The main part of the post consists of a photo and a caption. 
 * Other data, such as author and timeOfCollision, are also stored.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.1
 */
public class PhotoPost extends Post
{
    private String filename;  // the name of the image file
    private String caption;   // a one line image caption

    /**
     * Constructor for objects of class PhotoPost.
     * 
     * @param author    The username of the author of this post.
     * @param filename  The filename of the image in this post.
     * @param caption   A caption for the image.
     */
    public PhotoPost(String author, String filename, String caption)
    {
        super( author );
        this.filename = filename;
        this.caption = caption;
    }

    /**
     * Return the file name of the image in this post.
     * 
     * @return The post's image file name.
     */
    public String getImageFile()
    {
        return filename;
    }

    /**
     * Return the caption of the image of this post.
     * 
     * @return The image's caption.
     */
    public String getCaption()
    {
        return caption;
    }

    /**
     * Display the details of this post.
     * 
     * (Currently: Print to the text terminal. This is simulating display 
     * in a web browser for now.)
     */
    @Override
    public void display()
    {
        printTitle( "Photo: \t" + caption );
        System.out.println("  [" + filename + "]");
        printTrentData();
    }

    /**
     * Prints an short summary of an post message.
     */
    @Override
    public void printShortSummary()
    {
        System.out.println( String.format( "Photo post from %s", getUsername() ) );
    }
}
