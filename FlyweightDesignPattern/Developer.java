package FlyweightDesignPattern;

public class Developer implements Employees{
	private final String JOB;
    private String skill;
	
	public Developer() {
		JOB="Fix the issue";
	}
    
	@Override
	public void assignSkill(String skill) {
		this.skill=skill;
		
	}

	@Override
	public void task() {
        System.out.println("Developer with Skill: "+this.skill+"with Job: "+ JOB);		
	}

}
