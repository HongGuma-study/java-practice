package me.java.generic;

import me.java.generic.gift.Item;

import java.util.Arrays;
import java.util.Objects;

public class Gifts<T extends Item> {

    private static final int DEFULAT_SIZE = 10;
    private int size;

    private T[] gifts;
    private int count;

    public Gifts() {
        gifts = (T[]) new Item[DEFULAT_SIZE];
        this.size = DEFULAT_SIZE;
    }

    public Gifts(int size) {
        gifts = (T[]) new Item[size];
        this.size = size;
    }

    public T get(int i) {
        return gifts[i];
    }

    public void set(int i, T element) {
        gifts[i] = element;
    }


    public void add(T element) {
        if (count < size) {
            gifts[count] = element;
            count++;
        } else {
            T[] origin = Arrays.copyOf(gifts, count);
            size *= 2;
            gifts = Arrays.copyOf(origin, size);
            add(element);
        }
    }

    public void add(int i, T element) {
        //TODO : Exception ) add index 10 out of bounds for length 10
        T[] tmp = (T[]) new Item[gifts.length+1];

        for(int n=0; n<gifts.length+1; n++){
            if(n == i){
                tmp[n] = element;
            }else tmp[n] = gifts[n];
        }
        this.gifts = tmp;
    }

    public void clear() {
        this.gifts = null;
        this.size = 0;
        this.count = 0;
    }

    public void pop() {
        T[] tmp = (T[]) new Item[this.gifts.length];
        int cnt = 0;
        for(T gift : gifts){
            if(gift != null){
                cnt++;
            }
        }
        for(int i=0; i<gifts.length; i++){
            if(i == cnt) break;
            tmp[i] = gifts[i];
        }
        this.gifts = tmp;
    }

    public void remove(int i ) {
        T[] tmp = (T[]) new Item[size];
        int n = 0;
        for(T gift : gifts){
            if(gifts[i] == gift) continue;
            tmp[n] = gift;
            n++;
        }
    }

    public void remove(T element) {
        int elementIndex = -1;
        for (int i = 0; i < count; i++) {
            if (gifts[i] != null) {
                if (gifts[i].equals(element)) {
                    elementIndex = i;
                }
            }
        }
        if (elementIndex == -1) {
            System.out.println(element + " can't be found.");
        } else {
            gifts[elementIndex] = null;
            for (int i = elementIndex+1; i < count; i++) {
                gifts[i-1] = gifts[i];
            }
            count--;

            System.out.println(element + " removed successfully.");
        }
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public T[] getGifts() {
        return gifts;
    }

    public void setGifts(T[] gifts) {
        this.gifts = gifts;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gifts<?> that = (Gifts<?>) o;
        return size == that.size && count == that.count && Arrays.equals(gifts, that.gifts);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size, count);
        result = 31 * result + Arrays.hashCode(gifts);
        return result;
    }

    @Override
    public String toString() {
        return "RandomGiftBox{" +
                "size=" + size +
                ", gifts=" + Arrays.toString(gifts) +
                ", count=" + count +
                '}';
    }

    public void trimToSize() {
        gifts = Arrays.copyOf(gifts, count);
    }

    public void print() {
        if (count == 0) {
            System.out.println("Nothing to print in array.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(gifts[i]);
        }
    }
}
