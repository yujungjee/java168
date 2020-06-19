package one;

import java.util.Scanner;
/* 
 * RFP(요구사항) - 기능정의
 * Peroson(id, password, name: String)
 * 	- Student(ssn: String, score:int),
 * 	- Admin(rank: int)
 * 
 * <사용자기능> Student
 * 1. 회원가입
 * 2. 로그인
 * 3. 비번 수정
 * 4. 회원탈퇴
 * 5. 아이디 존재 체크
 * 6. 마이페이지
 * 7. 점수 입력
 * **********
 * <관리자기능> Admin
 * 1. 회원목록
 * 2. 아이디검색
 * 3. 이름검색
 * 4. 전체 회원수
 * 5. 성적별 현황 (스코어를 기준 이름 내림차순 예.. 1등 이순신(남) 98점, 2등 김유신(남) 85점...)
 */
class Constants {
	public static final String Man_MENU = "0. 시스템종료 1. 학생 2. 관리자";
	public static final String STUDENT_MENU = "0. 학생화면 종료\n" +
			"1. 회원가입\n" +
			"2. 로그인\n" +
			"3. 비번 수정\n" +
			"4. 회원탈퇴\n" +
			"5. 아이디 존재 체크\n" +
			"6. 마이페이지\n" +
			"7. 점수 입력";
	public static final String ADMIN_MENU = "0. 관리자화면 종료\n" +
			"1. 회원목록\n" +
			"2. 아이디검색\n" +
			"3. 이름검색\n" +
			"4. 전체 회원수\n" +
			"5. 성적별 현황";
	public static final String PERSON_SPEC = "아이디: %s 비번: %s 이름: %s";
	public static final String STUDENT_SPEC = "아이디: %s 비번: %s 이름(%s): 주민번호(%s) %s 점수: %d";
	public static final String ADMIN_SPEC = "관리자 아이디: %s 비번: %s 이름: %s 등급: %d";
}
class Person {
	protected String id, pass, name;

	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getPass() {return pass;}
	public void setPass(String pass) {this.pass = pass;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	@Override
	public String toString() {
		return String.format(Constants.PERSON_SPEC, id, pass, name);
	}
}

class Student extends Person {
	private String ssn, gender; private int score;

	public String getSsn() {return ssn;}
	public void setSsn(String ssn) {this.ssn = ssn;}
	public int getScore() {return score;}
	public void setScore(int score) {this.score = score;}
	public String getGender() {return gender;}
	public void setGender(String gender) {this.gender = gender;}
	@Override
	public String toString() {
		return String.format(Constants.STUDENT_SPEC, id, pass, name, ssn, gender, score);
	}
}
class Admin extends Person {
	private int rank;

	public int getRank() {return rank;}
	public void setRank(int rank) {this.rank = rank;}
	@Override
	public String toString() {
		return String.format(Constants.ADMIN_SPEC, id, pass, name, rank);
	}

}
interface PersonService {
	/** 1. 회원가입 */
	public void join(Student student);
	/** 2. 로그인 */
	public String login(Student student);
	/** 3. 비번 수정 */
	public void changePass();
	/** 4. 회원탈퇴 */
	public void remove();
	/** 5. 아이디 존재 체크 */
	public void existId();
	/** 6. 마이페이지 */
	public void mypage();
	/** 7. 점수 입력 */
	public void score();
	/** 1. 회원목록 */
	public void studentList();
	/** 2. 아이디검색 */
	public void idSearch();
	/** 3. 이름검색 */
	public void nameSearch();
	/** 4. 전체 회원수 */
	public void studentCount();
	/** 5. 성적별 현황 */
	public void gradeRank();
}
class PersonServiceImpl implements PersonService {
	private Student[] students;
	private int count;

