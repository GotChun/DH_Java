package C36.Domain.Dao.ConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionPoolByHikari {

	private final int size = 10;	//커넥션 풀 크기를 변경하지 못하게 final로 선언
	private String url="jdbc:mysql://localhost:3306/bookdb";
	private String id="root";
	private String pw="1234";

	private HikariDataSource dataSource;

	//싱글톤 패턴
	private ConnectionPoolByHikari() {
		HikariConfig config = new HikariConfig();		//설정을 담는 히카리 객체
		config.setDriverClassName("com.mysql.cj.jdbc.Driver");
		config.setJdbcUrl(url);
		config.setUsername(id);
		config.setPassword(pw);
		//Size
		config.setMaximumPoolSize(size);  //pool 의 size 최대 크기 지정

		this.dataSource = new HikariDataSource(config);

	}
	private static ConnectionPoolByHikari instance;
	public static ConnectionPoolByHikari getInstance() {
		if(instance==null)
			instance = new ConnectionPoolByHikari();
		return instance;
	}

	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}


}
