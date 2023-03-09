package designpatterns.criacionais.singleton;

public class MySql implements Conexao {

    private String host;
    private String user;
    private String password;

    private static MySql mySqlInstance;

    private MySql() {
        this.host = "mysql:host=localhost;dbname=db_name";
        this.user = "username";
        this.password = "password";
    }

    public String getHost() {
        return host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }
    
    public String getUser() {
        return user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public static MySql getInstance() {
        if(mySqlInstance == null) {
            mySqlInstance = new MySql();
        }

        return mySqlInstance;
    }

    public void executeQuery(String query) {
        System.out.println(query);
        System.out.println("Query executada com sucesso");
        System.out.println();
    }

    @Override
    public String toString() {
        return "MySql [host=" + host + ", user=" + user + ", password=" + password + "]";
    }

    

}
