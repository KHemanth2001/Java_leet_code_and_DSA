public class queueArrays {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear=-1;

        Queue(int size){
            arr=new int[size];
            this.size=size;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void add(int data){
            if(rear==size-1){
                System.out.println("queue full");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front=arr[0];

            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public static void printQueue(){
            for(int i=0;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Queue q=new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);
            q.printQueue();
            int r=q.remove();
            System.out.println(r);
            q.printQueue();
        }
    }
}
