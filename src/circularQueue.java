public class circularQueue {
    static class Queue{
        static int size;
        static int rear=-1;
        static int front=-1;
        static int[] arr;
        Queue(int size){
            arr=new int[size];
            this.size=size;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue empty");
                return -1;
            }
            int result=arr[front];
            if(front==rear){
                front=rear=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }
        public static void printList(){
            if(isEmpty()){
                System.out.println("empty queue");
                return;
            }
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+"->");
            }
            System.out.println();
        }
        public static int peek(){
            return arr[front];
        }


    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.printList();
        System.out.println(q.remove());
        q.add(6);
        while(!q.isEmpty()){
            System.out.print(q.peek()+"-");
            q.remove();
        }
//        System.out.println(q.remove());
//        q.add(7);
//        q.printList();
    }
}
