import java.util.ArrayList;
import java.util.Iterator;

public class TheCollection implements Iterable<Contacts>{
    private ArrayList<Contacts> myList = new ArrayList<>();

    public TheCollection() {
    }

    public ArrayList<Contacts> getMyList() {
        return myList;
    }

    public void setMyList(ArrayList<Contacts> myList) {
        this.myList = myList;
    }

    @Override
    public String toString() {
        return "TheCollection{" +
                "myList=" + myList +
                '}';
    }

    @Override
    public Iterator<Contacts> iterator() {
        return myList.iterator();
    }
    public void addContact(Contacts a){
        myList.add(a);
    }

}
