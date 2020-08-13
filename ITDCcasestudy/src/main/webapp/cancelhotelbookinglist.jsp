<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
              <style>
                    table, tr, td{
                         border: 2px solid black;
                         width : 30%;
                         text-align: center;
                    }
                </style>
</head>
<body bgcolor="#DDDDDD"> 


       <center>
  <h2 style="background-color:Lavender;font-size:30px;"> CANCEL BOOKING HOTELS LIST</h2>
  <table border="1">
      <thead>
         <tr>
             <th>UserPhNo</th>
             <th>HotelPhNo</th>
             <th>HotelName</th>
             <th>Roomswanted</th>
             <th>NoOfDays</th>
             <th>Bookingday_date</th>
             <th>BookingEndday_Date</th>
             <th>TotalRent</th>
              <th>Status</th>
             <th>CancelOption</th>
         </tr>
      </thead>  
      
   <tbody>
            <c:forEach var="bd" items="${list}">    
               <form action="CancelRequestedBooking">
                            <tr>
                                <td>
                                    <h5><input type="hidden" name="userphno" value="${bd.userphno}">${bd.userphno}</h5>
                                </td>
                                <td>
                                    <h5><input type="hidden" name="HotelPhNo" value="${bd.HotelPhNo}">${bd.HotelPhNo}</h5>
                                </td>
                                <td>
                                    <h5><input type="hidden" name="HotelName" value="${bd.HotelName}">${bd.HotelName}</h5>
                                </td>
                                <td>
                                    <h5><input type="hidden" name="wrooms" value="${bd.wrooms}">${bd.wrooms}</h5>
                                </td>    
                                <td>
                                    <h5><input type="hidden" name="days" value="${bd.days}">${bd.days}</h5>
                                </td>    
                                <td>
                                    <h5><input type="hidden" name="fdate" value="${bd.fdate}">${bd.fdate}<h5>
                                </td>    
                                <td>
                                    <h5><input type="hidden" name="edate" value="${bd.edate}">${bd.edate}</h5>
                                </td>    
                                <td>
                                    <h5><input type="hidden" name="trent" value="${bd.trent}">${bd.trent}</h5>
                                </td>
                                <td>
                                    <h5><input type="hidden" name="status" value="${bd.status}">${bd.status}</h5>
                                </td>
                                <c:set var="status" value="${bd.status}"></c:set>
                                <c:if test="${status == 'Requested'}"> 
                                    <td>
                                        <input type="submit" name="btn" value="Cancel">
                                    </td>    
                                </c:if>
                            </tr>
                            </form>
                            </c:forEach>
                        </tbody>
         
</table>
    </center>     
            
</body>
</html>



