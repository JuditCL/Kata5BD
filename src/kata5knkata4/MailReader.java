/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5knkata4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class MailReader {
    public static ArrayList <String> read() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection cn = DriverManager.getConnection("jdbc:sqlite:People");
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT Email from Mail");
        ArrayList<String> mailList = new ArrayList<>();
        while(rs.next()){
            String mail = rs.getString("Email");
            if(!mail.contains("@")) continue;
            mailList.add(mail);
        }
        rs.close();
        st.close();
        cn.close();
        return mailList;
        
    }
    
}