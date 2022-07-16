CREATE DATABASE IF NOT EXISTS `messages` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
GRANT ALL ON messages.* TO 'user'@'%' IDENTIFIED BY 'password';
USE `messages`

CREATE TABLE `message` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `message_body` varchar(250) NOT NULL COMMENT 'the body of the message',
  `message_sender` varchar(250) NOT NULL COMMENT 'the sender of the message',
  `message_title` varchar(250) NOT NULL COMMENT 'the title of the message',
  PRIMARY KEY (`id`)
);

INSERT INTO messages.message (id, message_body, message_sender, message_title) VALUES
(1, 'My name is George', 'George', 'Hi there'),
(2, 'My name is Kostas', 'Kostas', 'Hi there');

