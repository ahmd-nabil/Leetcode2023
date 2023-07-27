(
    SELECT name AS results
    FROM MovieRating
             JOIN Users USING(user_id)
    GROUP BY user_id
    ORDER BY COUNT(rating) DESC, name LIMIT 1
)
UNION ALL
(
    SELECT title
    FROM MovieRating
             JOIN Movies USING(movie_id)
    WHERE SUBSTR(created_at,1,7)="2020-02"
    GROUP BY movie_id
    ORDER BY AVG(rating) DESC, title LIMIT 1
)