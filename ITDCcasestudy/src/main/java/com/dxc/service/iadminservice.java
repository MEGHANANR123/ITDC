package com.dxc.service;
import com.dxc.pojos.bookingdetails;
import com.dxc.pojos.hotel;
import java.util.List;
import org.bson.Document;

public interface iadminservice 
{
   boolean adminlogin(int adminid, String password);


void AddHotel(hotel h);  

List<Document> displayhotellist(hotel h);


List<Document> cancelhotelbookinglist(bookingdetails bd);


boolean cancelrequestedbooking(bookingdetails bd);  



}





