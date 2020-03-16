-- Create new columns
alter table otrasli add CREATE_TS datetime2 ;
alter table otrasli add CREATED_BY varchar(50) ;
alter table otrasli add UPDATE_TS datetime2 ;
alter table otrasli add UPDATED_BY varchar(50) ;
alter table otrasli add DELETE_TS datetime2 ;
alter table otrasli add DELETED_BY varchar(50) ;
update otrasli set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
