public class LinkedList {
    private LinkedList next;
    private String value;

    public LinkedList() {
        this.next = null;
        this.value = null;
    }
    public LinkedList(LinkedList next, String value) {
        this.next = next;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }
}