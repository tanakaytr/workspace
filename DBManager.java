public class DBManager{
	private static DBManager dbmanager;
	private String connection;
	
	private DBManager() {
		System.out.println("DBに接続しました");
        this.connection = "接続中…";
	}
	public static DBManager getInstance() {
		if(DBManager.dbmanager == null) {
            DBManager.dbmanager = new DBManager();
        }
        return DBManager.dbmanager;
	}
	public String getConnection() {
		return this.connection;
	}
}