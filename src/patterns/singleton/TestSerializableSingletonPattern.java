package patterns.singleton;

import java.io.*;

public class TestSerializableSingletonPattern {
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        SerializedDateUtil dateUtil1 = SerializedDateUtil.getInstance ( );
        ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream (new File ("D:\\projects\\design-patterns\\SerializedFiles\\dateUtil.ser")));
        oos.writeObject (dateUtil1);
        ObjectInputStream ois = new ObjectInputStream (new FileInputStream (new File ("D:\\projects\\design-patterns\\SerializedFiles\\dateUtil.ser")));
        SerializedDateUtil dateUtil2 = (SerializedDateUtil) ois.readObject ( );
        oos.close ();
        ois.close ();
        System.out.println (dateUtil1 == dateUtil2);
    }
}
