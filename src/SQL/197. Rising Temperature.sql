SELECT today.id
FROM Weather today
         JOIN Weather yesterday
WHERE DATE_ADD(yesterday.recordDate, INTERVAL 1 DAY) = today.recordDate
  AND today.temperature > yesterday.temperature