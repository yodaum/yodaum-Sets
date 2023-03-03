
import java.util.HashSet;

/**
 * Sets are unordered collections of elements. Sets do not allow duplicates.
 *
 * Sets are very efficient for storing items that should be unique.
 *
 * You can read about HashSet, a common and very efficient implementation of Set, here:
 * https://www.w3schools.com/java/java_hashset.asp
 */
public class Lab {
    /**
     * Instantiate and return a Set of Integers.
     *
     * Like List, Set is an interface. However, the Set interface is different: for instance, it doesn't make sense
     * for Sets to have a get method to retrieve an item at a particular index from a set, because Sets are unordered.
     *
     * Some common implementations of Set are HashSet and TreeSet. Look into how to instantiate them.
     * @return a new Set<Integer> object.
     */
    public HashSet<Integer> createSet(){
        HashSet<Integer> set = new HashSet<Integer>();
        return set;
    }

    /**
     * Return the size of a set.
     * @param set The set that we will be manipulating.
     * @return the size of set. (number of values)
     */
    public int getSize(HashSet<Integer> set){
        int Size = set.size();
        return Size;
    }

    /**
     * Add a new, unique item to a set. Sets can only store unique items (no duplicates).
     * @param set The set that we will be manipulating.
     * @param item The item which we will be adding to set.
     * @return nothing, pass by reference will cause changes to the list object to be reflected across the program.
     */
    public void addUniqueItem(HashSet<Integer> set, int item){
        
            set.add(item);

    }

    /**
     * Remove an item from a set.
     * @param set The set that we will be manipulating.
     * @param item The item which we will be removing from set.
     * @return nothing, pass by reference will cause changes to the list object to be reflected across the program.
     */
    public void removeItem(HashSet<Integer> set, int item){

            set.remove(item);


    }
}
