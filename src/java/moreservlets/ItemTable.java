package moreservlets;
import java.util.HashMap;
/** Small class that puts an array of items into a
* hash table, making the item number the key.
* Used in the boats Web app example.
*/
public class ItemTable {
private HashMap itemMap = new HashMap();
public ItemTable(SimpleItem[] items) {
if (items != null) {
SimpleItem item;
for(int i=0; i<items.length; i++) {
item = items[i];
itemMap.put(item.getItemNum(), item);
}
}
}
public SimpleItem getItem(String itemNum) {
return((SimpleItem)itemMap.get(itemNum));
}
}