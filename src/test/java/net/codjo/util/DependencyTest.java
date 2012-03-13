package net.codjo.util;
import net.codjo.util.file.FileUtil;
import java.io.File;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
/**
 *
 */
public class DependencyTest {

    @Test
    public void test_dependency() throws Exception {
        String pomContent = FileUtil.loadContent(new File("pom.xml"));

        assertTrue("",
                   pomContent.contains("<dependencies><dependency><groupId>junit</groupId>"));
    }
}
