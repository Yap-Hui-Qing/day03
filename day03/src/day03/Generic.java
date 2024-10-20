package day03;

import java.util.Objects;

import javax.swing.Box;

public class Generic {
    static class Box1{
        private Object item;
        
        public void setItem(Object item){
            this.item = item;
        }

        public Object getItem(){
            return this.item;
        }

        public boolean isEmpty(){
            return Objects.isNull(this.item);
        }
    }

    // generic type
    // T is a placeholder for the actual type
    // static -- accessible without object instantiation
    static class Box<T>{
        private T item;
        public void setItem(T item){
            this.item = item;
        }
        public T getItem(){
            return this.item;
        }
        public boolean isEmpty(){
            return Objects.isNull(this.item);
        }
    }

    public static void main(String[] args){
        //specify the type when instantiating the object
        Box<String> boxOfStrings = new Box<String>();
        // can leave the type empty on the RHS -- type inference
        Box<Cookie> boxOfCookies = new Box<>();

        boxOfStrings.setItem("Hello Fred");
        //boxOfStrings.setItem(123); -- must be of type String
        System.out.println(boxOfStrings.getItem());

        Box<Object> box = new Box<>();
        box.setItem("hello, world");
        System.out.println(box.getItem());

        Box1 box1 = new Box1();
        box1.setItem(123);
        System.out.println(box1.getItem());
        
    }
}
