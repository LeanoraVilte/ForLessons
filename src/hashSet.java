import java.util.HashSet;

public class hashSet {

    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();

        mySet.add("Z");
        mySet.add("D");
        mySet.add("C");

        System.out.println(mySet);
    }

    public class SinglyLinkedList {
        //Represent a node of the singly linked list
        class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        //Represent the head and tail of the singly linked list
        public Node head = null;
        public Node tail = null;

        //addNode() will add a new node to the list
        public void addNode(int data) {
            //Create a new node
            Node newNode = new Node(data);

            //Checks if the list is empty
            if (head == null) {
                //If list is empty, both head and tail will point to new node
                head = newNode;
                tail = newNode;
            } else {
                //newNode will be added after tail such that tail's next will point to newNode
                tail.next = newNode;
                //newNode will become new tail of the list
                tail = newNode;
            }
        }

        //display() will display all the nodes present in the list
        public void display() {
            //Node current will point to head
            Node current = head;

            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            System.out.println("Nodes of singly linked list: ");
            while (current != null) {
                //Prints each node by incrementing pointer
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {

            SinglyLinkedList sList = new SinglyLinkedList();

            //Add nodes to the list
            sList.addNode(1);
            sList.addNode(2);
            sList.addNode(3);
            sList.addNode(4);

            //Displays the nodes present in the list
            sList.display();
        }
    }

    public class DoublyLinkedList {

        //Represent a node of the doubly linked list

        class Node {
            int data;
            Node previous;
            Node next;

            public Node(int data) {
                this.data = data;
            }
        }

        //Represent the head and tail of the doubly linked list
        Node head, tail = null;

        //addNode() will add a node to the list
        public void addNode(int data) {
            //Create a new node
            Node newNode = new Node(data);

            //If list is empty
            if (head == null) {
                //Both head and tail will point to newNode
                head = tail = newNode;
                //head's previous will point to null
                head.previous = null;
                //tail's next will point to null, as it is the last node of the list
                tail.next = null;
            } else {
                //newNode will be added after tail such that tail's next will point to newNode
                tail.next = newNode;
                //newNode's previous will point to tail
                newNode.previous = tail;
                //newNode will become new tail
                tail = newNode;
                //As it is last node, tail's next will point to null
                tail.next = null;
            }
        }

        //display() will print out the nodes of the list
        public void display() {
            //Node current will point to head
            Node current = head;
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            System.out.println("Nodes of doubly linked list: ");
            while (current != null) {
                //Prints each node by incrementing the pointer.

                System.out.print(current.data + " ");
                current = current.next;
            }
        }

        public static void main(String[] args) {

            DoublyLinkedList dList = new DoublyLinkedList();
            //Add nodes to the list
            dList.addNode(1);
            dList.addNode(2);
            dList.addNode(3);
            dList.addNode(4);
            dList.addNode(5);

            //Displays the nodes present in the list
            dList.display();
        }


    import java.util .*;

        public class VectorExample {
            public static void main(String args[]) {
                //Create a vector
                Vector<String> vec = new Vector<String>();
                //Adding elements using add() method of List
                vec.add("Tiger");
                vec.add("Lion");
                vec.add("Dog");
                vec.add("Elephant");
                //Adding elements using addElement() method of Vector
                vec.addElement("Rat");
                vec.addElement("Cat");
                vec.addElement("Deer");

                System.out.println("Elements are: " + vec);
            }
        }


    }

    import java.util.Stack;
    public class StackEmptyMethodExample
    {
        public static void main(String[] args)
        {
//creating an instance of Stack class
            Stack<Integer> stk= new Stack<>();
// checking stack is empty or not
            boolean result = stk.empty();
            System.out.println("Is the stack empty? " + result);
// pushing elements into stack
            stk.push(78);
            stk.push(113);
            stk.push(90);
            stk.push(120);
//prints elements of the stack
            System.out.println("Elements in Stack: " + stk);
            result = stk.empty();
            System.out.println("Is the stack empty? " + result);
        }
    }

    class Queue {

        private static int front, rear, capacity;
        private static int queue[];

        Queue(int size) {
            front = rear = 0;
            capacity = size;
            queue = new int[capacity];
        }

        // insert an element into the queue
        static void queueEnqueue(int item)  {
            // check if the queue is full
            if (capacity == rear) {
                System.out.printf("\nQueue is full\n");
                return;
            }

            // insert element at the rear
            else {
                queue[rear] = item;
                rear++;
            }
            return;
        }

        //remove an element from the queue
        static void queueDequeue()  {
            // check if queue is empty
            if (front == rear) {
                System.out.printf("\nQueue is empty\n");
                return;
            }

            // shift elements to the right by one place uptil rear
            else {
                for (int i = 0; i < rear - 1; i++) {
                    queue[i] = queue[i + 1];
                }


                // set queue[rear] to 0
                if (rear < capacity)
                    queue[rear] = 0;

                // decrement rear
                rear--;
            }
            return;
        }

        // print queue elements
        static void queueDisplay()
        {
            int i;
            if (front == rear) {
                System.out.printf("Queue is Empty\n");
                return;
            }

            // traverse front to rear and print elements
            for (i = front; i < rear; i++) {
                System.out.printf(" %d , ", queue[i]);
            }
            return;
        }

        // print front of queue
        static void queueFront()
        {
            if (front == rear) {
                System.out.printf("Queue is Empty\n");
                return;
            }
            System.out.printf("\nFront Element of the queue: %d", queue[front]);
            return;
        }
    }

    public class QueueArrayImplementation {
        public static void main(String[] args) {
            // Create a queue of capacity 4
            Queue q = new Queue(4);

            System.out.println("Initial Queue:");
            // print Queue elements
            q.queueDisplay();

            // inserting elements in the queue
            q.queueEnqueue(10);
            q.queueEnqueue(30);
            q.queueEnqueue(50);
            q.queueEnqueue(70);

            // print Queue elements
            System.out.println("Queue after Enqueue Operation:");
            q.queueDisplay();

            // print front of the queue
            q.queueFront();

            // insert element in the queue
            q.queueEnqueue(90);

            // print Queue elements
            q.queueDisplay();

            q.queueDequeue();
            q.queueDequeue();
            System.out.printf("\nQueue after two dequeue operations:");

            // print Queue elements
            q.queueDisplay();

            // print front of the queue
            q.queueFront();
        }
    }

    public class Tree {
        // Represent the node of tree
        public static class Node {
            int data;
            Node left;
            Node right;
            public Node(int data)
            {
                // Assign data to the new node, set left and
                // right children to null
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
        // Represent the root of binary tree
        public Node root;
        public Tree() { root = null; }
        // factorial() will calculate the factorial of given
        // number
        public int factorial(int num)
        {
            int fact = 1;
            if (num == 0)
                return 1;
            else {
                while (num > 1) {
                    fact = fact * num;
                    num--;
                }
                return fact;
            }
        }
        // numOfBST() will calculate the total number of
        // possible BST by calculating Catalan Number for given
        // key
        public int numOfBST(int key)
        {
            int catalanNumber
                    = factorial(2 * key)
                    / (factorial(key + 1) * factorial(key));
            return catalanNumber;
        }

        public static void main(String[] args)
        {
            Tree bt = new Tree();
            // Display total number of possible
            // tree with key 5
            System.out.println(
                    "Total number of possible Trees with given key: "
                            + bt.numOfBST(5));
        }
    }


}
