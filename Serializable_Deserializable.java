import java.io.Serializable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;
class Atm implements Serializable
{
    String name;
    int Accno,pin;
    public Atm(String name,int Accno,int pin)
    {
        super();
        this.name=name;
        this.Accno=Accno;
        this.pin=pin;
    }
    @Override
    public String toString(){
        return name+"-"+Accno+"-"+pin;
    }
}

public class Serializable_Deserializable {
    public static void main(String args[])throws Exception
    {
        File my_file = new File("D://bca.txt");
        my_file.createNewFile();
        FileOutputStream fout=new FileOutputStream(my_file);
        ObjectOutputStream objout=new ObjectOutputStream(fout);
        objout.writeObject(new Atm("Suneel",1234,2314));
        objout.close();
        FileInputStream fin=new FileInputStream(my_file);
        ObjectInputStream objin=new ObjectInputStream(fin);
        Object Account=objin.readObject();
        System.out.println(Account);
        objin.close();
        System.out.println("success");
    }
}
