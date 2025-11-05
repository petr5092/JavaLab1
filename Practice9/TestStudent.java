public class TestStudent {
    private Student[] students;

    public TestStudent(Student[] students) {
        this.students = students;
    }

    public int[] sorted(int[] iDNumber){
        int[] sortedArray = iDNumber.clone();
        for (int i = 1; i < sortedArray.length; i++) {
            int key = sortedArray[i];
            int j = i - 1;
            while (j >= 0 && sortedArray[j] > key) {
                sortedArray[j + 1] = sortedArray[j];
                j--;
            }
            sortedArray[j + 1] = key;
        }
        return sortedArray;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
