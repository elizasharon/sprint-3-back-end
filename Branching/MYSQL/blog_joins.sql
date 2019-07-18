select post.title , post.author, comments.description, comments.commented_by from post 
inner join comments on post.post_id = comments.post_id; 

select post.title , post.author, comments.description, comments.commented_by from post 
left outer join comments on post.post_id = comments.post_id; 

select post.title , tag.tag_name from post 
inner join tagging_post on post.post_id = tagging_post.post_id
inner join tag on tag.tag_id = tagging_post.tag_id;

select c.category_name , p.title, p.author, co.description from 
category as c join post as p on p.category_id = c.category_id join 
comments as co on p.post_id = co.post_id;