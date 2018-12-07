INSERT INTO type (type_id,type_created_by,type_created_date,type_name) VALUES (13,0,NULL,'Epic');
INSERT INTO type (type_id,type_created_by,type_created_date,type_name) VALUES (14,0,NULL,'Features');
INSERT INTO type (type_id,type_created_by,type_created_date,type_name) VALUES (15,0,NULL,'Story');

INSERT INTO subtype (subtype_id,subtype_name,subtype_type_id,subtype_created_by,subtype_created_date) VALUES (1,'Development',15,1,NULL);
INSERT INTO subtype (subtype_id,subtype_name,subtype_type_id,subtype_created_by,subtype_created_date) VALUES (2,'Code Review',15,1,NULL);
INSERT INTO subtype (subtype_id,subtype_name,subtype_type_id,subtype_created_by,subtype_created_date) VALUES (3,'In QA',15,1,NULL);
INSERT INTO subtype (subtype_id,subtype_name,subtype_type_id,subtype_created_by,subtype_created_date) VALUES (4,'DONE',15,1,NULL);
INSERT INTO subtype (subtype_id,subtype_name,subtype_type_id,subtype_created_by,subtype_created_date) VALUES (5,'Enhancement',15,1,NULL);
INSERT INTO subtype (subtype_id,subtype_name,subtype_type_id,subtype_created_by,subtype_created_date) VALUES (6,'BUG',15,1,NULL);
INSERT INTO subtype (subtype_id,subtype_name,subtype_type_id,subtype_created_by,subtype_created_date) VALUES (7,'CR',15,1,NULL);

INSERT INTO item (item_id, item_name, item_type_id, item_subtype_id, item_created_by) VALUES ('1', 'APM', '15', '1', '1');
INSERT INTO item (item_id, item_name, item_type_id, item_subtype_id, item_created_by) VALUES ('2', 'APM', '15', '2', '1');
INSERT INTO item (item_id, item_name, item_type_id, item_subtype_id, item_created_by) VALUES ('3', 'APM', '15', '3', '1');
INSERT INTO item (item_id, item_name, item_type_id, item_subtype_id, item_created_by) VALUES ('4', 'APM', '15', '5', '1');
INSERT INTO item (item_id, item_name, item_type_id, item_subtype_id, item_created_by) VALUES ('5', 'IRW', '14', '1', '1');



INSERT INTO board (board_id, board_name, board_type_id, board_subtype_id, board_created_by) VALUES ('1', 'APM', '15', '1', '1');
INSERT INTO board (board_id, board_name, board_type_id, board_subtype_id, board_created_by) VALUES ('2', 'APM', '15', '2', '1');
INSERT INTO board (board_id, board_name, board_type_id, board_subtype_id, board_created_by) VALUES ('3', 'APM', '15', '3', '3');
INSERT INTO board (board_id, board_name, board_type_id, board_subtype_id, board_created_by) VALUES ('4', 'IRW', '14', '1', '1');