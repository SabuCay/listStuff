// Class LinkedIntList can be used to store a list of integers.

import javax.print.attribute.standard.NumberUp;
import javax.tools.Diagnostic;
import java.util.List;

public class LinkedIntList {
    private ListNode front;  // first value in the list

    // post: constructs an empty list
    public LinkedIntList() {
        front = null;
    }

    //removeLast method
    public void removeLast(int value){
        if (front != null) {
            ListNode current = front;
            ListNode spot = null;
            while(current.next != null) {
                if (current.next.data == value) {
                    spot = current;
                }
                current = current.next;
            }if (spot != null) {
                spot.next = spot.next.next;
            }else if (front.data == value){
                front = front.next;
            }
        }

    }


    //Returns the number of searched values
    public int numberOfSearchValues(int value) {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            if (current.data == value) {
                count++;
            }
            current = current.next;
        }
        return count;
    }



    // post: returns the current number of elements in the list
    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }
    //method to tell if the list have both odd and even
    public boolean hasOddEven()
    {
    	ListNode current = front;
    	boolean odd = false;
    	boolean even = false;
    	
    	while (current != null)
    	{
    		if (current.data %2 == 0)
    		{
    			even = true;
    		}else
    		{
    			odd = true;
    		}
    		//if(odd && even)
    		//{
    			//return true;
    		//}
    		current = current.next;
    	}
    	return odd && even;
    	//return false;
    }


    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public int get(int index) {
        return nodeAt(index).data;
    }

    // post: creates a comma-separated, bracketed version of the list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post : returns the position of the first occurrence of the given
    //        value (-1 if not found)
    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;
        while (current !=  null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index
    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode(value, null);
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = new ListNode(value, current.next);
        }
    }

    // pre : 0 <= index < size()
    // post: removes value at the given index
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    // pre : 0 <= i < size()
    // post: returns a reference to the node at the given index
    private ListNode nodeAt(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }


}

