/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarymanagementsystem;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class LibraryManagementSystem  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      String bookName;
      String authorName;
      LocalDate date;
      int year,month,day;
      int CopiesLeft;
      int rating;
      
      
      bookName=JOptionPane.showInputDialog(null,"Enter the book rented: ");
     
     
      authorName=JOptionPane.showInputDialog(null,"Enter the authors name: ");
      
      year=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter rent year"));
      
      month=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter rent month"));
      
      day=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter rent day"));
      
      CopiesLeft=Integer.parseInt(JOptionPane.showInputDialog(null,"How many copies of the book are left:?"));
      
      rating=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the book rating?"));

      FictionBook call = new FictionBook();
      
      date=LocalDate.of(year, month, day);
      
      call.setBookNaame(bookName);
      call.setAuthorName(authorName);
      call.setCopiesLeft(CopiesLeft);
      call.setBookNaame(bookName);
      call.setRating(rating);
      call.setRentedDate(date);
      
      JOptionPane.showMessageDialog(null,call.toString(),"Library Manegment System",JOptionPane.INFORMATION_MESSAGE);
      
      
      
      
      
      
      
      
    }
    
}

