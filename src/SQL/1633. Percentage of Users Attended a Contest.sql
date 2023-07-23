SELECT
    r.contest_id,
    ROUND(COUNT(r.user_id) / (SELECT COUNT(*) FROM Users) * 100, 2) AS percentage
FROM register AS r
         JOIN users AS u USING (user_id)
GROUP BY contest_id
ORDER BY percentage DESC, contest_id