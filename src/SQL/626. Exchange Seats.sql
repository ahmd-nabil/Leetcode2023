SELECT
    CASE
        WHEN MOD(id, 2) = 1 AND id != (SELECT MAX(id) FROM seat) THEN id+1
        WHEN MOD(id, 2) = 0 THEN id - 1
        ELSE id
        END as id,
    student
FROM seat
ORDER BY id


SELECT
    CASE
        WHEN id = (SELECT MAX(id) FROM seat) AND MOD(id, 2) = 1 THEN id
        ELSE (id + 1) ^ 1 - 1
        END AS id,
    student
FROM seat
ORDER BY id