package com.tlz.springbootmicroservicecourse.service;

import com.tlz.springbootmicroservicecourse.model.Course;

import java.util.List;

public interface CourseService {
    Course saveCourse(Course course);

    void deleteCourse(Long courseId);

    List<Course> findAllCourses();
}
