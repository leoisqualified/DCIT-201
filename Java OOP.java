import java.util.Scanner;
public class Book{
  public static void main(String[] args){
    String title,author,ISBN;
    int pageNum;
    double price;
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter book's name");
    title = scanner.nextLine();
    System.out.println("book's name is"+ title);
    System.out.println("enter author's name");
    author = scanner.nextLine();
    System.out.println("book's Author is"+ author);
    System.out.println("enter the book's ISBN");
    ISBN = scanner.nextLine();
    System.out.println("book's ISBN is"+ ISBN);
    System.out.println("enter the number of pages");
    pageNum = scanner.nextInt();
    System.out.println("the number of pages is"+ pageNum);
    System.out.println("enter the book price");
    price = scanner.nextDouble();
    System.out.println("book's price is"+ price);
  }
}

public class Main{
public static void main(String [] args){
Book book1 = new Book("the cockrow","Lawrence Darmani","9789988618049",190,18.50);
Book book2 = new Book("no sweetness here","Ama Ata Aidoo",9781558616202,160,20.00);

System.out.println(book1.gettitle());
System.out.println(book1.getauthor());
System.out.println(book1.getISBN());
System.out.println(book1.getpageNum());
System.out.println(book1.getprice());

book2.settitle("King Solomon's mines");
book2.setauthor("Adenutsi Andy");
book2.setISBN("9997778886661");
book2.setpageCount(404);
book2.setprice(12.60);
    }
}

