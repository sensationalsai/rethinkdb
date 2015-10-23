// Autogenerated by convert_tests.py and process_polyglot.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../templates/Test.java
package gen;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.gen.exc.*;
import com.rethinkdb.gen.ast.*;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.model.MapObject;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.net.Connection;
import com.rethinkdb.net.Cursor;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.Instant;
import java.util.stream.LongStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import java.util.Collections;
import java.nio.charset.StandardCharsets;

import static gen.TestingCommon.*;
import gen.TestingFramework;

public class MathLogicSub {
    // Tests for basic usage of the subtraction operation
    Logger logger = LoggerFactory.getLogger(MathLogicSub.class);
    public static final RethinkDB r = RethinkDB.r;

    Connection<?> conn;
    public String hostname = TestingFramework.getConfig().getHostName();
    public int port = TestingFramework.getConfig().getPort();

    @Before
    public void setUp() throws Exception {
        logger.info("Setting up.");
        conn = TestingFramework.createConnection();
        try {
            r.dbCreate("test").run(conn);
            r.db("test").wait_().run(conn);
        }catch (Exception e){}
    }

    @After
    public void tearDown() throws Exception {
        logger.info("Tearing down.");
        r.db("rethinkdb").table("_debug_scratch").delete();
        if(!conn.isOpen()){
            conn.close();
            conn = TestingFramework.createConnection();
        }
        r.dbDrop("test").run(conn);
        conn.close(false);
    }

    // Autogenerated tests below

        @Test(timeout=120000)
    public void test() throws Exception {
                
        {
            // math_logic/sub.yaml line #6
            /* 0 */
            Long expected_ = 0L;
            /* r.expr(1) - 1 */
            logger.info("About to run line #6: r.expr(1L).sub(1L)");
            Object obtained = runOrCatch(r.expr(1L).sub(1L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #6");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #6:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/sub.yaml line #7
            /* 0 */
            Long expected_ = 0L;
            /* 1 - r.expr(1) */
            logger.info("About to run line #7: r.sub(1L, r.expr(1L))");
            Object obtained = runOrCatch(r.sub(1L, r.expr(1L)),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #7");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #7:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/sub.yaml line #8
            /* 0 */
            Long expected_ = 0L;
            /* r.expr(1).sub(1) */
            logger.info("About to run line #8: r.expr(1L).sub(1L)");
            Object obtained = runOrCatch(r.expr(1L).sub(1L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #8");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #8:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/sub.yaml line #17
            /* -2 */
            Long expected_ = -2L;
            /* r.expr(-1) - 1 */
            logger.info("About to run line #17: r.expr(-1L).sub(1L)");
            Object obtained = runOrCatch(r.expr(-1L).sub(1L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #17");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #17:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/sub.yaml line #22
            /* -6.75 */
            Double expected_ = -6.75;
            /* r.expr(1.75) - 8.5 */
            logger.info("About to run line #22: r.expr(1.75).sub(8.5)");
            Object obtained = runOrCatch(r.expr(1.75).sub(8.5),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals((double) expected_,
                             ((Number) obtained).doubleValue(),
                             0.00000000001);
            logger.info("Finished running line #22");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #22:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/sub.yaml line #26
            /* -13 */
            Long expected_ = -13L;
            /* r.expr(1).sub(2,3,4,5) */
            logger.info("About to run line #26: r.expr(1L).sub(2L, 3L, 4L, 5L)");
            Object obtained = runOrCatch(r.expr(1L).sub(2L, 3L, 4L, 5L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #26");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #26:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/sub.yaml line #30
            /* err('ReqlQueryLogicError', 'Expected type NUMBER but found STRING.', [0]) */
            Err expected_ = err("ReqlQueryLogicError", "Expected type NUMBER but found STRING.", r.array(0L));
            /* r.expr('a').sub(0.8) */
            logger.info("About to run line #30: r.expr('a').sub(0.8)");
            Object obtained = runOrCatch(r.expr("a").sub(0.8),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #30");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #30:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/sub.yaml line #33
            /* err('ReqlQueryLogicError', 'Expected type NUMBER but found STRING.', [1]) */
            Err expected_ = err("ReqlQueryLogicError", "Expected type NUMBER but found STRING.", r.array(1L));
            /* r.expr(1).sub('a') */
            logger.info("About to run line #33: r.expr(1L).sub('a')");
            Object obtained = runOrCatch(r.expr(1L).sub("a"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #33");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #33:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
        
        {
            // math_logic/sub.yaml line #36
            /* err('ReqlQueryLogicError', 'Expected type NUMBER but found STRING.', [0]) */
            Err expected_ = err("ReqlQueryLogicError", "Expected type NUMBER but found STRING.", r.array(0L));
            /* r.expr('b').sub('a') */
            logger.info("About to run line #36: r.expr('b').sub('a')");
            Object obtained = runOrCatch(r.expr("b").sub("a"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #36");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #36:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
    }
}