package patterns.singleton;

/**
 * This is the lazy initialization singleton class i.e. instance is created only when getInstance() is called. If you are sure
 * that this class will get called at least once then you can use the eager ways see other two classes in this package.
 * But the prefered way is the below lazy way.
 */
public class DateUtil {
    private static DateUtil dateUtil;

    private DateUtil(){}

    public static DateUtil getInstance(){
        if(dateUtil==null){
            dateUtil = new DateUtil();
        }
        return dateUtil;
    }
}
