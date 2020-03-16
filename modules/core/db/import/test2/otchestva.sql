-- Create new columns
alter table otchestva add CREATE_TS datetime2 ;
alter table otchestva add CREATED_BY varchar(50) ;
alter table otchestva add UPDATE_TS datetime2 ;
alter table otchestva add UPDATED_BY varchar(50) ;
alter table otchestva add DELETE_TS datetime2 ;
alter table otchestva add DELETED_BY varchar(50) ;
update otchestva set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
