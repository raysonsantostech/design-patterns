package designpatterns.criacionais.singleton;

public class Cliente {
    public static void main(String[] args) {

        MySql dataBase1 = MySql.getInstance();
        String query = "SELECT * FROM public.usuario;";
        System.out.println("Data Base 01: " + dataBase1.toString());
        dataBase1.executeQuery(query);


        MySql dataBase2 = MySql.getInstance();
        System.out.println("Data Base 02: " + dataBase2.toString());
        dataBase2.executeQuery(query);

    }
}
