public class Student {
    private String name;
    private String surname;
    private String spec;
    private int cource;
    private String group;

    public Student(String name, String surname, String spec, int cource, String group) {
        this.name = name;
        this.surname = surname;
        this.spec = spec;
        this.cource = cource;
        this.group = group;
    }

    public int getCource() {
        return cource;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public String getSpec() {
        return spec;
    }

    public String getSurname() {
        return surname;
    }

    public void setCource(int cource) {
        this.cource = cource;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
}
