SELECT
    ROUND(SUM(tiv_2016), 2) AS tiv_2016
FROM Insurance
WHERE (lat, lon)
          NOT IN
              (
                  SELECT lat, lon
                  FROM Insurance
                  GROUP BY lat, lon
                  HAVING COUNT(*) > 1
              )
AND tiv_2015 IN
            (SELECT tiv_2015 FROM Insurance GROUP BY tiv_2015 HAVING COUNT(tiv_2015) > 1)

-- EXISTS and NOT EXISTS
SELECT
    ROUND(SUM(tiv_2016), 2) AS tiv_2016
FROM Insurance i1
WHERE
    NOT EXISTS (
        SELECT pid, tiv_2016
        FROM Insurance i2
        WHERE i2.pid != i1.pid AND i2.lat = i1.lat AND i2.lon = i1.lon
    )
AND
    EXISTS (SELECT tiv_2015 FROM Insurance i3 WHERE i1.tiv_2015 = i3.tiv_2015 GROUP BY i3.tiv_2015 HAVING COUNT(i3.tiv_2015) > 1)

-- IN AND NOT IN
SELECT
    ROUND(SUM(tiv_2016), 2) AS tiv_2016
FROM Insurance
WHERE (lat, lon) NOT IN
      (
          SELECT lat, lon
          FROM Insurance
          GROUP BY lat, lon
          HAVING COUNT(*) > 1
      )
AND tiv_2015 IN
      (SELECT tiv_2015 FROM Insurance GROUP BY tiv_2015 HAVING COUNT(tiv_2015) > 1)