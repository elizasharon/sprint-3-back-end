select * from post;

select * from category where category_name = "FOOD";

select * from post where category_id in (select category_id from category where category_name = "FOOD");

select * from comments where post_id in (select post_id from post where author = "VENKAT" AND category_id in (Select category_id from category where category_name = "TRAVEL"));

select author from post where post_id not in (select post_id from tagging_post where tag_id = 1);

select tag_name from tag where tag_id in (select tag_id from tagging_post where post_id = 2);
