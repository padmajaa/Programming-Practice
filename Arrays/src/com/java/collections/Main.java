package com.java.collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class Main {
	 public static void main(String[] a) {
		    List<String> list = new LinkedList<String>();
		    list.add("A");
		    list.add("B");
		    list.add("C");
		    list.add("D");

		    ListIterator<String> iter = list.listIterator(list.size());

		    while (iter.hasPrevious()) {
		      System.out.println(iter.previous());
		    }

		  }
		}

