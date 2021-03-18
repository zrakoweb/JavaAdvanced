package uzduotis1.collections;

import uzduotis1.collections.model.Payment;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Payment> payments = Payment.paymentNumberGenerator(1000);
        ArrayList<Payment> arrayList = copyArray(payments);
        LinkedList<Payment> linkedListList = copyLinked(payments);
        List<Payment> newList = new ArrayList<>();

        System.out.println(System.currentTimeMillis());
        arrayList.get(10).getDate();
        System.out.println(System.currentTimeMillis());
        linkedListList.get(10).getDate();
        System.out.println(System.currentTimeMillis());
        System.out.println(arrayList.size());
        newList = unique(arrayList);
        System.out.println(newList.size());




    }
    public static List<Payment> unique(List<Payment>list){
        List<Payment> newList = new ArrayList<>();
        for(Payment payment:list){
            if(!newList.contains(payment.getId())){
                newList.add(payment);
            }
        }return newList;
    }

    public static <E> ArrayList<E> copyArray(List<E> list){
        ArrayList<E> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        return arrayList;
    }
    public static <E> LinkedList<E> copyLinked(List<E> list){
        LinkedList<E> linkedList = new LinkedList<>();
        linkedList.addAll(list);
        return linkedList;
    }
}
