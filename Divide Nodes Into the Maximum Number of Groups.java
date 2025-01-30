class Solution {
    public int magnificentSets(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<n; i++){
            adjList.add(new ArrayList<Integer>());
        }

        for(int[] edge : edges){
            adjList.get(edge[0] - 1).add(edge[1] -1);
            adjList.get(edge[1] - 1).add(edge[0] -1);
        }

        int[] colors = new int[n];
        for(int node = 0; node<n; node++){
            if(colors[node] != 0) continue;
            colors[node] = 1;
            if(!isBipartite(adjList, node, colors)) return -1;
        }

    int[] distances = new int[n];
        for (int node = 0; node < n; node++) {
            distances[node] = getLongestLength(adjList, node, n);
        }
        // n+m
        int maxNumberOfGroups = 0;
        boolean[] visited = new boolean[n];
        for (int node = 0; node < n; node++) {
            if (visited[node]) continue;
            maxNumberOfGroups += getNumberOfGroupsForComponent(adjList,node,distances,visited);
        }
        return maxNumberOfGroups;
    }

   
    private boolean isBipartite(ArrayList<ArrayList<Integer>> adjList,int node,int[] colors) {
        for (int neighbor : adjList.get(node)) {
            if (colors[neighbor] == colors[node]) return false;
            if (colors[neighbor] != 0) continue; 
            colors[neighbor] = -1*(colors[node]); 
            if (!isBipartite(adjList, neighbor, colors)) return false;
        }
        return true;
    }

    private int getLongestLength(ArrayList<ArrayList<Integer>> adjList,int node,int n) {
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[] visited = new boolean[n];
        queue.add(node);
        visited[node] = true;
        int distance = 0;

        while (!queue.isEmpty()) {
            int numOfNodesInLayer = queue.size();
            for (int i = 0; i < numOfNodesInLayer; i++) {
                int currentNode = queue.poll();
                for (int neighbor : adjList.get(currentNode)) {
                    if (visited[neighbor]) continue;
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
            distance++;
        }
        return distance;
    }

    
    private int getNumberOfGroupsForComponent(ArrayList<ArrayList<Integer>> adjList,int node,int[] distances,boolean[] visited) {
        int maxNumberOfGroups = distances[node];
        visited[node] = true;

        for (int neighbor : adjList.get(node)) {
            if (visited[neighbor]) continue;
            maxNumberOfGroups = Math.max(
                maxNumberOfGroups,
                getNumberOfGroupsForComponent(adjList,neighbor,distances,visited));
        }
        return maxNumberOfGroups;
    }
}
