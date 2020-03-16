-- Create new columns
alter table korrespondent add CREATE_TS datetime2 ;
alter table korrespondent add CREATED_BY varchar(50) ;
alter table korrespondent add UPDATE_TS datetime2 ;
alter table korrespondent add UPDATED_BY varchar(50) ;
alter table korrespondent add DELETE_TS datetime2 ;
alter table korrespondent add DELETED_BY varchar(50) ;
update korrespondent set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
