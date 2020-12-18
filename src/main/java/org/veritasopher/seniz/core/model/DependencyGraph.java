package org.veritasopher.seniz.core.model;

import java.util.*;
import java.util.stream.IntStream;

public class DependencyGraph<T> {

    // Number of vertices (compilation units)
    private final Set<T> vertices;

    // Successor list of vertices
    // Map<Vertex, Successor Set>
    private final Map<T, Set<T>> sucMap;

    public DependencyGraph(Set<T> vertices) {
        this.vertices = vertices;
        sucMap = new HashMap<>();
        vertices.forEach(v -> sucMap.put(v, new HashSet<>()));
    }

    /**
     * Add an edge to dependency graph
     *
     * @param src source vertex
     * @param dst destination vertex
     */
    public void addEdge(T src, T dst) {
        Set<T> sucList = sucMap.get(src);
        sucList.add(dst);
    }

    /**
     * Topological sort recursive function
     *
     * @param v vertex
     * @param visited visited map
     * @param stack result stack
     */
    private void topologicalSort(T v, Map<T, Boolean> visited, Stack<T> stack) {
        // Mark the current node as visited.
        visited.put(v, true);

        Set<T> adjSet = sucMap.get(v);
        for (T suc : adjSet) {
            if (!visited.get(suc)) {
                topologicalSort(suc, visited, stack);
            }
        }

        stack.push(v);
    }

    /**
     * Run topological sort
     */
    public List<T> getTopologicalSortedStack() {
        Stack<T> stack = new Stack<>();

        // Mark all the vertices as not visited
        Map<T, Boolean> visited = new HashMap<>();
        vertices.forEach(v -> visited.put(v, false));

        for (T v :
                vertices) {
            if (!visited.get(v)) {
                topologicalSort(v, visited, stack);
            }
        }

        // Stack to list
        List<T> result = new ArrayList<>();
        while (!stack.empty()) {
            result.add(stack.pop());
        }
        return result;
    }

}

