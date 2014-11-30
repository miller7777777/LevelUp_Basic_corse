package com;

/**
 * Created by mille_000 on 30.11.2014.
 */
public class Collection {
    int size =0;
    int[] arr;

    public void add(int number){

        int[] newArray = new int[size+1];
        if(size != 0){
            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];

            }
        }

        newArray[size] = number;
        size++;
        arr = newArray;
    }

    public void remove(int index){

        if(index < size && index >= 0){
            if(size != 0){
                if(size == 1){
                    arr = null;
                    size = 0;
                    return;

                }
                int[] newArray = new int[size - 1];
                for (int i = 0; i < index; i++) {
                    newArray[i] = arr[i];

                }
                for (int i = index + 1; i < arr.length; i++) {
                    newArray[i - 1] = arr[i];
                }
                size--;
                arr = newArray;

            }else {
                System.err.println("Коллекция пуста");
            }

        }else {
            System.err.println("Коллекция не существует");
        }


    }

    public void insert(int index, int number){

    }

    public int[] qSort(int[] array, int begin, int end){
        int l = begin;
        int r = end;
        int p = ((array[l] + array[r])/2);
        while (l <= r){
            while (array[l] < p){
                l++;
            }
            while (array[r] > p){
                r--;
            }
            if(l <= r){
                int temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l++;
                r--;
            }
            if(r > begin){
                qSort(array,begin, r);
            }
            if(l < end){
                qSort(array, l,end);
            }

        }
        arr = array;
        return arr;
    }
}
