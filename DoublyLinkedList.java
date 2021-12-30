package spisok;
import java.util.NoSuchElementException;

public class DoublyLinkedList<AnyType>{

    private ListNode<AnyType> front;
    private int size;
    public DoublyLinkedList() {
        front = null;
    }


    public void addAfter(ListNode<AnyType> current, AnyType y) {
        if (isEmpty())
            throw new NoSuchElementException("Элемент " + current.toString() + " не найдён!");

        ListNode<AnyType> newNode = new ListNode<AnyType>(current, y, current.next);

        if (current.next != null)
            current.next.prev = newNode;
        current.next = newNode;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        ListNode<AnyType> temp = front;
        StringBuilder builder = new StringBuilder("[");

        while (temp != null) {
            builder.append(temp.data).append(",");
            temp = temp.next;
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }

}

