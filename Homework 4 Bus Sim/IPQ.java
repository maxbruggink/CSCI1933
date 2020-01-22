// Priority Queue and Simulation
/**from CSCI 1933 Lecture Examples*/
public interface IPQ {

    // Priority Queue Interface

    /** 
     * Places an event object into priority queue with priority given
     * by time 
     */
    public void add(Event o, double time);

    /** 
     * Removes and returns the highest priority event in a priority
     * queue; returns null if the priority queue is empty 
     */
    public Event remove();

    /** 
     * Returns true if the priority queue is empty, false otherwise 
     */
    public boolean isEmpty();
     
    /** 
     * Returns the priority associated with the top priority event in the
     * priority queue 
     */
    public double getCurrentTime();

}  // IPQ
