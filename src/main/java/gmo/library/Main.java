package gmo.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args)/* throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException*/ {
        /*Driver mysqlDriver = (Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
        DriverManager.registerDriver(mysqlDriver);

        StringBuilder url = new StringBuilder();
        url.append("jdbc");*/
        SpringApplication.run(Main.class, args);
    }
}
