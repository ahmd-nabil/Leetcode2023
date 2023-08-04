-- IF sum of any two sides > the third THEN triangle

SELECT
    x, y, z,
    IF (x + y > z AND x + z > y AND y + z > x, 'Yes', 'No') AS triangle
FROM Triangle;

/*
    * IF smallest + second_smallest > greatest THEN triangle
    * IF smallest + second_smallest + greatest > 2 * greatest THEN triangle
    * IF x + y + z > 2 * greatest
*/
SELECT
    *,
    IF (2 * GREATEST(x,y,z) < x+y+z, 'Yes', 'No') AS triangle
FROM Triangle;