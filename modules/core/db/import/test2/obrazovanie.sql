-- Create new columns
alter table obrazovanie add CREATE_TS datetime2 ;
alter table obrazovanie add CREATED_BY varchar(50) ;
alter table obrazovanie add UPDATE_TS datetime2 ;
alter table obrazovanie add UPDATED_BY varchar(50) ;
alter table obrazovanie add DELETE_TS datetime2 ;
alter table obrazovanie add DELETED_BY varchar(50) ;
update obrazovanie set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
