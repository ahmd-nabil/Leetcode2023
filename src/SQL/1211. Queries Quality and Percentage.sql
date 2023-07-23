SELECT
    query_name,
    ROUND(AVG(rating / position), 2) AS quality,
    ROUND(SUM(IF(rating < 3, 1, 0)) / COUNT(query_name) * 100 ,2) AS poor_query_percentage
FROM queries
GROUP BY query_name

# using avg for both calculations
SELECT
    query_name,
    ROUND(AVG(rating / position), 2) AS quality,
    ROUND(AVG(rating < 3) * 100,2) AS poor_query_percentage
FROM queries
GROUP BY query_name

## since rating < 3 return 1 or 0 AVG would work as SUM(num of rating < 3) / count(all 1s and 0s)