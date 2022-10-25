package mx.tc.j2se.tasks;

public class LinkedTaskList<task> extends AbstractTaskList{

        private Node head;
        int count=0;

        public LinkedTaskList(){
        }
    public void add(Task data) {
           Node newNode = new Node(data);
           count++;
           if (this.head == null) {
               head = newNode;
           } else {
               Node currentNode = head;
               while (currentNode.getNextNode() != null) {
                   currentNode = currentNode.getNextNode();
               }
               currentNode.setNextNode(newNode);
           }
       }


        public void insertHead(Task data){
            count++;
            Node newNode = new Node(data);
            newNode.setNextNode(head);
            head = newNode;
        }

        public void insertAt(int index, Task data){
            count++;
            Node nodeToBeInserted = new Node(data);
            Node node = head;
            for(int i = 0; i< index -1; i++){
                node = node.getNextNode();
            }
            nodeToBeInserted.setNextNode(node.getNextNode());
            node.setNextNode(nodeToBeInserted);
        }
    public boolean remove(int index){
            count--;
        Node node = head;
        for(int i = 0; i< index -1; i++){
            node = node.getNextNode();
        }
        node.setNextNode(node.getNextNode().getNextNode());
      return true;
    }
    public int size(){
        return count;
    }
    public Task get(int index){
        int i=0;
        Node current =head;
        while(current !=null){
            if (i == index) {
                break;
            }
            current=current.nextNode;
            i++;
        }
        return current.data;
    }

    public void display(){
        if(head != null){
            Node currentNode = head;
            while(currentNode.getNextNode() != null){
                System.out.println(currentNode.getData());
                currentNode = currentNode.getNextNode();
            }
            System.out.println(currentNode.getData());
        }
    }
    }




