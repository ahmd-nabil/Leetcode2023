#NOT IN SOLUTION
SELECT
    customer_id,
    COUNT(*) AS count_no_trans
FROM visits
WHERE visit_id NOT IN (
    SELECT DISTINCT visit_id
    FROM transactions
)
GROUP BY customer_id
ORDER BY count_no_trans DESC


#JOIN SOLUTION
SELECT
    customer_id,
    COUNT(*) AS count_no_trans
FROM visits
         LEFT JOIN transactions USING(visit_id)
WHERE transaction_id IS NULL
GROUP BY customer_id

#NOT EXISTS SOLUTION
SELECT
    v.customer_id,
    COUNT(*) AS count_no_trans
FROM visits AS v
WHERE NOT EXISTS (
    SELECT t.visit_id
    FROM transactions AS t
    WHERE t.visit_id = v.visit_id
)
GROUP BY v.customer_id