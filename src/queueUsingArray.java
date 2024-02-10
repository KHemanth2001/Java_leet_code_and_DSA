public class queueUsingArray {
    static class Queue{
        int[] arr;
        int size;
        int rear=-1;
        Queue(int n){
            arr=new int[n];
            this.size=n;
        }
        public boolean isEmpty(){
            return rear==-1;
        }
        public void add(int data){
            if(rear==size-1){
                return;
            }
            rear++;
            arr[rear]=data;
        }
        public int remove(){
            if(isEmpty()){
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public int peek(){
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue qu=new Queue(3);
        qu.add(1);
        qu.add(2);
        qu.add(3);
        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.remove();
        }

    }
}
