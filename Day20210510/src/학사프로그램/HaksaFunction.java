package 학사프로그램;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HaksaFunction {
	
	public static void Regiser() {
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String, String>>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("----메뉴선택----."); 
		System.out.println("1.학생");
		System.out.println("2.교수");
		System.out.println("3.관리자");
		System.out.println("4.이전메뉴");
		int choice = scan.nextInt();

		 
			if (choice == 1) {
				HashMap<String, String> Haksamap = new HashMap<String, String>();

				String name = "";
				String age = "";
				String number = "";

				System.out.println("학생 등록");
				System.out.println("이름:");
				name = scan.next();
				System.out.println("나이:");
				age = scan.next();
				System.out.println("학번:");
				number = scan.next();

				Haksamap.put("name", name);
				Haksamap.put("age", age);
				Haksamap.put("number", number);
				Haksamap.put("gubun", "학생");
				haksaList.add(Haksamap);
				System.out.println("size:"+haksaList.size());
				System.out.println("등록이 되었습니다.");
				

			} else if (choice == 2) {
				HashMap<String, String> Haksamap = new HashMap<String, String>();

				String name = "";
				String age = "";
				String subject = "";
				String professor = "";

				System.out.println("교수 등록");
				System.out.println("이름:");
				name = scan.next();
				System.out.println("나이:");
				age = scan.next();
				System.out.println("과목:");
				subject = scan.next();

				Haksamap.put("name", name);
				Haksamap.put("age", age);
				Haksamap.put("subject", subject);
				Haksamap.put("gubun", "교수");
				haksaList.add(Haksamap);

				System.out.println("등록이 되었습니다.");

			} else if (choice == 3) {
				HashMap<String, String> Haksamap = new HashMap<String, String>();

				String name = "";
				String age = "";
				String team = "";
				String manager = "";

				System.out.println("관리자 등록");
				System.out.println("이름:");
				name = scan.next();
				System.out.println("나이:");
				age = scan.next();
				System.out.println("부서:");
				team = scan.next();

				Haksamap.put("name", name);
				Haksamap.put("age", age);
				Haksamap.put("team", team);
				Haksamap.put("gubun", "관리자");
				haksaList.add(Haksamap);

				System.out.println("등록이 되었습니다.");

			}
		

	}

	public static void Search() {
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String, String>>();
		Scanner scan = new Scanner(System.in);
		int choice = 0;

		if (choice == 2) {

			System.out.println("찾을 이름을 입력해주세요");
			System.out.print("이름:");
			String name = scan.next();

			String gubun = "";
			String irumSearch = "";

			for (int i = 0; i < haksaList.size(); i++) {

				HashMap<String, String> map = haksaList.get(i);
				irumSearch = map.get("name");
				gubun = map.get("gubun");

				if (gubun.equals("학생")) {

					if (name.equals(irumSearch)) {
						System.out.print("이름:" + map.get("name") + "\t");
						System.out.print("학번:" + map.get("number") + "\t");
						System.out.print("나이:" + map.get("age") + "\n");
					}
				} else if (gubun.equals("교수")) {

					if (name.equals(irumSearch)) {
						System.out.print("이름:" + map.get("name") + "\t");
						System.out.print("과목:" + map.get("subject") + "\t");
						System.out.print("나이:" + map.get("age") + "\n");
					}
				} else if (gubun.equals("manager")) {

					if (name.equals(irumSearch)) {
						System.out.print("이름:" + map.get("name") + "\t");
						System.out.print("과목:" + map.get("subject") + "\t");
						System.out.print("나이:" + map.get("age") + "\n");
					}
				}
			}
		}
	}

	public static void Delete() {
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String, String>>();
		Scanner scan = new Scanner(System.in);
		int choice = 0;

		if (choice == 3) {

			System.out.println("삭제할 이름을 입력해주세요.");
			System.out.print("이름:");
			String name = scan.next();
			for (int i = 0; i < haksaList.size(); i++) {
				HashMap<String, String> map = haksaList.get(i);
				String nameDelete = map.get("name");
				String gubun = map.get("gubun");
				if (gubun.equals("학생")) {
					if (name.equals(nameDelete)) {
						haksaList.remove(i);
						System.out.println(name + "학생이 삭제되었습니다.");

					}
				} else if (gubun.equals("교수")) {
					if (name.equals(nameDelete)) {
						haksaList.remove(i);
						System.out.println(name + "교수님이 삭제되었습니다.");

					}

				} else if (gubun.equals("관리자")) {
					if (name.equals(nameDelete)) {
						haksaList.remove(i);
						System.out.println(name + "관리자님이 삭제되었습니다.");

					}
				}
			}

		}

	}

	public static void Correct() {
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String, String>>();
		Scanner scan = new Scanner(System.in);
		int choice = 0;

		if (choice == 4) {
			System.out.println("수정 할 이름을 입력해 주세요.");
			System.out.print("이름:");
			String name = scan.next();
			for (int i = 0; i < haksaList.size(); i++) {
				HashMap<String, String> map = haksaList.get(i);
				String changename = map.get("name");
				String gubun = map.get("gubun");

				if (gubun.equals("학생")) {
					if (name.equals(changename)) {
						System.out.print("이름:" + map.get("name") + "\t");
						System.out.print("학번:" + map.get("number") + "\t");
						System.out.print("나이:" + map.get("age") + "\n");
						System.out.println("수정하기전 내용입니다. 수정을 할까요? y/n");
						String select = scan.next();
						if (select.equals("Y") || select.equals("y")) {
							HashMap<String, String> Haksamap = new HashMap<String, String>();

							System.out.println("이름:");
							name = scan.next();
							System.out.println("나이:");
							String age = scan.next();
							System.out.println("학번:");
							String number = scan.next();

							Haksamap.put("name", name);
							Haksamap.put("age", age);
							Haksamap.put("number", number);
							Haksamap.put("gubun", "학생");
							haksaList.set(i, Haksamap);

							System.out.println("수정이 되었습니다.");
						} else {
							continue;
						}

					}
				} else if (gubun.equals("교수")) {
					if (name.equals(changename)) {
						System.out.print("이름:" + map.get("name") + "\t");
						System.out.print("과목:" + map.get("subject") + "\t");
						System.out.print("나이:" + map.get("age") + "\n");
						System.out.println("수정하기전 내용입니다. 수정을 할까요? y/n");
						String select = scan.next();
						if (select.equals("Y") || select.equals("y")) {
							HashMap<String, String> Haksamap = new HashMap<String, String>();

							System.out.println("이름:");
							name = scan.next();
							System.out.println("나이:");
							String age = scan.next();
							System.out.println("학번:");
							String subject = scan.next();

							Haksamap.put("name", name);
							Haksamap.put("subject", subject);
							Haksamap.put("age", age);
							Haksamap.put("gubun", "교수");
							haksaList.set(i, Haksamap);

							System.out.println("수정이 되었습니다.");
						} else {
							continue;
						}

					}

				}
			}

		}
	}
	public static void print() {
		ArrayList<HashMap<String, String>> haksaList = new ArrayList<HashMap<String, String>>();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		 
			System.out.println("전체출력");

			for (int i = 0; i < haksaList.size(); i++) {
				HashMap<String, String> str = haksaList.get(i);

				
				String gubun=str.get("gubun");
				if(gubun.equals("학생")) {
					System.out.print("이름:"+str.get("name")+"\t");
					System.out.print("나이:"+str.get("age")+"\t");
					System.out.print("학번:"+str.get("number")+"\t");
				}else if(gubun.equals("교수")) {
					System.out.print("이름:"+str.get("name")+"\t");
					System.out.print("나이:"+str.get("age")+"\t");
					System.out.println("과목:"+str.get("subject"));
					
				}else if(gubun.equals("관리자")) {
					System.out.print("이름:"+str.get("name")+"\t");
					System.out.print("나이:"+str.get("age")+"\t");
					System.out.println("소속:"+str.get("team"));
				}
			}

		
	}
	

}
