create table Gradebook_Assignment (
	assignmentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	dueDate DATE null
);

create table Gradebook_Krishna (
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	userId INTEGER not null primary key,
	krishnaId LONG
);