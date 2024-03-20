//package ThucHanh;
//
//import java.util.LinkedList;
//import java.util.EmptyStackException;
//
//public class MyGenericStack {
//    private LinkedList<T> stack;
//
//    public MyGenericStack() {
//        stack = new LinkedList<T>();
//    }
//
//    public void push(T element) {
//        stack.addFirst(element);
//    }
//
//    public T pop() {
//        if (isEmpty()) {
//            throw new EmptyStackException();
//        }
//        return stack.removeFirst();
//    }
//
//    public int size() {
//        return stack.size();
//    }
//
//    public boolean isEmpty() {
//        if (stack.size() == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}
