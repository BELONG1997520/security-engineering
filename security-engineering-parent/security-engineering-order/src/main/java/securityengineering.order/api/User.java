package securityengineering.order.api;

public class User {
    private static int id;
    private  static String login_name;
    private  static String password;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

    public static String getLogin_name() {
        return login_name;
    }

    public static void setLogin_name(String login_name) {
        User.login_name = login_name;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        User.password = password;
    }
}
