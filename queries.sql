--Part 1
--Found two options; both show the information from all columns, including field, data type, etc.
--SHOW COLUMNS FROM job;
--DESCRIBE job;

--Part 2
--SELECT name FROM employer WHERE location = "St. Louis City";

--Part 3
--DROP TABLE job;

--Part 4
--SELECT * FROM skill INNER JOIN job_skills ON skill.id = job_skills.skills_id WHERE job_skills.jobs_id IS NOT NULL ORDER BY name ASC;