insert into blog(blog_id, blog_name, blog_url, created_date) values (1,"BLOG-1","abc.com","2019-01-10");
insert into blog(blog_id, blog_name, blog_url, created_date) values (2,"BLOG-2","def.com","2019-02-20");

insert into category(category_id, category_name, blog_id, parent_cat_id) values (1,"TRAVEL",1,1);
insert into category(category_id, category_name, blog_id, parent_cat_id) values (2,"FOOD",1,2);
insert into category(category_id, category_name, blog_id, parent_cat_id) values (3,"TREKKING",1,1);
insert into category(category_id, category_name, blog_id, parent_cat_id) values (4,"HOTEL_REVIEWS",1,2);


insert into post(post_id, title, author, category_id) values (1,"ANDAMAN ADVENTURES","BARNEY STINSON",1);
insert into post(post_id, title, author, category_id) values (2,"LEH LADHAK","LEGENDARY",3);
insert into post(post_id, title, author, category_id) values (3,"GOA","VENKAT",1);
insert into post(post_id, title, author, category_id) values (4,"PARADISE BRIYANI","SHELDON COOPER",4);
insert into post(post_id, title, author, category_id) values (5,"CHINESE CUSINIES","CHO MING",2);


insert into comments(comments_id, commented_by, description, post_id) values (1,"WOLOWITZ","XXX",1);
insert into comments(comments_id, commented_by, description, post_id) values (2,"RAJESH","YYY",2);
insert into comments(comments_id, commented_by, description, post_id) values (3,"LEONARD","ZZZ",2);
insert into comments(comments_id, commented_by, description, post_id) values (4,"PENNY","XYZ",3);
insert into comments(comments_id, commented_by, description, post_id) values (5,"AMY","ZYX",4);

insert into TAG(tag_id, tag_name) values (1,"food");
insert into TAG(tag_id, tag_name) values (2,"travel");
insert into TAG(tag_id, tag_name) values (3,"ice");
insert into TAG(tag_id, tag_name) values (4,"beach");
insert into TAG(tag_id, tag_name) values (5,"party");
insert into TAG(tag_id, tag_name) values (6,"trek");
insert into TAG(tag_id, tag_name) values (7,"scenary");


insert into tagging_post(post_id, tag_id) values (1,2);
insert into tagging_post(post_id, tag_id) values (1,7);
insert into tagging_post(post_id, tag_id) values (2,2);
insert into tagging_post(post_id, tag_id) values (2,6);
insert into tagging_post(post_id, tag_id) values (2,7);
insert into tagging_post(post_id, tag_id) values (3,4);
insert into tagging_post(post_id, tag_id) values (3,5);
insert into tagging_post(post_id, tag_id) values (4,1);
insert into tagging_post(post_id, tag_id) values (5,1);
