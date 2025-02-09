package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkintechList <T extends Comparable<T>>extends ArrayList<T>{

    private List<T> list;

    public WorkintechList(){
        list=new ArrayList<>();
    }
    public boolean add(T element){
        if(!list.contains(element)){
            list.add(element);
            return true;
        }
        return false;
    }
    public void sort(){
        Collections.sort(list);
    }
    public boolean remove(Object element){
        boolean isRemoved= list.remove(element);
        if(isRemoved){
            sort();
        }
        return isRemoved;
    }
    public T get(int index){
        return list.get(index);
    }
    public T set(int index,T element){
        return list.set(index,element);
    }
    public int size(){
        return list.size();
    }
    public void clear(){
        list.clear();
    }
    public List<T> getList(){
        return list;
    }


}
