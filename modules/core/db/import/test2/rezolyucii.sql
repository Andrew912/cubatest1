-- Create new columns
alter table rezolyucii add CREATE_TS datetime2 ;
alter table rezolyucii add CREATED_BY varchar(50) ;
alter table rezolyucii add UPDATE_TS datetime2 ;
alter table rezolyucii add UPDATED_BY varchar(50) ;
alter table rezolyucii add DELETE_TS datetime2 ;
alter table rezolyucii add DELETED_BY varchar(50) ;
update rezolyucii set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
