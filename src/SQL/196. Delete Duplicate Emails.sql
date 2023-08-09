DELETE p1 FROM Person p1, Person p2 WHERE p1.email = p2.email AND p1.id > p2.id;


-- IDK why this is not working
-- DELETE FROM Person
-- WHERE id IN (
--     SELECT
--         p1.id
--     FROM Person p1
--              JOIN Person p2
--                   ON p1.email = p2.email AND p1.id > p2.id
-- )