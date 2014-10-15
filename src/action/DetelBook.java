package action;

import java.sql.Connection;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class DetelBook extends ActionSupport{
	private String title;
	private int i =0;
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private static String removeSameString(String str)      
	{          
		Set<String> mLinkedSet = new LinkedHashSet<String>();          
		String[] strArray = str.split(" ");          
		StringBuffer sb = new StringBuffer();            
		for (int i = 0; i < strArray.length; i++)          
		{              
			if (!mLinkedSet.contains(strArray[i]))              
			{                  
				mLinkedSet.add(strArray[i]);                  
				sb.append(strArray[i] + " ");              
			}          
		}          
		System.out.println(mLinkedSet);          
		return sb.toString().substring(0, sb.toString().length() - 1);      
	}
	//删除书籍主函数
	public void DetBook() throws Exception {
		DaoCon dao = new DaoCon();
		Connection con = dao.GetConn();
		Statement stmt = con.createStatement() ;
		String sql = "delete from book where title = '"+title+"'";
		stmt.executeUpdate(sql) ;
		setI(9);
		stmt.close();
        con.close();
	}
	public String execute(){
		try {
			DetBook();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
}
