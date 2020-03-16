-- Create new columns
alter table mesta_vrucheniya add CREATE_TS datetime2 ;
alter table mesta_vrucheniya add CREATED_BY varchar(50) ;
alter table mesta_vrucheniya add UPDATE_TS datetime2 ;
alter table mesta_vrucheniya add UPDATED_BY varchar(50) ;
alter table mesta_vrucheniya add DELETE_TS datetime2 ;
alter table mesta_vrucheniya add DELETED_BY varchar(50) ;
update mesta_vrucheniya set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
