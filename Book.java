/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    public String author;
    public String title;
    public int pages;
    public String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber="";
        
    }
    /**
     * Returns the author of the book
     * @return author
     */
    private String getAuthor()
    {
        return author;
    }
    
    private String getTitle()
    {
        return title;
    }
    
    private int getPages()
    {
        return pages;
    }  

    private String getRefNumber()
    {
        return refNumber;
    } 
    
    public void setRefNumber(String ref)
    {
            if(refNumber.length()>2)
                refNumber=ref;
            else(
                System.out.println("ERROR: Reference number must be at least three characters."));
                
                
    }
    private void printAuthor()
    {
        System.out.println("The author for this book is " + author);
    }
    
    private void printTitle()
    {
        System.out.println("The title to this book is " + title);
    }
    
    public void printDetails()
    {
        if (refNumber.length()>0)
         System.out.println("Title: " + title + ". Author: " + author + ". Pages: " + pages + ". Reference Number: " + refNumber);
       else
        System.out.println("ZZZ");
       
    }
    
    
}
