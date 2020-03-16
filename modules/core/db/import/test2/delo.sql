-- Create new columns
alter table delo add CREATE_TS datetime2 ;
alter table delo add CREATED_BY varchar(50) ;
alter table delo add UPDATE_TS datetime2 ;
alter table delo add UPDATED_BY varchar(50) ;
alter table delo add DELETE_TS datetime2 ;
alter table delo add DELETED_BY varchar(50) ;
update delo set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
