CREATE TABLE IF NOT EXISTS dictionary (
  id int(11) NOT NULL,
  word varchar(50) NOT NULL UNIQUE,
  definition varchar(128) DEFAULT NULL,
  PRIMARY KEY (id)
);