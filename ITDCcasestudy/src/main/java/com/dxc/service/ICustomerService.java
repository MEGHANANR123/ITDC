package com.dxc.service;


	import java.util.List;


	import org.bson.Document;


	import com.dxc.pojos.bookingdetails;
	import com.dxc.pojos.hotel;
	import com.dxc.pojos.user;


	public interface ICustomerService {


	    boolean userregister(user u);


	    boolean customerlogin(user u);


	    List<Document> hotellist(hotel h);


	    List<Document> bookingdetailslist(bookingdetails bd);


	    boolean bookhotel(bookingdetails bd);


	    boolean CancelBooking(bookingdetails bd);





	}
	 
