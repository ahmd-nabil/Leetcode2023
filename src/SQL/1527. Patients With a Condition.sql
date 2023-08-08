SELECT
    *
FROM Patients
WHERE LOCATE('DIAB1', conditions) = 1 OR LOCATE(' DIAB1', conditions) != 0

SELECT
    *
FROM Patients
WHERE conditions LIKE '% DIAB1%' OR conditions LIKE 'DIAB1%'