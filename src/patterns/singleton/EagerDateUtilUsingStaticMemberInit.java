package patterns.singleton;

public class EagerDateUtilUsingStaticMemberInit {
    private static EagerDateUtilUsingStaticMemberInit dateUtil;
    static
    {
        dateUtil = new EagerDateUtilUsingStaticMemberInit();
    }

    private EagerDateUtilUsingStaticMemberInit(){}

    public static EagerDateUtilUsingStaticMemberInit getInstance(){
       return dateUtil;
    }
}
