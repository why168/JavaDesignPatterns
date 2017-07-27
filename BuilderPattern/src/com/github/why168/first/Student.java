package com.github.why168.first;

/**
 * @author Edwin.Wu
 * @version 2016/12/20 16:46
 * @since JDK1.8
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private String classroom;


    private Student(Builder builder) {
        id = builder.id;
        name = builder.name;
        age = builder.age;
        classroom = builder.classroom;
    }

    public int getdI() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public static class Builder {
        private int id;
        private String name;
        private int age;
        private String classroom;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setClassroom(String classroom) {
            this.classroom = classroom;
            return this;
        }
        public Student build() { // 构建，返回一个新对象
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classroom='" + classroom + '\'' +
                '}';
    }
}
