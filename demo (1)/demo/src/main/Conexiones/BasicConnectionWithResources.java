public class BasicConnectionWithResources {
    public static void main(String[] args)
    {
     String url = "jdbc:mysql://localhost:3306/users?serverTimezone=America/Bogota";
     String username = "santiago";
     String password = "Santiagocontraseña01";
     String sql = "SELECT * FROM Users";
     try (Connection conn =
    DriverManager.getConnection(url,
    username, password);
     Statement stmt =
    conn.createStatement();
     ResultSet rs =
    stmt.executeQuery(sql)) {
     while (rs.next()) {
    
    System.out.println(rs.getString("user_firstname"));
    
    System.out.println(rs.getString("user_lastname"));
     }
     } catch (SQLException e) {
     e.printStackTrace();
     } // end try-catch
     } // main
    } // BasicConnectionWithResources


    
