package patterns.singleton.assignment;
public class Logger implements Cloneable{
    private static volatile Logger logger;
    private Logger(){}
    public static Logger getInstance(){
        if(logger==null){
            synchronized ( Logger.class ){
                if(logger==null){
                    logger = new Logger ();
                }
            }
        }
        return logger;
    }

    public void log(String str){
        System.out.println (str);
    }

    @Override
    protected Object clone ( ) throws CloneNotSupportedException {
        throw new CloneNotSupportedException (  );
    }
}
