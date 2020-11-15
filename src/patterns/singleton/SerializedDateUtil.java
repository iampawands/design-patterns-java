package patterns.singleton;

import java.io.Serializable;

public class SerializedDateUtil implements Serializable,Cloneable {
    private static volatile SerializedDateUtil dateUtil;

    private SerializedDateUtil ( ) {
    }

    public static synchronized SerializedDateUtil getInstance ( ) {
        if ( dateUtil == null ) {
            synchronized ( SerializedDateUtil.class ) {
                if ( dateUtil == null ) {
                    dateUtil = new SerializedDateUtil ( );
                }
            }
        }
        return dateUtil;
    }

    protected Object readResolve(){
        return dateUtil;
    }

    @Override
    protected Object clone ( ) throws CloneNotSupportedException {
        throw new CloneNotSupportedException (  );
    }
}
