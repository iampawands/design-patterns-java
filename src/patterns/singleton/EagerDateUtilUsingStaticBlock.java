package patterns.singleton;

public class EagerDateUtilUsingStaticBlock {
    private static EagerDateUtilUsingStaticBlock dateUtil= new EagerDateUtilUsingStaticBlock();

    private EagerDateUtilUsingStaticBlock(){}

    public static EagerDateUtilUsingStaticBlock getInstance(){
        return dateUtil;
    }
}
