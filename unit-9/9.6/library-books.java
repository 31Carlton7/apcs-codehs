Novel.java:
----------
public class Novel extends Book
{
    // Start here!
    public String genre;
    public int pages;
    
    public Novel(String title, String author, String genre, int pages) 
    {
        super(title, author);
        this.genre = genre;
        this.pages = pages;
    }
    
    public String getGenre() 
    {
        return genre;
    }
    
    public int getPages() 
    {
        return pages;
    }
    
    public void setGenre(String newGenre) 
    {
        genre = newGenre;
    }
    
    public void setPages(int newPages) 
    {
        pages = newPages;
    }
    
    public String toString()
    {
        return "Title: " + super.getTitle() + 
                "\nAuthor: " + super.getAuthor() +
                "\nGenre: " + getGenre() +
                "\nPages: " + getPages();
    }
}


TextBook.java:
-------------
public class TextBook extends Book
{
    // Start here!
    public String subject;
    public String edition;
    
   public TextBook(String title, String author, String subject, String edition)
   {
       super(title, author);
       this.subject = subject;
       this.edition = edition;
   }
   
   public String getSubject() 
    {
        return subject;
    }
    
    public String getEdition() 
    {
        return edition;
    }
    
    public void setSubject(String newSubject) 
    {
        subject = newSubject;
    }
    
    public void setEdition(String newEdition) 
    {
        edition = newEdition;
    }
    
    public String toString()
    {
        return "Title: " + getTitle() + 
                "\nAuthor: " + getAuthor() +
                "\nSubject: " + getSubject() +
                "\nEdition: " + getEdition();
    }

}


BookTester.java:
---------------
import java.util.ArrayList;

public class BookTester
{
    public static void main(String[] args)
    {
        // Start here!
        
        // Create Library
        ArrayList<Object> library = new ArrayList<>();
        
        // Create [TextBook]
        TextBook one = new TextBook("English", "Jeffrey D.", "Honors", "3");
        TextBook two = new TextBook("Math", "Sally M.", "Honors", "1");
        TextBook three = new TextBook("Chemistry", "Steven K.", "AP", "7");
        
        //Create [Novel]
        Novel nOne = new Novel("Harry Potter", "JK Rowling", "Fiction", 823);
        Novel nTwo = new Novel("Tom & Jerry", "Fred Quinby", "Fiction", 35);
        Novel nThree = new Novel("Dr. Seuss", "Theodor S.", "Fiction", 22);
        
        // Add [TextBook]
        library.add(one);
        library.add(two);
        library.add(three);
        
        // Add [Novel]
        library.add(nOne);
        library.add(nTwo);
        library.add(nThree);
        
        for(int i = 0; i < 6; i++)
        {
                System.out.println(library);
            if(i < 3)
            {
                System.out.println(
                    library.get(i)
                );
            } else {
                System.out.println(
                    library.get(i)
                );
            }
        }
    }
}

Book.java:
---------
public class Book
{
    // Start here!
    public String title;
    public String author;
    
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    
    public String getTitle() 
    {
        return title;
    }
    
    public String getAuthor() 
    {
        return author;
    }
    
    public void setTitle(String newTitle) 
    {
        title = newTitle;
    }
    
    public void setAuthor(String newAuthor) 
    {
        author = newAuthor;
    }
}

