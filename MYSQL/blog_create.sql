CREATE TABLE `blog` (
  `blog_id` int(10) unsigned NOT NULL DEFAULT '0',
  `blog_name` varchar(20) DEFAULT NULL,
  `blog_url` varchar(20) NOT NULL UNIQUE,
  PRIMARY KEY (`blog_id`)
);

CREATE TABLE `category` (
  `category_id` int(10) unsigned NOT NULL,
  `category_name` varchar(20) DEFAULT NULL,
  `blog_id` int(10) unsigned NOT NULL,
  `parent_cat_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`category_id`),
  KEY `blog_id` (`blog_id`),
  KEY `parent_cat_id` (`parent_cat_id`),
  CONSTRAINT `category_ibfk_1` FOREIGN KEY (`blog_id`) REFERENCES `blog` (`blog_id`),
  CONSTRAINT `category_ibfk_2` FOREIGN KEY (`parent_cat_id`) REFERENCES `category` (`category_id`)
);

CREATE TABLE `post` (
  `post_id` int(10) unsigned NOT NULL DEFAULT '0',
  `title` varchar(20) NOT NULL,
  `author` varchar(20) DEFAULT NULL,
  `category_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`post_id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `post_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`)
);

CREATE TABLE `comments` (
  `comments_id` int(11) NOT NULL,
  `commented_by` varchar(20) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `post_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`comments_id`),
  KEY `post_id` (`post_id`),
  CONSTRAINT `comments_ibfk_1` FOREIGN KEY (`post_id`) REFERENCES `post` (`post_id`)
);

CREATE TABLE `tag` (
  `tag_id` int(10) unsigned NOT NULL DEFAULT '0',
  `tag_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`tag_id`)
);

CREATE TABLE `tagging_post` (
  `post_id` int(10) unsigned NOT NULL DEFAULT '0',
  `tag_id` int(10) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`post_id`,`tag_id`),
  KEY `tag_id` (`tag_id`),
  CONSTRAINT `tagging_post_ibfk_1` FOREIGN KEY (`post_id`) REFERENCES `post` (`post_id`),
  CONSTRAINT `tagging_post_ibfk_2` FOREIGN KEY (`tag_id`) REFERENCES `tag` (`tag_id`)
);


