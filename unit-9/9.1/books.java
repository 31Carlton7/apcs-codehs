Book.java:
---------
public class Book
{
    private int pages;
    public int words;
    private String name;
    public String author;
    
    public int getPages() {
        return pages;
    }
    
    public void setPages(int pages) {
        this.pages = pages;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}

BookTester.java:
---------------
public class BookTester
{
    public static void main(String[] args)
    {
        Fiction hungerGames = new Fiction();
        
        hungerGames.setPages(374);
        hungerGames.setName("The Hunger Games");
        hungerGames.setAuthor("Suzanne Collins");
        
        Dict websters = new Dict();
        websters.setPages(720);
        websters.setName("Webster's Dictionary");
        websters.setWords(171476);
        
        System.out.println(hungerGames.getName());
        System.out.println(websters.getName());
    }
}


Dict.java:
---------
public class Dict extends Book
{
    public int getWords() {
        return words;
    }
    
    public void setWords(int words) {
        this.words = words;
    }
}


Fiction.java:
------------
public class Fiction extends Book
{
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
}
