package com.example.ooppratice.grade_calculator;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;
    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
        // (학점수 * 교과목 평점)의 합계
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();
        // 수강신청 총학점 수

        return totalMultipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
