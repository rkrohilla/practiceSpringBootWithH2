-- by default tables are created when a entiry class if found
-- fields are created in alphabetical orders

drop table if exists student ;

drop table if exists course ;

drop table if exists faculty ;

create table student (
    id LONG PRIMARY KEY ,
    name varchar(64) ,
    passport_number varchar(16) ,
    course_id LONG
);

create table course (
    id LONG PRIMARY KEY ,
    name varchar(255) ,
    description varchar(255) ,
    faculty_id LONG
);

create table faculty (
    id LONG PRIMARY KEY ,
    name varchar(255) ,
    address varchar(255) ,
    salary float
);