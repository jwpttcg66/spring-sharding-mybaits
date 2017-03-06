CREATE SCHEMA IF NOT EXISTS `db_0`;
CREATE SCHEMA IF NOT EXISTS `db_1`;
CREATE SCHEMA IF NOT EXISTS `db_2`;

DROP TABLE `db_0`.`t_order`;
DROP TABLE `db_1`.`t_order`;
DROP TABLE `db_2`.`t_order`;

CREATE TABLE IF NOT EXISTS `db_0`.`t_order_0` (`order_id` BIGINT NOT NULL, `user_id` INT NOT NULL, `status` VARCHAR(50), PRIMARY KEY (`order_id`));
CREATE TABLE IF NOT EXISTS `db_0`.`t_order_1` (`order_id` BIGINT NOT NULL, `user_id` INT NOT NULL, `status` VARCHAR(50), PRIMARY KEY (`order_id`));
CREATE TABLE IF NOT EXISTS `db_0`.`t_order` (`order_id` BIGINT NOT NULL, `user_id` INT NOT NULL, `status` VARCHAR(50), PRIMARY KEY (`order_id`));

CREATE TABLE IF NOT EXISTS `db_1`.`t_order_0` (`order_id` BIGINT NOT NULL, `user_id` INT NOT NULL, `status` VARCHAR(50), PRIMARY KEY (`order_id`));
CREATE TABLE IF NOT EXISTS `db_1`.`t_order_1` (`order_id` BIGINT NOT NULL, `user_id` INT NOT NULL, `status` VARCHAR(50), PRIMARY KEY (`order_id`));
CREATE TABLE IF NOT EXISTS `db_1`.`t_order` (`order_id` BIGINT NOT NULL, `user_id` INT NOT NULL, `status` VARCHAR(50), PRIMARY KEY (`order_id`));

CREATE TABLE IF NOT EXISTS `db_2`.`t_order_0` (`order_id` BIGINT NOT NULL, `user_id` INT NOT NULL, `status` VARCHAR(50), PRIMARY KEY (`order_id`));
CREATE TABLE IF NOT EXISTS `db_2`.`t_order_1` (`order_id` BIGINT NOT NULL, `user_id` INT NOT NULL, `status` VARCHAR(50), PRIMARY KEY (`order_id`));
CREATE TABLE IF NOT EXISTS `db_2`.`t_order` (`order_id` BIGINT NOT NULL, `user_id` INT NOT NULL, `status` VARCHAR(50), PRIMARY KEY (`order_id`));

