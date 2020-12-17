package org.veritasopher.seniz;

import org.junit.Test;
import org.veritasopher.seniz.core.model.DependencyGraph;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/**
 * Unit Test
 *
 * @author Yepeng Ding
 * @date 12/2/2020
 */
public class UnitTest {

    @Test
    public void testDependencyGraph() {
        Set<String> set = new HashSet<>();
        IntStream.range(0, 6).forEach(i -> set.add(String.valueOf(i)));

        DependencyGraph<String> g = new DependencyGraph<>(set);
        g.addEdge("5", "2");
        g.addEdge("5", "0");
        g.addEdge("4", "0");
        g.addEdge("4", "1");
        g.addEdge("2", "3");
        g.addEdge("3", "1");

        assertEquals("[0, 1, 3, 2, 4, 5]", g.getTopologicalSortedStack().toString());
    }


}
