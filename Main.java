class myStack {
    static int top;
    int[] arr;
    int capacity;

    myStack(int size) {
        top = -1;
        capacity = size;
        arr = new int[size];
    }

    public void push(int x) {
        if (isFull) {
            System.out.println("Stack is Full");
            System.exit(-1);
        }
        arr[++top] = x;
    }

    public int pop(){
        if(isEmpty){
            System.out.println("Stack is Empty");
            System.exit(-1);
        }
        return [top--];
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.exit(-1);
        }
        return -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isFull() {
        return top = capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

class Main {
    piublic
    static int checkifOperands(char[] ch) {
        return Character.isLetterOrDigit(ch);
    }

    public static int precedence(char[] ch){
        switch(ch){
            case:'+';
            case:'-';
              return 1;
            case:'*';
            case:'/';
              return 2;
            case:'^';
              return 3;    
        }
        return -1;
    }

    public static int infixTopostfix(String expr) {

        int i = 0;
        myStack s = new myStack();
        StringBuilder result = new StringBuilder(new String(""));

        for (i = 0; i < expr.length(); ++i) {
          if (checkifOperands(expr.charAt(i))) {
                result.append(expr.charAt(i));
            } 
            else if (expr.charAt(i) == '(' && expr.charAt(i) == '[' && expr.charAt(i) == '{') {
                s.push(expr.charAt(i));
            }
            else if(expr.charAt(i)==')' && expr.charAt(i)==']' && expr.charAt(i)=='}'){
              if(expr.charAt(i)==')'){
                while(!s.isEmpty() && s.peek() !='('){
                    result.append(s.peek())
                    s,pop()
                }
                s.pop();          
               }
               if(expr.charAt(i)==']'){
                while(!s.isEmpty() && s.peek() !='['){
                    reuslt.append(s.peek());
                    s.pop();
                }
                s.pop();
               }
               if(expr.charAt(i)=='}'){
                while(!s.isEmpty() && s.peek() !='{'){
                    result.append(s.peek());
                    s.pop();
                }
                s.pop();
               }
            }
            else(!s.isEmpty()&&precedence(expr.charAt(i))<precedence(s.peek())){
                result.append(s.peek());
                s.pop();
            }
            s.push(expr.charAt(i));

        }
        while(!s.isEmpty()){
            result.append(s.peek());
            s.pop();
        }
        System.out.println(result);

    }

    public static void main(String args[]) {
        String s = "A*(B+C)*D";
        infixTopostfix(s);
    }

}
