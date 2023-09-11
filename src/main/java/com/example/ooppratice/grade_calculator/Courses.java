package com.example.ooppratice.grade_calculator;

import java.util.List;
// 일급 콜렉션 : 콜렉션 형태로 된 정보를 1개만 가지는 인스턴스 변수의 클래스
public class Courses {
    public Courses(List<Course> courses) {
        this.courses = courses;
    }
    private final List<Course> courses;

    public double multiplyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();
        /*
        double multipliedCreditAndCourseGrade = 0;
        for (Course course : courses) {
            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
        }
        return multipliedCreditAndCourseGrade;
        */
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
