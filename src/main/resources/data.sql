DROP TABLE IF EXISTS TO_DO_LIST;

CREATE TABLE TO_DO_LIST(
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(250) NOT NULL,
    description VARCHAR(250) NOT NULL,
    start_date VARCHAR(250) NOT NULL
);
INSERT INTO TO_DO_LIST(title,description,start_date) VALUES
    ('day 1','It is day 1', '2021-08-02'),
    ('day 2','It is day 2', '2021-08-02'),
    ('day 3','It is day 3', '2021-08-02');
