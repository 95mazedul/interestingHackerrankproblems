
package librarycatalogue;

import java.util.HashMap;
import java.util.Map;


public class Librarycatalogue {

    Map<String,Book> bookCollection = new HashMap<String,Book>();
    int currentDay=0;
    int lengthOfCheckedoutPeriod =7;
    double initialLateFee =0.50;
    double feePerLateDay=1.00;
   
    public  Librarycatalogue (Map<String,Book> collection){
        this.bookCollection=collection;
    }
    public Librarycatalogue (Map<String,Book> collection,int lengthOfCheckedoutPeriod ,double initialLateFee, double feePerLateDay ){
        this.bookCollection=collection;
        this.lengthOfCheckedoutPeriod=lengthOfCheckedoutPeriod;
        this.initialLateFee=initialLateFee;
        this.feePerLateDay= feePerLateDay;
    }
    
    //getters
    public int getCurrentDay(){
        return this.currentDay;
    }
     public Map<String,Book>  getbookCollection(){
        return this.bookCollection;
    }
     public Book getBook(String bookTitle){
         return getbookCollection().get(bookTitle);
     }
     public int getlengthOfCheckedoutPeriod (){
        return this.lengthOfCheckedoutPeriod;
    }
    public double getinitialLateFee(){
        return this.initialLateFee;
    } 
     public double getFeePerLateDay(){
        return this.feePerLateDay;
    }
     //settres
     public void nextDay(){
         currentDay++;
     }
     public void setDay(int day){
         currentDay=day;
     }
     
     public void checkedOutBook(String title){
         Book book=getBook(title);
         if(book.getisCheckedOut()){
             sorryBookAlreadyCheckedOut(book);
         }
         else{
             book.setIsCheckedOut(true, currentDay);
             System.out.println("you just checked Out "+ title + ".It is due on day"+(getCurrentDay() + getlengthOfCheckedoutPeriod() ) +".");
         }
     }
     public void returnBook(String title){
         Book book =getBook(title);
         int daysLate = currentDay -(book.getdayCheckedOut()+ getlengthOfCheckedoutPeriod());
         if(daysLate>0){
             System.out.println("you owe the library $" + ( getinitialLateFee() + daysLate *getFeePerLateDay()) + "because your book is "+daysLate+"days overdue.");
         }
         else{
             System.out.println("Book returned.Thank you");
         }
         book.setIsCheckedOut(false, currentDay);
     }
     public void sorryBookAlreadyCheckedOut(Book book){
         System.out.println("sorry " + book.getTitle()+ "is already checked out ."+ "It shgould be backon day "+(book.getdayCheckedOut()+ getlengthOfCheckedoutPeriod()) + ".");
     }
     
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String,Book> bookCollection=new HashMap<String,Book>();
        Book harry = new Book("Harry poter",3541,88888);
        bookCollection.put("Harry poter", harry);
        Librarycatalogue lib= new Librarycatalogue(bookCollection);
        lib.checkedOutBook("Harry poter");
        lib.nextDay();
        lib.nextDay();
        lib.nextDay();
        lib.checkedOutBook("Harry poter");
        lib.setDay(17);
        lib.returnBook("Harry poter");
        lib.checkedOutBook("Harry poter");
    }
    
}
