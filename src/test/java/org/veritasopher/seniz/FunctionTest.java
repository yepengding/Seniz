package org.veritasopher.seniz;

import org.junit.Test;
import org.veritasopher.seniz.config.Info;
import org.veritasopher.seniz.controller.MasterController;
import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.core.model.common.*;
import org.veritasopher.seniz.core.model.domain.PrimaryType;
import org.veritasopher.seniz.generator.dot.DOTGenerator;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.veritasopher.seniz.util.PathUtil.getFilePathInResource;

/**
 * Function Test
 * Test system functionality
 *
 * @author Yepeng Ding
 * @date 12/17/2020
 */
public class FunctionTest {

    @Test
    public void testEvaluationEquality() {
        Value v0 = new Value(PrimaryType.INTEGER, 3);
        Value v1 = new Value(PrimaryType.INTEGER, 3);

        assert v0.equals(v1);

        Term t0 = new Term(v0);
        Term t1 = new Term(v1);

        assert t0.equals(t1);

        Evaluation e0 = new Evaluation();
        e0.addTerm(t0);

        Evaluation e1 = new Evaluation();
        e1.addTerm(t1);

        assert e0.equals(e1);

        StateVariable sv0 = new StateVariable("status", PrimaryType.INTEGER, e0);
        StateVariable sv1 = new StateVariable("status", PrimaryType.INTEGER, e1);

        assert sv0.equals(sv1);

        Set<StateVariable> set0 = new HashSet<>();
        set0.add(sv0);

        Set<StateVariable> set1 = new HashSet<>();
        set1.add(sv1);

        assert set0.equals(set1);

        State s0 = new State(set0);
        State s1 = new State(set1);

        assert s0.equals(s1);
    }

    @Test
    public void testEvaluationInequality() {
        Value v0 = new Value(PrimaryType.INTEGER, 0);
        Value v1 = new Value(PrimaryType.INTEGER, 1);
        Value v2 = new Value(PrimaryType.BOOLEAN, false);
        Value v3 = new Value(PrimaryType.INTEGER, true);

        assert !v0.equals(v1);
        assert !v2.equals(v3);
        assert !v0.equals(v2);

        Term t0 = new Term(v0);
        Term t1 = new Term(v1);
        Term t2 = new Term(v2);
        Term t3 = new Term(v3);

        assert !t0.equals(t1);
        assert !t2.equals(t3);
        assert !t0.equals(t2);

        Evaluation e0 = new Evaluation();
        e0.addTerm(t0);

        Evaluation e1 = new Evaluation();
        e1.addTerm(t1);

        Evaluation e2 = new Evaluation();
        e2.addTerm(t2);

        Evaluation e3 = new Evaluation();
        e3.addTerm(t3);

        assert !e0.equals(e1);
        assert !e2.equals(e3);
        assert !e0.equals(e2);

        StateVariable sv0 = new StateVariable("status", PrimaryType.INTEGER, e0);
        StateVariable sv1 = new StateVariable("status", PrimaryType.INTEGER, e1);
        StateVariable sv2 = new StateVariable("flag", PrimaryType.BOOLEAN, e2);
        StateVariable sv3 = new StateVariable("flag", PrimaryType.BOOLEAN, e3);

        assert !sv0.equals(sv1);
        assert !sv2.equals(sv3);
        assert !sv0.equals(sv2);

        Set<StateVariable> set0 = new HashSet<>();
        set0.add(sv0);
        set0.add(sv2);

        Set<StateVariable> set1 = new HashSet<>();
        set1.add(sv1);
        set1.add(sv3);

        assert !set0.equals(set1);

        State s0 = new State(set0);
        State s1 = new State(set1);

        assert !s0.equals(s1);
    }

    @Test
    public void testMultiFileCompileByPaths() {
        String path = getFilePathInResource("example/MultiSys");
        File folder = new File(path);
        FilenameFilter filter = (f, name) -> name.endsWith(Info.SUFFIX);
        File[] files = folder.listFiles(filter);
        assertNotNull(files);
        Set<String> sourceFilePaths = Arrays.stream(files).parallel().map(File::getAbsolutePath).collect(Collectors.toSet());
        assertEquals(5, sourceFilePaths.size());

    }


    @Test
    public void testSingleFileCompile() {
        String path = getFilePathInResource("example/Simple0.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);
        DOTGenerator dotGenerator = new DOTGenerator(env);
        dotGenerator.generateToConsole();

    }

}
