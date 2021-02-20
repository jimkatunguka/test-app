DROP TABLE IF EXISTS WIDGETS;

CREATE TABLE TBL_EMPLOYEES (
                               id VARCHAR AUTO_INCREMENT  PRIMARY KEY,
                               name VARCHAR(250) NOT NULL,
                               description VARCHAR(250) NOT NULL,
                               version_number INT(250) NOT NULL
);