	public PersonServiceImpl() {
		students = new Student[3];
		count = 0;
	}
	@Override
	public void join(Student student) {
		/** 1. 회원가입 */
		students[count] = student;
		count++;
	}
	@Override
	public String login(Student student) {
		/** 2. 로그인 */
		String result = "로그인 실패";
		for(int i = 0; i < students.length; i++) {
			if(student.getId().equals(students[i].getId())
					&&
					student.getPass().equals(students[i].getPass())) {
				result = "로그인 성공";
				break;
			}
		}
		return result;
	}
	@Override
	public void changePass() {
		/** 3. 비번 수정 */
		for(int i = 0; i < students.length; i++) {
		}
	}
	@Override
	public void remove() {
		/**4. 회원탈퇴 */
		for(int i = 0; i < students.length; i++) {
			
		}
	}
	@Override
	public void existId() {
		/** 5. 아이디 존재 체크 */
		String result = "사용 가능한 아이디";
		for(int i = 0; i < students.length; i++) {
			if(id.equls(students[i].getId())) {
				result = "이미 존재하는 아이디";
				break;
			}
			
		}
		return result;
	}
	@Override
	public void mypage() {
		/** 6. 마이페이지 */
		for(int i = 0; i < students.length; i++) {
	}
	}
	@Override
	public void score() {
		/** 7. 점수 입력 */

	}

	@Override
	public void studentList() {
		/** 8. 회원목록 */ 

	}

	@Override
	public void idSearch() {
		/** 9. 아이디검색 */ 
		for(int i= 0; i < students.length; i++) {

		}
	}

	@Override
	public void nameSearch() {
		/** 10. 이름검색  */
		for(int i= 0; i < students.length; i++) {

		}
	}

	@Override
	public void studentCount() {
		/** 11. 전체 회원수 */ 

	}

	@Override
	public void gradeRank() {
		/** 12. 성적별 현황 */
		for(int i= 0; i < students.length; i++) {
		}
	}
}
	public class PersonApp {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			PersonService service = new PersonServiceImpl();
			Student student = null;
			Admin admin = null;
			while(true) {
				System.out.println(Constants.Man_MENU);
				switch(scan.nextInt()) {
				case 0: return;
				case 1: student(scan, student, service);  break;
				case 2: admin(scan, admin, service); break;
				default: System.out.println("1.학생 2.관리자 선택해주세요.");
				break;
				}
			}
		}
		public static void student(Scanner scan, Student student, PersonService service) {
			System.out.println(Constants.STUDENT_MENU);
			String[] id = {"kim", "you", "lee"};
			String[] pass = {"1", "1", "1"};
			String[] name = {"김유신","유관순","이순신"};
			String[] ssn = {"900101-1", "900501-2","900801-1"};
			String result = "";
			switch (scan.nextInt()) {
			case 0: return;
			case 1: /** 1. 회원가입 */
				for(int i = 0; i < id.length; i++) {
					student = new Student();
					student.setId("");
					student.setPass("");
					student.setName(name[i]);
					student.setSsn(ssn[i]);
					service.join(student);
				}
					break;
			case 2: /** 2. 로그인  */ 
				student = new Student();
				student.setId(id[0]);
				student.setPass("1");
				result = service.login(student); 
				System.out.println(result);
				
				break;
			case 3: /** 3. 비번 수정  */
				student = new Student();
				student.setId(id[2]);
				student.setPass("2");
				service.changePass(student);
				break;
			case 4: /** 4. 회원탈퇴  */
				student.setId(id[0]);
				student.setPass("1");
				service.remove(student);
				break;
			case 5: /** 5. 아이디 존재 체크 */ 
				System.out.println(service.existId("kim"));
				break;
			case 6: /** 6. 마이페이지 */ 
				System.out.println(service.mypage("kim"));
				break;
			case 7: /** 7. 점수 입력 */
				
				service.score(); break;
			default:
				break;
			}
		}
		public static void admin(Scanner scan, Admin admin, PersonService service) {
			System.out.println(Constants.ADMIN_MENU);
			switch (scan.nextInt()) {
			case 0:	return;
			case 1: service.studentList(); break;
			case 2:	service.idSearch(); break;
			case 3:	service.nameSearch(); break;
			case 4:	service.studentCount(); break;
			case 5:	service.gradeRank(); break;
			default:
				break;
			}
		}
	}


