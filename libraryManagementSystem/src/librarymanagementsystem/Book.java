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
public class Book {
 
    public String bookNaame;
    public String authorName;
    public LocalDate rentedDate;
    public int CopiesLeft;

    public String getBookNaame() {
        return bookNaame;
    }

    public void setBookNaame(String bookNaame) {
        this.bookNaame = bookNaame;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getRentedDate() {
        return rentedDate;
    }

    public void setRentedDate(LocalDate rentedDate) {
        this.rentedDate = rentedDate;
    }

    public int getCopiesLeft() {
        return CopiesLeft;
    }

    public void setCopiesLeft(int CopiesLeft) {
        this.CopiesLeft = CopiesLeft;
    }
  
  
}
