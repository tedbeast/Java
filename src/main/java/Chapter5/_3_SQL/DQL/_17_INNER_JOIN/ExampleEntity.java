package Chapter5._3_SQL.DQL._17_INNER_JOIN;

import java.util.Objects;

public class ExampleEntity {
    private String topic;
    private String teacher;
    private String student;
    private String textbook;

    public ExampleEntity(String topic, String teacher, String student, String textbook) {
        this.topic = topic;
        this.teacher = teacher;
        this.student = student;
        this.textbook = textbook;
    }

    public ExampleEntity() {
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getTextbook() {
        return textbook;
    }

    public void setTextbook(String textbook) {
        this.textbook = textbook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExampleEntity that = (ExampleEntity) o;
        return Objects.equals(topic, that.topic) && Objects.equals(teacher, that.teacher) && Objects.equals(student, that.student) && Objects.equals(textbook, that.textbook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, teacher, student, textbook);
    }

    @Override
    public String toString() {
        return "ExampleEntity{" +
                "topic='" + topic + '\'' +
                ", teacher='" + teacher + '\'' +
                ", student='" + student + '\'' +
                ", textbook='" + textbook + '\'' +
                '}';
    }
}
