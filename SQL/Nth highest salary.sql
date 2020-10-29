//https://leetcode.com/problems/nth-highest-salary/

CREATE FUNCTION getNthHighestSalary(@N INT) RETURNS INT AS
BEGIN
    RETURN (
        /* Write your T-SQL query statement below. */
        SELECT DISTINCT
            SALARY 
        FROM 
            EMPLOYEE 
        ORDER BY 
            SALARY DESC
        OFFSET @N-1 ROWS 
        FETCH FIRST 1 ROWS ONLY
    );
END
