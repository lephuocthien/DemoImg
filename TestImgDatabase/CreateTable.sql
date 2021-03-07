CREATE TABLE test_img (
   id INT NOT NULL PRIMARY KEY,
   img BYTEA
   
);

insert into test_img(id,img) values(1,decode('dWNoaWhhLmpwZw==','base64'));

select * from test_img

drop table test_img