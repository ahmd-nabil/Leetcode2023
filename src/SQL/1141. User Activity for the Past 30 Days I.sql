SELECT
    activity_date AS day,
    COUNT(DISTINCT user_id) AS active_users
FROM activity
GROUP BY day
HAVING day BETWEEN DATE_SUB("2019-07-27", INTERVAL 29 DAY) AND DATE("2019-07-27")
##interval of 29Days because between is inclusing (we need 30 days including last day)