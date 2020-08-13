package com.dxc.service;
import java.util.List;
import org.bson.Document;
import com.dxc.dao.AdminDaoImpl;
import com.dxc.dao.iadmindao;
import com.dxc.pojos.bookingdetails;
import com.dxc.pojos.hotel;


public class AdminServiceImpl implements iadminservice 
{
 iadmindao dao=new AdminDaoImpl();


@Override
public boolean adminlogin(int adminid, String password) {
    
    return dao.adminlogin(adminid,password);
}


@Override
public void AddHotel(hotel h) 
{
     dao.AddHotel(h);
    
}


@Override
public List<Document> displayhotellist(hotel h) {
    
    return dao.displayhotellist(h);
}

 

@Override
public List<Document> cancelhotelbookinglist(bookingdetails bd) {
    
    return dao.cancelhotelbookinglist(bd);
}

 

@Override
public boolean cancelrequestedbooking(bookingdetails bd) {

 

    return dao.cancelrequestedbooking(bd);
}

 

}
 
