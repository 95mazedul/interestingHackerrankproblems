 

package librarycatalogue;

public class Book {
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut; //weather the book is checked or not
    int dayCheckedOut =-1;
    
    public Book(String bookTitle,int bookPageCount,int bookISBN){
        this.title=bookTitle;
        this.pageCount=bookPageCount;
        this.ISBN=bookISBN;
        isCheckedOut = false;
    }
    
    //getters--->INSTANCE methods
    public String getTitle(){
        return this.title;
    }
     public int getPageCount(){
        return this.pageCount;
    }
     public int getISBN(){
        return this.ISBN;
    }
    public boolean getisCheckedOut(){
        return this.isCheckedOut;
    }
     public int getdayCheckedOut(){
        return this.dayCheckedOut;
    }
     
     //setters
     public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut){
         this.isCheckedOut = newIsCheckedOut;
         setDayCheckedOut(currentDayCheckedOut);
     }
     private void setDayCheckedOut(int day){
         this.dayCheckedOut=day;
     }
}
