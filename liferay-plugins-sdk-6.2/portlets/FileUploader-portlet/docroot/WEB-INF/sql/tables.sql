create table fileupload_Employee (
	empId LONG not null primary key,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	dateOfBirth DATE null,
	gender VARCHAR(75) null,
	phno LONG,
	email VARCHAR(75) null
);