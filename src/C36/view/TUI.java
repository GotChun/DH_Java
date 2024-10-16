package C36.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import C36.Controller.FrontController;
import C36.Domain.Dto.UserDto;

public class TUI {

	private String sid; // SessionId
	private String id; // UserId
	private String role;
	private Scanner sc = new Scanner(System.in);

	private FrontController controller;

	TUI() throws Exception {
		controller = new FrontController();
	}

	public void MainMenu() {

		while (true) {
			System.out.println("--------------------------");
			System.out.println("MAIN");
			System.out.println("--------------------------");
			System.out.println("1 도서조회");
			System.out.println("2 로그인");
			System.out.println("3 회원가입");
			System.out.println("4 종료");
			System.out.print("번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				break;
			case 2:
				loginMenu();
				break;
			case 3:
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(-1);
			}
		}

	}

	public void loginMenu() {
		System.out.println("--------------------------");
		System.out.println("로그인");
		System.out.println("--------------------------");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();


		//로그인 요청
		Map<String , Object> params = new HashMap();
		params.put("endPoint", "/user");
		params.put("serviceNo", 6);
		params.put("userDto", new UserDto(id,pw,"",false));
		params.put("sessionId", sessionId);
		controller.execute(params);
		Map<String,Object> response = controller.execute(params);
//		for(String key : response.keySet())
//			System.out.println(key +" : " + response.get(key));
		this.sid = (Integer)response.get("sessionId");
		this.role = (String)response.get("role");
		if("Role_User".equals(this.role)) {
			회원Menu();
		}else if("Role_Member".equals(this.role)) {
			사서Menu();
		}



	}

	public void 사서Menu() {
		while (true) {
			System.out.println("--------------------------");
			System.out.println("사서메뉴");
			System.out.println("--------------------------");
			System.out.println("[도서]			[회원]			[대여]");
			System.out.println("1 도서조회하기		5 회원 전체조회		7 도서 대여");
			System.out.println("2 도서추가하기		6 회원 단건조회		8 도서 반납");
			System.out.println("3 도서수정하기		 						");
			System.out.println("4 도서삭제하기								");
			System.out.println("9 이전으로");
			System.out.println("10로그아웃");
			System.out.print("번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:


				break;
			case 2:


				break;
			case 3:
				break;

			case 7:

				break;

			case 10:

				// 로그아웃
				return;
			}

		}
	}

	public void 회원Menu() {
		while (true) {
			System.out.println("--------------------------");
			System.out.println("회원메뉴");
			System.out.println("--------------------------");
			System.out.println("[도서]			[회원]			[대여]");
			System.out.println("1 도서조회하기		5 나의 정보조회		8 대여 도서 조회");
			System.out.println("2 도서추가하기		6 나의 정보수정		9 대여 도서 예약");
			System.out.println("3 도서수정하기		7 회원 탈퇴					");
			System.out.println("4 도서삭제하기									");

			System.out.println("10 이전으로");
			System.out.println("11 로그아웃");
			System.out.print("번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;

			case 5:
				return;

			}
		}
	}

	public void BookMenu() {
		System.out.println("--------------------------");
		System.out.println("도서 정보 입력");
		System.out.println("--------------------------");
		System.out.printf("도서코드 도서명 출판사 ISBN순으로 입력 : ");
		int bookcode = sc.nextInt();
		String bookname = sc.next();
		String publisher = sc.next();
		String isbn = sc.next();

		// 컨트롤러 호출!

	}

	public void MemberMenu() {
		System.out.println("--------------------------");
		System.out.println("회원 정보 입력");
		System.out.println("--------------------------");
		System.out.printf("ID PW USERNAME ROLE 순으로 입력 : ");
		String id = sc.next();
		String pw = sc.next();
		String username = sc.next();
		String role = sc.next();

	}

	public void LendMenu() {
		System.out.println("--------------------------");
		System.out.println("대여 정보 입력");
		System.out.println("--------------------------");

		System.out.printf("BOOKCODE USERID 입력 : ");
		int bookcode = sc.nextInt();
		String id = sc.next();

	}

}