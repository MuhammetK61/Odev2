package KodlamaOdevi;

public class Main {

	public static void main(String[] args) {
		
		
		User user = new User();
		user.setFirstname("Hasan");
		user.setLastname("Hüseyin");
		user.setUsername("ArsızBela :D");
		
		Student student = new Student();
		student.setFirstname("Ahmet");
		student.setLastname("Mehmet");
		student.setGrade("B+");
		
		
		
		Instruction instruction = new Instruction();
		instruction.setFirstname("Ali");
		instruction.setLastname("Veli");
		instruction.setBranch("Matematik");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		InstructionManager instructionManager = new InstructionManager();
		instructionManager.add(instruction);
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		

	}

}
