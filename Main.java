import java.util.*;
class Main
{
    Node head;
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void addf(String data)
    {
        Node nn = new Node(data);
        if(head == null)
        {
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }
    public void addl(String data)
    {
        Node nn = new Node(data);
        if(head == null)
        {
            head = nn;
            return;
        }
        Node curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = nn;
    }
    public void pl()
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data +"->");
            curr = curr.next;
        }
        System.out.print("Null");
    }
    void length()
    {
        if(head == null)
        {
            return;
        }
        Node slow = head;
        Node fast = head;
        int c=0;
        while(fast != null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            c+=2;
        }
        if(fast!=null)
        {
            c++;
        }
        System.out.println(c);
    }
    public void del()
    {
        if(head == null)
        {
            return;
        }
        head = head.next;
    }
    public void dell()
    {
        if(head == null)
        return;
        Node sl=head;
        Node fl=head.next;
        while(fl.next!=null)
        {
            sl=sl.next;
            fl=fl.next;
        }
        sl.next = null;

    }
    public static void main(String args[])
    {
        Main ob = new Main();
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[6];
        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextLine();
            ob.addl(arr[i]);
        }
    }
}