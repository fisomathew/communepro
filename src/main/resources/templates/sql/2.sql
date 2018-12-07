CREATE TABLE `comm`.`type` (
  `type_id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `type_name` VARCHAR(250) NULL COMMENT '',
  `type_created_by` INT NULL COMMENT '',
  `type_created_date` DATE NULL COMMENT '',
  PRIMARY KEY (`type_id`)  COMMENT '');


  CREATE TABLE `comm`.`subtype` (
  `subtype_id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `subtype_name` VARCHAR(250) NULL COMMENT '',
  `subtype_type_id` INT NULL COMMENT '',
  `subtype_created_by` INT NULL COMMENT '',
  `subtype_created_date` DATE NULL COMMENT '',
  PRIMARY KEY (`subtype_id`)  COMMENT '');


  CREATE TABLE `comm`.`item` (
  `item_id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `item_name` VARCHAR(250) NULL COMMENT '',
  `item_type_id` INT NULL COMMENT '',
  `item_subtype_id` INT NULL COMMENT '',
  `item_created_by` INT NULL COMMENT '',
  `item_created_date` DATE NULL COMMENT '',
  PRIMARY KEY (`item_id`)  COMMENT '');

  CREATE TABLE `comm`.`board` (
  `board_id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `board_name` VARCHAR(250) NULL COMMENT '',
  `board_type_id` INT NULL COMMENT '',
  `board_subtype_id` INT NULL COMMENT '',
  `board_created_by` INT NULL COMMENT '',
  `board_created_date` DATE NULL COMMENT '',
  PRIMARY KEY (`board_id`)  COMMENT '');
