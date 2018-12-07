DROP TABLE item

INSERT INTO account (id, created_by, description, name) VALUES ('1', '1', 'Bourntec Solutions', 'Bourntec');
INSERT INTO account (id, created_by, description, name) VALUES ('2', '1', 'Tata Consultancy Services', 'Tata TCS');


INSERT INTO product (id,created_by,created_date,description,name,prefix,account_id) VALUES (1,1,NULL,'Monitoring tools','ManageIT','MIT',1);
INSERT INTO product (id,created_by,created_date,description,name,prefix,account_id) VALUES (2,1,NULL,'Resource Management Tool','Consultrak','CT',1);
INSERT INTO product (id,created_by,created_date,description,name,prefix,account_id) VALUES (3,1,NULL,'Core Banking Solution','Core Banking','CBS',2);


INSERT INTO item (id,item_created_by,item_created_date,item_name,item_subtype_id,item_type_id,product_id) VALUES (1,1,NULL,'Company Copying',1,15,1);
INSERT INTO item (id,item_created_by,item_created_date,item_name,item_subtype_id,item_type_id,product_id) VALUES (2,1,NULL,'APM Profile',5,15,1);
INSERT INTO item (id,item_created_by,item_created_date,item_name,item_subtype_id,item_type_id,product_id) VALUES (3,1,NULL,'IRW KB Mapping',1,15,1);
INSERT INTO item (id,item_created_by,item_created_date,item_name,item_subtype_id,item_type_id,product_id) VALUES (4,1,NULL,'Dashboard widget',1,15,1);
INSERT INTO item (id,item_created_by,item_created_date,item_name,item_subtype_id,item_type_id,product_id) VALUES (5,1,NULL,'Mobile App',1,14,2);
INSERT INTO item (id,item_created_by,item_created_date,item_name,item_subtype_id,item_type_id,product_id) VALUES (6,1,NULL,'New UI ',5,14,2);

