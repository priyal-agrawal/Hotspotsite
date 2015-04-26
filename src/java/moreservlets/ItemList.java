/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moreservlets;

import java.util.ArrayList;


    public class ItemList {
private ArrayList items = new ArrayList();
public synchronized void setNewItem(SimpleItem newItem) {
if (newItem != null) {
items.add(newItem);
}
}
public synchronized String getItemTable() {
if (items.size() == 0) {
return("<H3>No items...</H3>");
}
String tableString =
"<TABLE BORDER=1>\n" +
" <TR CLASS=\"COLORED\">\n" +
" <TH>Item Number\n" +
" <TH>Description\n" +
" <TH>Cost\n";
for(int i=0; i<items.size(); i++) {
SimpleItem item = (SimpleItem)items.get(i);
tableString +=
" <TR><TD>" + item.getItemNum() + "\n" +
" <TD>" + item.getDescription() + "\n" +
" <TD>" + item.getCostString() + "\n";
}
tableString += "</TABLE>";
return(tableString);
}
public synchronized String toString() {
return("[Item List: " + items.size() + " entries.]");
}
}



