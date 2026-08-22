class MyCircularDeque {
     Deque<Integer> dq;
      int k;
      
    public MyCircularDeque(int k) {
        dq=new ArrayDeque<>();
        this.k=k;
        
    }
    
    public boolean insertFront(int value) {
        if(dq.size()==k)
        return false;
        dq.offerFirst(value);
        
        return true;
    }
    
    public boolean insertLast(int value) {
        if(dq.size()==k)
        return false;
        dq.offerLast(value);
        
        return true;
    }
    
    public boolean deleteFront() {
        if(dq.isEmpty())
        return false;
        dq.pollFirst();
        
        return true;
    }
    
    public boolean deleteLast() {
        if(dq.isEmpty())
        return false;
        dq.pollLast();
        
        return true;
    }
    
    public int getFront() {
        if(!dq.isEmpty())
        return dq.peekFirst();
        return -1;
    }
    
    public int getRear() {
        if(!dq.isEmpty())
        return dq.peekLast();
        return -1;
    }
    
    public boolean isEmpty() {
        if(dq.isEmpty())
        return true;
        return false;
    }
    
    public boolean isFull() {
        if(dq.size()==k)
        return true;
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */