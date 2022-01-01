package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * The type Read properties file.
 */
public class ReadPropertiesFile {

    private String url;
    private String user;
    private String password;

    /**
     * Read properties.
     *
     * @throws IOException the io exception
     */
    public void readProperties() throws IOException {

        FileInputStream fis = new FileInputStream("E:\\Java Projects\\ExpenseTracker\\src\\main\\java\\Resources\\DBConnection.properties");

        Properties prop = new Properties();

        prop.load(fis);

        this.url = prop.getProperty("url");
        this.user = prop.getProperty("user");
        this.password = prop.getProperty("password");

    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

}
