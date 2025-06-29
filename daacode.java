/*
import java.util.Arrays;
import java.util.Comparator;

class Item {
    double weight, value, ratio;

    // Constructor to initialize the values and calculate the value-to-weight ratio
    public Item(double weight, double value) {
        this.weight = weight;
        this.value = value;
        this.ratio = value / weight;  // Ratio for greedy selection
    }
}

 class FractionalKnapsack {

    // Method to solve the fractional knapsack problem
    public static double getMaxValue(Item[] items, double capacity) {
        // Step 1: Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, Comparator.comparingDouble(item -> -item.ratio));

        double totalValue = 0;  // Total value of items taken in the knapsack

        // Step 2: Iterate through sorted items and add them to knapsack
        for (Item item : items) {
            if (capacity >= item.weight) {
                // Step 2.1: If item can be taken in full, add its value and reduce capacity
                totalValue += item.value;
                capacity -= item.weight;
            } else {
                // Step 2.2: Take fractional part of the item if full item can't fit
                totalValue += item.ratio * capacity;
                break;  // No more capacity left, so break the loop
            }
        }
        return totalValue;  // Maximum value that fits in the knapsack
    }

    public static void main(String[] args) {
        Item[] items = {new Item(18, 25), new Item(15, 24), new Item(10, 15)};
        double capacity = 20;

        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum value we can obtain = " + maxValue);
    }
}
*/


//****************************************************************
/*
import java.util.Arrays;
import java.util.Comparator;

class Item {
    double weight;
    double value;

    // Constructor to initialize weight and value
    public Item(double weight, double value) {
        this.weight = weight;
        this.value = value;
    }

    // Method to calculate value-to-weight ratio for sorting
    public double getRatio() {
        return value / weight;
    }
}

public class FractionalKnapsack {

    public static double getMaxValue(Item[] items, double capacity) {
        // Step 1: Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, Comparator.comparingDouble(Item::getRatio).reversed());

        double totalValue = 0.0;  // To store total value we can fit in knapsack

        // Step 2: Add items to the knapsack
        for (Item item : items) {
            if (capacity >= item.weight) {
                // If the item can fit completely in the remaining capacity
                totalValue += item.value;  // Add its full value
                capacity -= item.weight;   // Reduce knapsack capacity
            } else {
                // If only part of the item can fit, take the fraction that fits
                totalValue += item.getRatio() * capacity;  // Add fractional value
                break;  // No more space, so stop adding items
            }
        }
        return totalValue;  // Return the total maximum value
    }

    public static void main(String[] args) {
        // Define an array of items with weight and value
        Item[] items = {new Item(10, 60), new Item(20, 100), new Item(30, 120)};
        double capacity = 50;

        // Calculate and print the maximum value that fits in the knapsack
        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum value we can obtain = " + maxValue);
    }
}
import java.util.Arrays;
import java.util.Comparator;

class Item {
    double weight;
    double value;

    // Constructor to initialize weight and value
    public Item(double weight, double value) {
        this.weight = weight;
        this.value = value;
    }

    // Method to calculate value-to-weight ratio for sorting
    public double getRatio() {
        return value / weight;
    }
}

public class FractionalKnapsack {

    public static double getMaxValue(Item[] items, double capacity) {
        // Step 1: Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, Comparator.comparingDouble(Item::getRatio).reversed());

        double totalValue = 0.0;  // To store total value we can fit in knapsack

        // Step 2: Add items to the knapsack
        for (Item item : items) {
            if (capacity >= item.weight) {
                // If the item can fit completely in the remaining capacity
                totalValue += item.value;  // Add its full value
                capacity -= item.weight;   // Reduce knapsack capacity
            } else {
                // If only part of the item can fit, take the fraction that fits
                totalValue += item.getRatio() * capacity;  // Add fractional value
                break;  // No more space, so stop adding items
            }
        }
        return totalValue;  // Return the total maximum value
    }

    public static void main(String[] args) {
        // Define an array of items with weight and value
        Item[] items = {new Item(10, 60), new Item(20, 100), new Item(30, 120)};
        double capacity = 50;

        // Calculate and print the maximum value that fits in the knapsack
        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum value we can obtain = " + maxValue);
    }
}
*/
/*
import java.util.Arrays;
import java.util.Comparator;
 class Item{

	double profit;double weight;

         Item(double weigth,double profit){
	 
		 this.profit=profit;
		 this.weight=weight;

	 }
	 double getRatio(){
	 
		 return profit/weight ;

	 }

}


class fractionsnapsackpractice{
             
	static double getmaxValue(Item[]arr,double capacity){
	Arrays.sort(arr,Comparator.comparingDouble(Item::getRatio).reversed());
            double totalValue=0.0;

	   for(int i=0;i<arr.length;i++){
	   
		   Item x=arr[i];
		   if(capacity>=x.weight){
		   
			   totalValue=totalValue+x.profit;
			   capacity=capacity-x.weight;

		   }else{
		            totalValue+=x.getRatio()*capacity;
			    break;
		   }
	   
 }



	public static void main(String []args ){
	
		Item[] arr={ new Item(12.0,15.0),new Item(14.0,16.0),new Item(10.0,14.0)};

		double  capacity=20;

	      double maxValue=getmaxValue(arr,capacity);
              System.out.println("Maximu value is :- "+maxValue);

	
	}

}
*/
/*
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Item {
    int weight, value;

    // Constructor to initialize weight and value
    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

class Node {
    int level, profit, bound, weight;

    // Constructor to initialize the node
    public Node(int level, int profit, int weight, int bound) {
        this.level = level;
        this.profit = profit;
        this.weight = weight;
        this.bound = bound;
    }
}

public class KnapsackBranchAndBound {

    // Function to solve 0-1 Knapsack problem using Branch and Bound
    public static int knapsack(Item[] items, int capacity) {
        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, (a, b) -> (b.value / b.weight) - (a.value / a.weight));

        // Priority Queue to store nodes of state space tree
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> -n.bound));

        // Create a dummy node at root level
        Node root = new Node(-1, 0, 0, 0);
        root.bound = calculateBound(root, items, capacity);
        pq.add(root);

        int maxProfit = 0;

        // Branch and Bound loop
        while (!pq.isEmpty()) {
            Node currentNode = pq.poll();

            // If the current node's bound is higher than maxProfit, explore further
            if (currentNode.bound > maxProfit) {
                // Explore taking the next item
                if (currentNode.level + 1 < items.length) {
                    Item currentItem = items[currentNode.level + 1];

                    // "Take" node
                    Node takeNode = new Node(currentNode.level + 1,
                            currentNode.profit + currentItem.value,
                            currentNode.weight + currentItem.weight,
                            0);

                    // If weight is within capacity, update maxProfit
                    if (takeNode.weight <= capacity && takeNode.profit > maxProfit) {
                        maxProfit = takeNode.profit;
                    }

                    // Calculate bound for "take" node and add to the queue if promising
                    takeNode.bound = calculateBound(takeNode, items, capacity);
                    if (takeNode.bound > maxProfit) {
                        pq.add(takeNode);
                    }

                    // "Skip" node (don't take the item)
                    Node skipNode = new Node(currentNode.level + 1,
                            currentNode.profit,
                            currentNode.weight,
                            0);
                    skipNode.bound = calculateBound(skipNode, items, capacity);

                    // Add "skip" node to queue if promising
                    if (skipNode.bound > maxProfit) {
                        pq.add(skipNode);
                    }
                }
            }
        }

        return maxProfit;
    }

    // Function to calculate upper bound on maximum profit
    private static int calculateBound(Node node, Item[] items, int capacity) {
        if (node.weight > capacity) return 0;

        int profitBound = node.profit;
        int totalWeight = node.weight;
        int i = node.level + 1;

        // Add items to bound until we reach the weight capacity
        while (i < items.length && totalWeight + items[i].weight <= capacity) {
            totalWeight += items[i].weight;
            profitBound += items[i].value;
            i++;
        }

        // If there are still items, add fractional part to bound
        if (i < items.length) {
            profitBound += (capacity - totalWeight) * items[i].value / items[i].weight;
        }

        return profitBound;
    }

    public static void main(String[] args) {
        Item[] items = {new Item(10, 60), new Item(20, 100), new Item(30, 120)};
        int capacity = 50;

        int maxProfit = knapsack(items, capacity);
        System.out.println("Maximum profit we can obtain = " + maxProfit);
    }
}
*/


