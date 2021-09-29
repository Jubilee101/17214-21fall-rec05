package edu.cmu.cs.cs214.rec04;

import java.util.ArrayList;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

// HINT: Take a look at the UML diagram to see what DelegationSortedIntList
//       should implement.
public class DelegationSortedIntList implements IntegerList {
    // the number of attempted element insertions
    private int totalAdded;
    private SortedIntList list;
    /**
     * Gets the total number of attempted int insertions to the list since it.
     * was created.
     *
     * @return total number of integers added to the list.
     */
    public DelegationSortedIntList(){
        this.totalAdded = 0;
        this.list = new SortedIntList();
    }
    public boolean add(int num){
        totalAdded++;
        return list.add(num);
    }
    public boolean addAll(IntegerList list){
        totalAdded += list.size();
        return this.list.addAll(list);
    }
    public int getTotalAdded()
    {
        return totalAdded;
    }

    public boolean remove(int num){
        return list.remove(num);
    }

    public boolean removeAll(IntegerList list) {
        return list.removeAll(list);
    }
    public int size(){
        return list.size();
    }
    public int get(int index){
        return list.get(index);
    }
}