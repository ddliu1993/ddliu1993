package action;
import java.sql.*;
/*
 * 建立数据库连接返回connection
 */
public static final String QJToBJChange(String QJStr)      
{          
	char[] chr = QJStr.toCharArray();          
	String str = "";          
	for (int i = 0; i < chr.length; i++)          
	{              
		chr[i] = (char) ((int) chr[i] - 65248);              
		str += chr[i];          
	}          
	return str;      
}

public class DaoCon {
	public Connection GetConn() throws Exception{
		//数据库驱动
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_ddliu1993";//获取sae上的url
		String user = "02z0x333nn";
		String password = "wllikjmiz2m41k5xxy4hjk05lj4klyij1wyzz411";
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
}
