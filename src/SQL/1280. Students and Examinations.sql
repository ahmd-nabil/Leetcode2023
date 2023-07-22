SELECT
    stu.student_id,
    stu.student_name,
    sub.subject_name,
    count(exa.subject_name) AS attended_exams
FROM students stu
         JOIN subjects sub
         LEFT JOIN examinations exa
                   ON stu.student_id = exa.student_id AND
                      sub.subject_name = exa.subject_name
GROUP BY student_id, student_name, subject_name
ORDER BY student_id, subject_name