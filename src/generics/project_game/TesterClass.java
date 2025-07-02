package generics.project_game;

public class TesterClass{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", 21);
        Employee employee2 = new Employee("Ivan", 21);

        Student student1 = new Student("Vlad", 23);
        Student student2 = new Student("Ira", 22);

        Team<Student> stundentsTeam = new Team<>("Igriii1");
        stundentsTeam.addParticipant(student1);

        Team<Student> stundentsTeam1 = new Team<>("Igriii2");
        stundentsTeam1.addParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("EmployeeTeam");
        employeeTeam.addParticipant(employee1);
        employeeTeam.addParticipant(employee2);

        stundentsTeam.playGame(stundentsTeam1);
//        stundentsTeam.playGame(employeeTeam);
//  Will be error, because we used generics and permitted to play only with team who hase the same class
    }
}
