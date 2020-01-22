public class Bookshelf {
public Book [][] bookArray;

//public String bookString;

public static void main(String[] args) {

        Book book1 = new Book("Lord of the Rings","Tolkien", 4.29);
        Book book2 = new Book("Silmarillion", "Tolkien", 4.1);
        Book book3 = new Book("Lord of the Flies", "Golding", 4.4);
        Book book4 = new Book("Knife of Never Letting Go", "Ness", 4.19);
        Book book5 = new Book("Light in the Attic", "Silverstein", 4.27);
        Book book6 = new Book("Green eggs and ham", "Silverstein", 4.27);

        //System.out.println(book1.compareTo(book3,'a'));

        Bookshelf newBookshelf = new Bookshelf();

        newBookshelf.add(book1);
        newBookshelf.add(book2);
        newBookshelf.add(book3);
        newBookshelf.add(book4);
        newBookshelf.add(book5);
        newBookshelf.add(book6);
        //  System.out.println(newBookshelf.getBooksByAuthor("Silverstein"));
        //    System.out.println(newBookshelf);
        System.out.println(newBookshelf);

}

public Bookshelf(){
        bookArray= new Book[5][5];
}
public Bookshelf(int row){
        bookArray= new Book[row][5];
}
public Bookshelf(int row,int column){
        bookArray= new Book[row][column];
}
public boolean add(Book newBook){
        for(int i=0; i<bookArray.length; i++) {
                for(int j= 0; j<bookArray[i].length; j++) {
                        if(bookArray[i][j]==null) {
                                bookArray[i][j]=newBook;
                                return true;
                        }

                }
        }
        return false;

}
public String toString(){
        String bookString="";
        for(int i=0; i<bookArray.length; i++) {

                for(int j=0; j<bookArray[i].length; j++) {

                        bookString+= bookArray[i][j]+";";

                }
                bookString+="\n";
        }
        return bookString;

}
public Bookshelf getBooksByAuthor(String author){

        Book currentBook =new Book("","",0.0);
        Bookshelf authorShelf= new Bookshelf();
        for(int i =0; i<bookArray.length; i++) {
                for(int j=0; j<bookArray[i].length; j++) {
                        if(bookArray[i][j]!=null) {
                                if(bookArray[i][j].getAuthor().equals(author)) {
                                        authorShelf.add(bookArray[i][j]);
                                }
                        }
                }
        }

        return authorShelf;
}
/*
public Bookshelf sort(char sortBy){
//  if(sortBy.equals("R") || sortBy.equals("r")){}
//get 2d array into 1d array
        Book shelf1[]=new Book[5];
        for(int i=0; i<bookArray.length; i++) {
                for(int j=0; j<bookArray[i].length; j++) {
                  if(bookArray[i][j]!=null){
            shelf1.add(bookArray[i][j]);
          }
                }
        }
//return(oneDimensionshelf);
      /*  for(int i =0; i<oneDimensionshelf.length; i++) {
          if(sortBy.equals('a')){

          }
        }
*/


}
