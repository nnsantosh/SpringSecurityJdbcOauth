
CREATE TABLE if not exists auth_users (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  user_name VARCHAR(250) NOT NULL,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  active BOOLEAN NOT NULL,
  creation_date TIMESTAMP NOT NULL,
  last_updated_date TIMESTAMP NOT NULL
);
ALTER TABLE auth_users ADD CONSTRAINT USER_NAME_UNIQUE UNIQUE(user_name);

CREATE TABLE if not exists auth_roles (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  role_name VARCHAR(250) NOT NULL,
  creation_date TIMESTAMP NOT NULL,
  last_updated_date TIMESTAMP NOT NULL
);
ALTER TABLE auth_roles ADD CONSTRAINT ROLE_NAME_UNIQUE UNIQUE(role_name);

CREATE TABLE if not exists auth_user_roles (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  user_id INT NOT NULL,
  role_id INT NOT NULL,
  creation_date TIMESTAMP NOT NULL,
  last_updated_date TIMESTAMP NOT NULL,
  foreign key (user_id) references auth_users(id),
  foreign key (role_id) references auth_roles(id)
);
