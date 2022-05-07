package com.tlz.springbootmicroservicecourse.repository;

import com.tlz.springbootmicroservicecourse.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
