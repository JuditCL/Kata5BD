package kata5knkata4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

public class Kata4V3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String from = "C:\\Users\\usuario\\Desktop\\T2 Abstraccion y polimorfismo.pdf";
        String to = "C:\\Users\\usuario\\Desktop\\T2 Abstraccion y polimorfismo(1).pdf";
        InputStream input = new BufferedInputStream(new FileInputStream(from));
        OutputStream output = new BufferedOutputStream(new FileOutputStream(to));
        byte [] buffer = new byte[1024];
        Date ini = new Date();
        while(true){
            int read = input.read(buffer);
            if(read < 0)break;
            output.write(buffer);
        }
        System.out.println(new Date().getTime() - ini.getTime() );
        input.close();
        output.flush();
        output.close();
    }
}
