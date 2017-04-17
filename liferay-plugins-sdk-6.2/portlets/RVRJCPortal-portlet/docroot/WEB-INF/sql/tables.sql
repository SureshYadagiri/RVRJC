create table rvrjc_Address (
	addressId LONG not null primary key,
	doorNo VARCHAR(75) null,
	city VARCHAR(75) null,
	mandal VARCHAR(75) null,
	district VARCHAR(75) null,
	state_ VARCHAR(75) null,
	addCountry VARCHAR(75) null
);

create table rvrjc_Course (
	cno LONG not null primary key,
	ccode VARCHAR(75) null,
	cname VARCHAR(75) null,
	cfee INTEGER,
	cdescription VARCHAR(75) null,
	createdOn DATE null,
	createdBy VARCHAR(75) null,
	modifiedOn DATE null,
	modifiedBy VARCHAR(75) null
);

create table rvrjc_Department (
	dno LONG not null primary key,
	dname VARCHAR(75) null,
	createdOn DATE null,
	createdBy VARCHAR(75) null,
	modifiedOn DATE null,
	modifiedBy VARCHAR(75) null
);

create table rvrjc_Invoice (
	invoiceId LONG not null primary key,
	amountPaid LONG,
	paidDate DATE null,
	sno LONG,
	createdOn DATE null,
	createdBy VARCHAR(75) null
);

create table rvrjc_Parent (
	parentId LONG not null primary key,
	nickName VARCHAR(75) null,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	phNo LONG,
	email VARCHAR(75) null,
	relationShip VARCHAR(75) null,
	createdOn DATE null,
	createdBy VARCHAR(75) null,
	modifiedOn DATE null,
	modifiedBy VARCHAR(75) null
);

create table rvrjc_Student (
	sno LONG not null primary key,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	gender INTEGER,
	dateOfBirth DATE null,
	email VARCHAR(75) null,
	emcetRank LONG,
	dno LONG,
	addressId LONG,
	liferayUserId LONG,
	createdOn DATE null,
	createdBy VARCHAR(75) null,
	modifiedOn DATE null,
	modifiedBy VARCHAR(75) null
);

create table rvrjc_Student_Parent (
	parentId LONG not null,
	sno LONG not null,
	primary key (parentId, sno)
);

create table rvrjc_Student_course (
	cno LONG not null,
	sno LONG not null,
	primary key (cno, sno)
);

create table rvrjc_Teacher (
	tid LONG not null primary key,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	gender VARCHAR(75) null,
	email VARCHAR(75) null,
	phno LONG,
	liferayUserId LONG
);