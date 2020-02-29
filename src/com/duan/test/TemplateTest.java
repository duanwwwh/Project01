package com.duan.test;

import com.duan.bean.Customer;

import java.util.ArrayList;

/**
 * @author duan
 * @create_time 2020--02--28--13:40
 */
public class TemplateTest {
    public static void main(String[] args) {
        //模板sout
        System.out.println();

        System.out.println(args);

        String[] arr = new String[]{"a","b","c"};
        //模板fori
        for (int i = 0; i < arr.length; i++) {
            //模板xxx.sout,arr[i].sout
            System.out.println(arr[i]);
        }
        //模板iter
        for (String s : arr) {
            System.out.println(s);
        }
        //模板itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //list.for
        ArrayList<Integer> list = new ArrayList();
        list.add(333);
        list.add(444);
        list.add(555);
        //list.for
        for (Integer integer : list) {
            System.out.println(integer);
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        //ifn模板
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
        //list.nn
        if (list != null) {

        }
        //list.null
        if (list == null) {

        }


    }

    //模板prsf  private static final
    private static final Customer cust = new Customer();
    //psf
    public static final int NUM = 1;
    //psfi
    public static final int NUMBER = 2;
    //psfs
    public static final String name = "sana";
}
