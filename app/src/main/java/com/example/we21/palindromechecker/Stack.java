package com.example.we21.palindromechecker;

/**
 * Created by Harsh on 6/3/2017.
 */

public class Stack {
    private int MaxSize;
    private int top;
    private char StackArray[];

    public Stack(int s) {
        MaxSize = s;
        top = -1;
        StackArray = new char[MaxSize];
    }

    public boolean isFull(){
        return (top+1==MaxSize);
    }

    public void push(char V){
        if(!isFull()){
            StackArray[++top]=V;
        }
        else{
            System.out.println("Array is full");
        }
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public char pop(){
        if(!isEmpty()){
            return StackArray[top--];
        }
        else{
            return 'o';
        }
    }
    public char peak(){
        if(!isEmpty()){
            return StackArray[top];
        }
        else{
            return 'o';
        }
    }
}
