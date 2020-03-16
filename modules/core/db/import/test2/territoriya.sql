-- Create new columns
alter table territoriya add CREATE_TS datetime2 ;
alter table territoriya add CREATED_BY varchar(50) ;
alter table territoriya add UPDATE_TS datetime2 ;
alter table territoriya add UPDATED_BY varchar(50) ;
alter table territoriya add DELETE_TS datetime2 ;
alter table territoriya add DELETED_BY varchar(50) ;
update territoriya set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
