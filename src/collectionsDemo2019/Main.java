package collectionsDemo2019;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        // List interface and all the available classes
        List<String> listArrayList = new ArrayList<>();
        List<String> listLinkedList = new LinkedList<>();
        List<String> listVector = new Vector<>();
        List<String> listStack = new Stack<>();

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Vector<String> vector = new Vector<>();
        Stack<String> stack = new Stack<>();

        Queue<String> queuePriorityQueue = new PriorityQueue<>();
        Queue<String> queueArrayDequeue = new ArrayDeque<>();

        Deque<String> deqeueArrayDequeue = new ArrayDeque<>();
        Deque<String> dequeuelinkedList = new LinkedList<>();

        Set<String> stringSet = new HashSet<>();
        Set<String> stringLinkedHashSet = new LinkedHashSet<>();
        Set<String> stringTreeSet = new TreeSet<>();

        SortedSet<String> sortedTreeSet = new TreeSet<>();

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
    }
}
