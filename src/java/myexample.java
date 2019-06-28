
import java.sql.*;

public class myexample
{
    private int x;
    private String msg;
    public Connection con = null;
    public ResultSet rs = null;
    public Statement stm = null;
    String ConUrl= "jdbc:derby://localhost:1527/beanreg";
    
    public myexample()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=DriverManager.getConnection(ConUrl);
            
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            
        }
    }
    public void setmsg(String msg)
    {
        this.msg = msg;
    }
    public String getmsg()
    {
        return (this.msg);
    }
    public void insert()
    {
        try
        {
            String sql = "insert into untitled(name) value('"+msg+"')";
            stm = con.createStatement();
            stm.executeUpdate(sql);
            stm.close ();
        }
        catch(SQLException e)
        {
            System.out.println("Exception is ;"+e);
        }
    }
}