public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    public String traversal() {
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public void insert(int position, Object value) {
        Node newNode = new Node(value);

        if (head == null || position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node prev = head;
        for (int i = 0; i < position - 1 && prev.next != null; i++) {
            prev = prev.next;
        }

        newNode.next = prev.next;
        prev.next = newNode;
    }

    public void insert(Object value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void remove(int position) {
        if (head == null) {
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node prev = head;
        for (int i = 0; i < position - 1 && prev.next != null; i++) {
            prev = prev.next;
        }

        if (prev.next != null) {
            prev.next = prev.next.next;
        }
    }

    public void removeLastElement() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public int length() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public Object get(int position) {
        Node current = head;
        for (int i = 0; i < position && current != null; i++) {
            current = current.next;
        }
        return (current != null) ? current.data : null;
    }

    public void set(int position, Object value) {
        Node current = head;
        for (int i = 0; i < position && current != null; i++) {
            current = current.next;
        }
        if (current != null) {
            current.data = value;
        }
    }

    public void clear() {
        head = null;
    }
}