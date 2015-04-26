package moreservlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/** A simple servlet that shows a table of purchases. */
public class ShowPurchases extends HttpServlet {
    @Override
public void doGet(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
String itemNum = request.getParameter("itemNum");
ItemTable shipTable = ShipTable.getShipTable();
SimpleItem item = shipTable.getItem(itemNum);
HttpSession session = request.getSession(true);
ItemList previousItems =
(ItemList)session.getAttribute("items");
if (previousItems == null) {
previousItems = new ItemList();
session.setAttribute("items", previousItems);
}
previousItems.setNewItem(item);
RequestDispatcher dispatcher =
getServletContext().getRequestDispatcher("/sucker.jsp");
dispatcher.forward(request, response);
}
}