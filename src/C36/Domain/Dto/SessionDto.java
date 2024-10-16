package C36.Domain.Dto;

public class SessionDto {

	private int sessionId;
	private String username;
	private String role;
	//디폴트생성자


	public SessionDto(int sessionId, String username, String role) {
		super();
		this.sessionId = sessionId;
		this.username = username;
		this.role = role;
	}
	public SessionDto() {
		super();
	}

	//getter , setter
	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}


	//toSTring


	@Override
	public String toString() {
		return "SessionDto [sessiosId=" + sessionId + ", username=" + username + ", role=" + role + "]";
	}


}
