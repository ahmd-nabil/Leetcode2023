SELECT
    id, SUM(friends) AS num
FROM (
    SELECT requester_id AS id FROM RequestAccepted
    UNION ALL
    SELECT accepter_id AS id FROM RequestAccepted
) AS users
GROUP BY id
order by num DESC
LIMIT 1