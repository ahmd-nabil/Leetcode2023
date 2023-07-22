# Write your MySQL query statement below
SELECT
    signups.user_id,
    ROUND(AVG(IF(c.action='confirmed', 1, 0)), 2) as confirmation_rate
FROM signups
         LEFT JOIN confirmations AS c USING(user_id)
GROUP BY signups.user_id