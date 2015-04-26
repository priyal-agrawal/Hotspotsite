/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moreservlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pppppppppppppppppppp
 */
public class ShowItem extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {String itemNum = request.getParameter("itemNum");
String destination;
if (itemNum == null) {
destination = "/MissingItem.jsp";
} else {
destination = "/ShowItem.jsp";
ItemTable shipTable = ShipTable.getShipTable();
SimpleItem item = shipTable.getItem(itemNum);
request.setAttribute("item", item);
}
RequestDispatcher dispatcher =
getServletContext().getRequestDispatcher(destination);
dispatcher.forward(request, response);


        } finally {
            out.close();
        }
    }
}
   