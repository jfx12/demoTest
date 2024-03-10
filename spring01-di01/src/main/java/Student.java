import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {
    private String name;
    private Address address;
    private   String[] books;
    private List<String>hobbys;
    private Map<String,String> cards;
    private String snds;
    private Properties properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<String, String> getCards() {
        return cards;
    }

    public void setCards(Map<String, String> cards) {
        this.cards = cards;
    }

    public String getSnds() {
        return snds;
    }

    public void setSnds(String snds) {
        this.snds = snds;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address.toString() +
                ", books=" + Arrays.toString(books) +
                ", hobbys=" + hobbys +
                ", cards=" + cards +
                ", snds='" + snds + '\'' +
                ", properties=" + properties +
                '}';
    }
}
