import java.util.ArrayList;
import java.util.Collections;

public class arrayaslist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
 
        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15); // insert at index
 
        System.out.println("Initial list: " + list);
 
        // Access
        System.out.println("Element at index 2: " + list.get(2));
 
        // Update
        list.set(0, 100);
 
        // Remove
        list.remove(Integer.valueOf(30)); // remove by value
        list.remove(0); // remove by index
 
        System.out.println("After updates/removals: " + list);
 
        // Search
        System.out.println("Contains 15? " + list.contains(15));
        System.out.println("Index of 15: " + list.indexOf(15));
 
        // Iterate
        for (int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
 
        // Sort
        ArrayList<Integer> nums = new ArrayList<>(java.util.List.of(5, 3, 8, 1, 9));
        Collections.sort(nums);
        System.out.println("Sorted: " + nums);
 
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("Sorted desc: " + nums);
 
        // Size and empty check
        System.out.println("Size: " + nums.size());
        System.out.println("Is empty? " + nums.isEmpty());
 
        // Clear
        nums.clear();
        System.out.println("After clear: " + nums + " empty? " + nums.isEmpty());
    }
}
 