import java.util.Arrays;
import java.util.Comparator;

class Job {
    int id;      // Job ID
    int deadline; // Deadline for the job
    int profit;   // Profit for completing the job

    // Constructor
    public Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
 class JobSequencing {

    // Function to find the maximum profit sequence of jobs
    public static int scheduleJobs(Job[] jobs, int n) {
        // Step 1: Sort the jobs in decreasing order of profit
        Arrays.sort(jobs, Comparator.comparingInt((Job job) -> job.profit).reversed());

        // Step 2: Create a result array to track free time slots
        boolean[] slots = new boolean[n];  // n is the number of jobs
        Arrays.fill(slots, false);  // All slots are initially free

        int totalProfit = 0;  // Variable to store the total profit

        // Step 3: Iterate through all jobs and try to schedule them
        for (int i = 0; i < n; i++) {
            // Find a slot for this job (start from the latest possible slot)
            for (int j = Math.min(n, jobs[i].deadline) - 1; j >= 0; j--) {
                // If the slot is free, assign the job to this slot
                if (!slots[j]) {
                    slots[j] = true;  // Mark this slot as occupied
                    totalProfit += jobs[i].profit;  // Add profit to total
                    break;  // Break once the job is scheduled
                }
            }
        }

        return totalProfit;  // Return the total profit
    }

    public static void main(String[] args) {
        // Array of jobs with ID, Deadline, Profit
        Job[] jobs = {
            new Job(1, 4, 20),
            new Job(2, 1, 10),
            new Job(3, 1, 40),
            new Job(4, 1, 30)
        };

        int n = jobs.length;  // Total number of jobs

        // Call the function to get the maximum profit
        int maxProfit = scheduleJobs(jobs, n);

        // Output the maximum profit
        System.out.println("Maximum Profit: " + maxProfit);
    }
}

