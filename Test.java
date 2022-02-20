public class Test {
    public static void main(String args[]){
        BinarySearchTree<Integer> myTree=new BinarySearchTree<>();
        myTree.insert(8);
        myTree.insert(8);
        myTree.insert(8);

        myTree.insert(5);
        myTree.insert(12);
        myTree.insert(10);
        myTree.insert(20);
        myTree.insert(3);
        System.out.println(myTree.searchRecursively(10));
        //myTree.inorder();





//        DoublyLinkedLists<Integer> myList =new DoublyLinkedLists<>();
//
//
//
//        LinkedList<Integer> myList=new LinkedList<>();
//        myList.addToFront(10);
//        myList.addToFront(11);
//        myList.addToFront(12);
//        myList.addToFront(13);
//        myList.selectionSort();
//        myList.display();


//        myList.findMin();


//        Queue<Integer> q1=new Queue(Integer.class,5);
//        q1.enqueue(5);
//        q1.enqueue(15);
//        q1.enqueue(3);
//        q1.enqueue(4);
//        q1.display();
//        GenericStackOps<Integer> sops=new GenericStackOps<>();
//        System.out.println(sops.isPolindrome("kapak"));


//        GenericStack<Integer> gs= new GenericStack<>(Integer.class, 5);
//        //GenericStack<Student> gs2 = new GenericStack<>(Student.class, 5);
//        gs.push(5);
//        gs.push(6);
//        gs.push(2);
//        gs.display();
//        GenericStackOps<Integer> sops = new GenericStackOps<>();
//        System.out.println(sops.FindMax(gs));


//        Stack s= new Stack(5);
//        s.push(5);
//        s.push(6);
//        s.push(2);
//        //s.pop();
//
//        s.display();
//        System.out.println(StackOperations.search(s,67));
//        s.display();


    }
}
