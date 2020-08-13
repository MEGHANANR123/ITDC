package com.dxc.service;



	import java.util.List;


	import org.bson.Document;


	import com.dxc.dao.CustomerDaoImpl;
	import com.dxc.dao.ICustomerDao;
	import com.dxc.pojos.bookingdetails;
	import com.dxc.pojos.hotel;
	import com.dxc.pojos.user;


	public class CustomerServiceImpl implements ICustomerService
	{
	 ICustomerDao dao=new CustomerDaoImpl();
	    @Override
	    public boolean userregister(user u) {
	        
	        return dao.userregister(u);
	    }
	    @Override
	    public boolean customerlogin(user u) {
	        
	        return dao.customerlogin(u);
	    }
	    @Override
	    public List<Document> hotellist(hotel h) {
	        
	        return dao.hotellist(h);
	    }
	    @Override
	    public List<Document> bookingdetailslist(bookingdetails bd) {
	        
	        return dao.bookingdetailslist(bd);
	    }
	    @Override
	    public boolean bookhotel(bookingdetails bd) {
	        
	        return dao.bookhotel(bd);
	    }
	    @Override
	    public boolean CancelBooking(bookingdetails bd) {
	        
	        return dao.CancelBooking(bd);
	    }




}
