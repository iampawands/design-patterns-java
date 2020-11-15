package patterns.singleton;

public class SynchronizedDateUtil {
    private static SynchronizedDateUtil dateUtil;
        private SynchronizedDateUtil (){}

    public static synchronized SynchronizedDateUtil getInstance(){
        if(dateUtil==null){
            dateUtil = new SynchronizedDateUtil ();
        }
        return dateUtil;
    }

    /*
        other way of doing above synchronization.
        public static synchronized SynchronizedDateUtil getInstance(){
          synchronized(SynchronizedDateUtil.class){
            if(dateUtil==null){
            dateUtil = new SynchronizedDateUtil();
            }
          }
        return dateUtil;
          }
     */
}
