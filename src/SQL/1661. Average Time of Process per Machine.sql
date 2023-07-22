#avg * 2 solutions (because AVG treates (end and start) as two inputs
SELECT
    machine_id,
    ROUND(AVG(IF(activity_type = 'end', timestamp, -timestamp)) * 2, 3) AS processing_time
FROM activity
GROUP BY machine_id

#self join
SELECT
    a1.machine_id,
    ROUND(AVG(a2.timestamp - a1.timestamp), 3) AS processing_time
FROM activity AS a1
JOIN activity AS a2 ON
a1.machine_id = a2.machine_id AND
a1.process_id = a2.process_id AND
a1.activity_type = 'start' AND
a2.activity_type = 'end'
GROUP BY a1.machine_id
