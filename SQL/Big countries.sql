//https://leetcode.com/problems/big-countries/

//Or
SELECT 
    name, population, area
FROM 
    World
WHERE 
    area > 3000000 OR population > 25000000
;

//Union
SELECT 
    name, population, area
FROM 
    World
WHERE 
    area > 3000000 
    
UNION

SELECT 
    name, population, area
FROM 
    World
WHERE 
    population > 25000000 
;
