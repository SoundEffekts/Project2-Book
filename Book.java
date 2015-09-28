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
    public int borrowed;
    public boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean course)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber="";
        course=courseText;
        
    }
    /**
     * For question 2.83
     */
    private String getAuthor()
    {
        return author;
    }
    /**
     * For question 2.83
     */   
    private String getTitle()
    {
        return title;
    }
    /**
     * For question 2.91
     * 
    */      
    private boolean getCourse()
    {
        return courseText;
    }
    /**
     * For question 2.85
     * 
    */      
    private int getPages()
    {
        return pages;
    }  
    /**
     * For question 2.90
     * 
    */    
    public void borrow()
    {
        borrowed=borrowed+1;
    }  
    /**
     * For question 2.90
     * 
    */       
    private int getBorrowed()
    {
        return borrowed;
    }  
    
    private String getRefNumber()
    {
        return refNumber;
    } 
    /**
     * For question 2.89
     * 
    */        
    public void setRefNumber(String ref)
    {
            if(ref.length()>2)
            {
                refNumber=ref;
            }
            else{
                System.out.println("ERROR: Reference number must be at least three characters.");   
                }
            
                
                
    }
    /**
     * For question 2.84
     */
    private void printAuthor()
    {
        System.out.println("The author for this book is " + author);
    }
    /**
     * For question 2.84
    */    
    private void printTitle()
    {
        System.out.println("The title to this book is " + title);
    }
    /**
     * For question 2.86, 2.88, 2.90
    */      
    public void printDetails()
    {
        if (refNumber.length()>0)
         System.out.println("Title: " + title + ". Author: " + author + ". Pages: " + pages + ". Reference Number: " + refNumber + " This book has been borrowed " + borrowed + " times.");
       else
        System.out.println("ZZZ");
       
    }
    
    
}
