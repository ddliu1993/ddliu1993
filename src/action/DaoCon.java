package action;
import java.sql.*;
/*
 * �������ݿ����ӷ���connection
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
		//���ݿ�����
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_ddliu1993";//��ȡsae�ϵ�url
		String user = "02z0x333nn";
		String password = "wllikjmiz2m41k5xxy4hjk05lj4klyij1wyzz411";
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
}
