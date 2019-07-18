select * from post;

select * from post order by title;

select * from post order by post_id desc;

select count(comments_id) from comments where post_id in (select post_id from post where title= "LEH LADHAK");

select post_id, count(post_id) as num_of_comments from comments group by post_id having num_of_comments > 1 order by post_id asc;

select distinct c.category_name , c.category_id , count(p.category_id) as num_of_post
from category as c join post as p on p.category_id = c.category_id group by p.category_id; 