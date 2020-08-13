package com.dxc.controllers;


import java.util.List;


import javax.servlet.http.HttpSession;


import org.bson.Document;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.dxc.pojos.bookingdetails;
import com.dxc.pojos.hotel;
import com.dxc.pojos.user;
import com.dxc.service.CustomerServiceImpl;
import com.dxc.service.ICustomerService;


@Controller
public class CustomerController 
{
    ICustomerService service=new CustomerServiceImpl();
    String message="";
 @RequestMapping("/Register")
 public String userregister(@ModelAttribute user u, Model m)
 {
     boolean b=service.userregister(u);
     if(b==true)
     {
           
            return "customerlogin.jsp";    


     }
     else
     {
            message="User Registration Failed";
            m.addAttribute("message",message);
            return "message.jsp";    


     }
    
 }
 
 @RequestMapping("/userlogin")
 public String customerlogin(Model m, @ModelAttribute user u )
 {
     
     boolean b=service.customerlogin(u);
     if(b==true)
     {
         return "customermenu.jsp";    
     }
     else
     {
         message="Incorrect Login Credentials";
         m.addAttribute("message", message);
         return "message.jsp";    
     }


}
 @RequestMapping("/hotellist")
 public String displayhotellist(@ModelAttribute hotel h,Model m)
 {
     List<Document> list=service.hotellist(h);
     m.addAttribute("list", list);
     return "hotellist.jsp";
     
 }
 @RequestMapping("/Book_Hotel")
 public String Book_Hotel(@ModelAttribute hotel h, HttpSession session)
 {
     session.setAttribute("h", h);
     return "select_rooms.jsp";
 }
 
 @RequestMapping("/PayBill")
 public String PayBill(@ModelAttribute bookingdetails bd,Model m,HttpSession session)
 {
     hotel h=(hotel)session.getAttribute("h");
     //System.out.println(bd.getUserphno());
     //System.out.println(h.getRoomCostPerDay());
     m.addAttribute("bd",bd);
     m.addAttribute("h",session.getAttribute("h"));
     return "confirm_paybill.jsp";
 }
 @RequestMapping("/bookingdetails")
 public String bookingdetailslist(@ModelAttribute  bookingdetails bd,Model m)
 {
     List<Document> list=service.bookingdetailslist(bd);
     m.addAttribute("list", list);
     return "bookinghotellist.jsp";
     
 }
 @RequestMapping("/confirm_paybill")
 public String bookhotel(@ModelAttribute bookingdetails bd,Model m)
 {
     boolean b=service.bookhotel(bd);
     if(b==true)
     {
      message="Successfully Hotel Booked";
        m.addAttribute("message", message);
        return "message.jsp";
     }else
     {
         message="All Rooms are booked or Balance is Exceed ";
            m.addAttribute("message", message);
            return "message.jsp";
     }
 }
 @RequestMapping("/CancelHotelBooking")
 public String CancelBooking(@ModelAttribute bookingdetails bd,Model m)
 {
     boolean b=service.CancelBooking(bd);
     message="Successfully Hotel Booking Canceled";
     m.addAttribute("message", message);
     return "message.jsp";
     
}


}











