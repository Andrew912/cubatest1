-- Create new columns
alter table prinadlegnost_nagradi add CREATE_TS datetime2 ;
alter table prinadlegnost_nagradi add CREATED_BY varchar(50) ;
alter table prinadlegnost_nagradi add UPDATE_TS datetime2 ;
alter table prinadlegnost_nagradi add UPDATED_BY varchar(50) ;
alter table prinadlegnost_nagradi add DELETE_TS datetime2 ;
alter table prinadlegnost_nagradi add DELETED_BY varchar(50) ;
update prinadlegnost_nagradi set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
