package patterns.singleton;

/**
 * as synchronized is a heavy process it should be used only once here. So below is the optimized code.
 */
public class OptimizedSynchronizedDateUtil {
    private static volatile OptimizedSynchronizedDateUtil dateUtil;

    private OptimizedSynchronizedDateUtil ( ) {
    }

    public static synchronized OptimizedSynchronizedDateUtil getInstance ( ) {
        if ( dateUtil == null ) {
            synchronized ( SynchronizedDateUtil.class ) {
                if ( dateUtil == null ) {
                    dateUtil = new OptimizedSynchronizedDateUtil ( );
                }
            }
        }
        return dateUtil;
    }
}
