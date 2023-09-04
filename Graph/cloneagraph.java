package Graph;

public class cloneagraph {
    // To clone a graph, we will need to traverse it. The approach here is to use
    // BFS graph traversal. To clone a graph, you need to have a copy of each node
    // and you need to avoid copying the same node multiple times. So we need a
    // mapping from an original node to its copy.

    // The steps are as follows :

    // We need to keep track of the visited/cloned nodes to avoid making multiple
    // copies of the same node. Hence, a HashMap is required in order to maintain
    // all the nodes which have already been created. Where in the HashMap the key
    // stores the address of the original node and the value stores the address of
    // the cloned node.
    // Now in order to reach each node and its neighbours, we are creating a queue
    // for BFS traversal and a HashMap which keeps a track of all the nodes which
    // are already created.
    // Create a new node corresponding to the given reference node and insert that
    // node in the HashMap which marks it as visited.
    // Push the given reference node into a queue and now keep repeating the below
    // steps until the queue isn’t empty.
    // Get the front node and pop it from the queue and visit all its neighbours,
    // now check if a new cloned node has already been created for each neighbouring
    // node (check it in the HashMap).
    // If it wasn’t created, then create a new clone node corresponding to the
    // neighbour node and insert it into the HashMap and also push this node into
    // the queue.
    // Now add the cloned neighbours to “neighbours” list of the cloned node.
    // Ultimately when the queue is empty, return the source node of the cloned
    // graph.

}
