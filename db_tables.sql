-- ALL QUERIES ARE HERE JUST COPY PASTE AND CREATE THE TABLE
-- USE THE DATABASE NAME AS bankproject
-- Inside the file there are 4 .sql files delete them if you find.


CREATE DATABASE bankproject;

USE bankproject;

CREATE TABLE `accounttable` (
    `accountnumber` varchar(25) NOT NULL,
    `name` varchar(45) NOT NULL,
    `phonenumber` varchar(10) NOT NULL,
    `branchname` varchar(45) NOT NULL,
    `ifsccode` varchar(45) NOT NULL,
    `email` varchar(45) NOT NULL,
    `address` varchar(100) NOT NULL,
    `balance` int NOT NULL,
    `accountid` int NOT NULL,
    PRIMARY KEY (`accountnumber`, `accountid`)
);

CREATE TABLE `transactions` (
    `transaction_id` int NOT NULL,
    `acc_no` varchar(255) DEFAULT NULL,
    `amount` int NOT NULL,
    `date` date DEFAULT NULL,
    `time` time DEFAULT NULL,
    `type` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`transaction_id`)
);


CREATE TABLE `usertable` (
    `userid` int NOT NULL,
    `accountnumber` varchar(25) NOT NULL,
    `username` varchar(45) DEFAULT NULL,
    `password` varchar(45) NOT NULL,
    `firstname` varchar(45) NOT NULL,
    `lastname` varchar(45) NOT NULL,
    `phonenumber` varchar(10) NOT NULL,
    `createdtime` timestamp NULL DEFAULT NULL,
    PRIMARY KEY (`userid`, `accountnumber`)
);


CREATE TABLE `hibernate_sequence` (
    `next_val` bigint DEFAULT NULL
);

