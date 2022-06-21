drop table if exists `character`
drop table if exists `episode`
drop table if exists `location`
drop table if exists `numerosfelices`
create table `character` (`character_id` integer not null, `gender` varchar(255), `image` varchar(255), `name` varchar(255), `species` varchar(255), `episode_id` integer, primary key (`character_id`)) engine=MyISAM
create table `episode` (`episode_id` integer not null, `episode_name` varchar(255), primary key (`episode_id`)) engine=MyISAM
create table `location` (`location_id` integer not null, `dimension` varchar(255), `name` varchar(255), `type` varchar(255), primary key (`location_id`)) engine=MyISAM
create table `numerosfelices` (`id` integer not null auto_increment, `number` integer not null, primary key (`id`)) engine=MyISAM
alter table `character` add constraint `FKuj9x7uobki1x7g13j418taj7` foreign key (`episode_id`) references `episode` (`episode_id`)