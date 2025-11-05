public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model  = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Michael Johnson");
        System.out.println("\nAfter updating name via controller:\n");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        return new Student("10", "Robert Brown");
    }
}
