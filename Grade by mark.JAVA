public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int mark;
		System.out.print("ENTER A MARK= ");
		mark=scanner.nextInt();
		if(mark>=90) {
			System.out.print("GRADE = \"A\"");
		}
		else if(mark>=80) {
			System.out.print("GRADE = \"B\"");
		}
		else if(mark>=70) {
			System.out.print("GRADE = \"c\"");
		}
		else if(mark>=60) {
			System.out.print("GRADE = \"D\"");
		}
		else{
			System.out.println("E");
		}
	}
