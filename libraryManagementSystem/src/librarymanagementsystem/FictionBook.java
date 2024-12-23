/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagementsystem;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class FictionBook extends Book {
     
   public int rating;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        
        final int MAX_RATE=5;
        final int MINI_RATE=1;
        
        if(rating<MINI_RATE || rating>MAX_RATE)
            this.rating=0;
        else
            this.rating = rating;
    }
   
    public String toString(){
        
        return "Book Name: " + bookNaame + "\nAuthor Name: " + authorName + "\nDate: " + rentedDate + "\nCurrent Copies: " + CopiesLeft + "\nBook Rating: " + rating;
    }
    
    
 
}
