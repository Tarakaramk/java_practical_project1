package mx.tc.j2se.tasks;

public class LinkedTaskList<task> {

        private Node head;

        public LinkedTaskList(){
        }
    public void insert(Task data) {
           Node newNode = new Node(data);
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
            Node newNode = new Node(data);
            newNode.setNextNode(head);
            head = newNode;
        }

        public void insertAt(int index, Task data){
            Node nodeToBeInserted = new Node(data);
            Node node = head;
            for(int i = 0; i< index -1; i++){
                node = node.getNextNode();
            }
            nodeToBeInserted.setNextNode(node.getNextNode());
            node.setNextNode(nodeToBeInserted);
        }

    }




