
public class TreeProperty {
	/*
	 * Tree's diameter: longest path in the tree
	 * How to get the diameter?
	 * 	1) BFS start from any node -> farthest node
	 * 	2) BFS start from the farthest node -> longest path diameter
	 * 
	 * Center: the node which is used as the root of a tree with the minimum depth, at least one, at most two
	 * Radius: when using the tree's center as the root, the depth is tree's radius
	 * 
	 * Diameter's property:
	 * For any node in the tree, the longest distance from the node is to one of the diameter endpoints
	 * 
	 * Some questions
	 * 1. Given a tree, you can start from any node, go to visit every other node, and then finally
	 * return back to the start. What's the minimum distance for the entire trip?
	 * Answer = 2 * sum of edges weight
	 * 
	 * 2. Given a tree, you start from a specific node u, go to visit every other node, and then finally
	 * no need to return back to the start. What's the minimum distance for the entire trip?
	 * Answer = 2 * sum of edges weight - longest distance from the start node
	 * 
	 * 3. Given a tree, you start from any node, go to visit every other node, and then finally no need
	 * to return back to the start. What's the minimum distance for the entire trip?
	 * Answer = 2 * sum of edges weight - diameter
	 */
}
