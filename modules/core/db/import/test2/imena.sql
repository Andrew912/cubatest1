-- Create new columns
alter table imena add CREATE_TS datetime2 ;
alter table imena add CREATED_BY varchar(50) ;
alter table imena add UPDATE_TS datetime2 ;
alter table imena add UPDATED_BY varchar(50) ;
alter table imena add DELETE_TS datetime2 ;
alter table imena add DELETED_BY varchar(50) ;
update imena set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
