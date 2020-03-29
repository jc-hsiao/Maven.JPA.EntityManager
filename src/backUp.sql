#create schema testDB;
#drop table shop;

CREATE TABLE `local`.`shop` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NULL,
  `type` VARCHAR(100) NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `local`.`item` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(150) NULL,
  `price` INT NULL,
  PRIMARY KEY (`id`));
  
CREATE TABLE `local`.`witch` (
  `id` INT NOT NULL,
  `name` VARCHAR(150) NULL,
  `age` INT NULL,
  `orbcolor` VARCHAR(60) NULL,
  PRIMARY KEY (`id`));
  
  
  
INSERT INTO `local`.`shop`(`id`,`name`,`type`)VALUES(1,"Sweet Houst","Bakery");
INSERT INTO `local`.`shop`(`id`,`name`,`type`)VALUES(2,"Dream World","Toy Shop");

INSERT INTO `local`.`witch`(`id`,`name`,`age`,`orbcolor`)
VALUES(1,"Doremi",18,"pink");
INSERT INTO `local`.`witch`(`id`,`name`,`age`,`orbcolor`)
VALUES(2,"Hazuki",18,"orange");
INSERT INTO `local`.`witch`(`id`,`name`,`age`,`orbcolor`)
VALUES(3,"Aiko",18,"blue");
INSERT INTO `local`.`witch`(`id`,`name`,`age`,`orbcolor`)
VALUES(4,"Onpu",18,"purple");
INSERT INTO `local`.`witch`(`id`,`name`,`age`,`orbcolor`)
VALUES(5,"Momoko",18,"yellow");

INSERT INTO `local`.`item`(`id`,`name`,`price`)
VALUES(1,"Ice Cream Sandwich",5);
INSERT INTO `local`.`item`(`id`,`name`,`price`)
VALUES(2,"Fruit Cake Roll",10);
INSERT INTO `local`.`item`(`id`,`name`,`price`)
VALUES(3,"Cream Puff",2);
INSERT INTO `local`.`item`(`id`,`name`,`price`)
VALUES(4,"Mont Blanc",4);

INSERT INTO `local`.`item`(`id`,`name`,`price`)
VALUES(5,"White Teddy Bear",10);
INSERT INTO `local`.`item`(`id`,`name`,`price`)
VALUES(6,"Fairy Coloring Book",5);
INSERT INTO `local`.`item`(`id`,`name`,`price`)
VALUES(7,"Blue Toy Car",8);

INSERT INTO `local`.`item`(`id`,`name`,`price`)
VALUES(8,"Iced Tea",1);


ALTER TABLE `local`.`witch` 
ADD CONSTRAINT `shop_id`
  FOREIGN KEY (`shop_id`)
  REFERENCES `local`.`shop` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

UPDATE `local`.`witch` SET `shop_id` = '1' WHERE (`id` = '3');
UPDATE `local`.`witch` SET `shop_id` = '1' WHERE (`id` = '5');
UPDATE `local`.`witch` SET `shop_id` = '2' WHERE (`id` = '6');
UPDATE `local`.`witch` SET `shop_id` = '2' WHERE (`id` = '4');
UPDATE `local`.`witch` SET `shop_id` = '2' WHERE (`id` = '1');
UPDATE `local`.`witch` SET `shop_id` = '1' WHERE (`id` = '2');


CREATE TABLE `local`.`shop_item` (
  `shop_id` INT NOT NULL,
  `item_id` INT NOT NULL
);

INSERT INTO `local`.`shop_item` (`shop_id`, `item_id`) VALUES ('1', '1');
INSERT INTO `local`.`shop_item` (`shop_id`, `item_id`) VALUES ('1', '2');
INSERT INTO `local`.`shop_item` (`shop_id`, `item_id`) VALUES ('1', '3');
INSERT INTO `local`.`shop_item` (`shop_id`, `item_id`) VALUES ('1', '8');
INSERT INTO `local`.`shop_item` (`shop_id`, `item_id`) VALUES ('2', '4');
INSERT INTO `local`.`shop_item` (`shop_id`, `item_id`) VALUES ('2', '5');
INSERT INTO `local`.`shop_item` (`shop_id`, `item_id`) VALUES ('2', '6');
INSERT INTO `local`.`shop_item` (`shop_id`, `item_id`) VALUES ('2', '8');
  



