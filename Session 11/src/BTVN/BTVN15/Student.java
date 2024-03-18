package BTVN.BTVN15;

public class Student {
    Integer studenID;
    String name;
    Double overScore;

    public Student() {
    }

    public Student(Integer studenID, String name, Double overScore) {
        this.studenID = studenID;
        this.name = name;
        this.overScore = overScore;
    }

    public Integer getStudenID() {
        return studenID;
    }

    public void setStudenID(Integer studenID) {
        this.studenID = studenID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getOverScore() {
        return overScore;
    }

    public void setOverScore(Double overScore) {
        this.overScore = overScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studenID=" + studenID +
                ", name='" + name + '\'' +
                ", overScore=" + overScore +
                '}';
    }
}
