create index IX_FA792AD0 on rvrjc_Course (cfee);
create index IX_621F1865 on rvrjc_Course (cname);

create index IX_56D75A4F on rvrjc_Department (dname);

create index IX_80B1D66C on rvrjc_Student (dno);
create index IX_B8BFF162 on rvrjc_Student (firstName);
create index IX_441E49F3 on rvrjc_Student (firstName, dno);

create index IX_B2A262A5 on rvrjc_Student_Parent (parentId);
create index IX_1F83C998 on rvrjc_Student_Parent (sno);

create index IX_33A03917 on rvrjc_Student_course (cno);
create index IX_3481B127 on rvrjc_Student_course (sno);