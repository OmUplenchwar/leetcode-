# [Shortest Path in an Undirected Graph](https://www.geeksforgeeks.org/problems/shortest-path-in-weighted-undirected-graph/1)
## Medium
Given a weighted undirected graph with V vertices numbered from 1 to V and E edges, where edges[i] = [u, v, w] denotes an undirected edge between vertices u and v with weight w. We are also given two vertices src and dest, find the shortest path from src to dest.

If multiple shortest paths exist with the same total weight, return the one whose sequence of vertices is lexicographically smallest. 
If no path exists between src and dest, return {-1}.

Note: The graph contains no negative-weight edges.
Examples :
Input: V = 5, edges[][] = [[1, 2, 2], [2, 5, 5], [2, 3, 4], [1, 4, 1], [4, 3, 3], [3, 5, 1]], src = 1, dest = 5
Output: [1, 4, 3, 5]
Explanation: The shortest path from vertex 1 to vertex 5 is 1 -&gt; 4 -&gt; 3 -&gt; 5 with a total weight of 5.
Input: V = 6, edges[][] = [[1, 2, 1], [1, 3, 1], [2, 4, 1], [3, 4, 1], [4, 6, 1], [2, 5, 2], [5, 6, 1]], src = 1, dest = 6
Output: [1, 2, 4, 6]
Explanation: There are two shortest paths from 1 to 6 with total weight 3: 1 -&gt; 2 -&gt; 4 -&gt; 6 and 1 -&gt; 3 -&gt; 4 -&gt; 6. Since [1, 2, 4, 6] is lexicographically smaller, it is returned.
Input: V = 5, edges[][] = [[1,2,4], [2,3,2], [4,5,1]], src = 1, dest = 5Output: [-1]
Explanation: Since there are no edges, so no answer is possible.
Constraint:
2 ≤ V ≤ 10^50 ≤ E ≤ 2 × 10^51 ≤ edges[i][2] ≤ 10^41 ≤ src, dest ≤ V
