-- Create new columns
alter table mesta_raboti add CREATE_TS datetime2 ;
alter table mesta_raboti add CREATED_BY varchar(50) ;
alter table mesta_raboti add UPDATE_TS datetime2 ;
alter table mesta_raboti add UPDATED_BY varchar(50) ;
alter table mesta_raboti add DELETE_TS datetime2 ;
alter table mesta_raboti add DELETED_BY varchar(50) ;
update mesta_raboti set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
