// Stack implementation in Java

class Stack {

    int arr[];
     int top;
     int capacity;
  
    
    Stack(int size) {
      
      arr = new int[size];
      capacity = size;
      top = -1;
    }
  
    //method for push element
    public void push(int x) {
      if (isFull()) {
        System.out.println("Stack OverFlow");
  
        
        System.exit(1); // exit from code
      }
  
      // insert element on top of stack
      System.out.println("Inserting " + x);
      arr[++top] = x;
    }
  
    // method for pop element
    public int pop() {
  
      // if stack is empty then no pop apply
      if (isEmpty()) {
        System.out.println("STACK EMPTY");
        
        System.exit(1);  // exiting from code
      }
  
      // pop element from top of stack
      return arr[top--];
    }
  
    // return size of the stack
    public int getSize() {
      return top + 1;
    }
  
    // check if the stack is empty
    public Boolean isEmpty() {
      return top == -1;
    }
  
    // check if the stack is full
    public Boolean isFull() {
      return top == capacity - 1;
    }
  
    // display elements of stack
    public void printStack() {
      for (int i = 0; i <= top; i++) {
        System.out.print(arr[i] + ", ");
      }
    }
  
    public static void main(String[] args) {
      Stack stack = new Stack(6);
  
      stack.push(34);
      stack.push(21);
      stack.push(71);
      stack.push(911);
  
      System.out.print("Stack: --> ");
      stack.printStack();
  
      // remove element from stack
      stack.pop();
      System.out.println("\nAfter popping out the stack will look like this \n");
      stack.printStack();
  
    }
  }