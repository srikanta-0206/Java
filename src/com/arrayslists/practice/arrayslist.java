package com.arrayslists.practice;

public class arrayslist {
    private Object[] data;
    private int size;

    public arrayslist() {
        data = new Object[10];
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            grow();
        }
        data[size] = value;
        size++;
    }
    public void add(int index,int value){

        for(int i = size-1;i>=index;i--){
             data[i+1] = data[i];
        }
        data[index]=value;
        size++;
    }
    public void grow(){
        Object[] newdata = new Object[data.length*2];
        for (int i =0;i<size;i++){
            newdata[i] = data[i];
        }
        data=newdata;
        System.out.println("done");
    }
    public Object get(int index){
        if(index<0 || index>=size){
            System.out.println("too big or negative");
            return-1;
        }
        return data[index];

    }

    public void remove(int index){
        if(index<0 || index>=size){
            System.out.println("too big or negative");
            return;
        }
        for(int i =index;i<=size-1;i++){
            data[i]= data[i+1];
        }
        size--;
    }


    public void clear(){
        size=0;
    }
    public int size(){
        return size;
    }
public void printall(){
        for(int i =0;i<size;i++){
            System.out.print(data[i]+" ");
        }
}

}

class test {
    public static void main(String[] args) {
        arrayslist a = new arrayslist();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
//        a.printall();
        System.out.println("______________________");
        System.out.println(a.size());



    }
}

