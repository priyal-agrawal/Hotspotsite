package moreservlets;
import java.text.*;
/** An item that is for sale. Used in the boats Web app. */
public class SimpleItem {
private String itemNum = "Missing item number";
private String description = "Missing description";
private String imageURL = "Missing image URL";
private double cost;
private NumberFormat formatter =
NumberFormat.getCurrencyInstance();
public SimpleItem(String itemNum,
String description,
String imageURL,
double cost) {
setItemNum(itemNum);
setDescription(description);
setImageURL(imageURL);
setCost(cost);
}
public SimpleItem() {}
public String getItemNum() {
return(itemNum);
}
private void setItemNum(String itemNum) {
this.itemNum = itemNum;
}
public String getDescription() {
return(description);
}
private void setDescription(String description) {
this.description = description;
}
public String getImageURL() {
return(imageURL);
}
private void setImageURL(String imageURL) {
this.imageURL = imageURL;
}
public double getCost() {
return(cost);
}
private void setCost(double cost) {
this.cost = cost;
}
public String getCostString() {
return(formatter.format(getCost()));
}
}
