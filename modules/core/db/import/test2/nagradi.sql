-- Create new columns
alter table nagradi add CREATE_TS datetime2 ;
alter table nagradi add CREATED_BY varchar(50) ;
alter table nagradi add UPDATE_TS datetime2 ;
alter table nagradi add UPDATED_BY varchar(50) ;
alter table nagradi add DELETE_TS datetime2 ;
alter table nagradi add DELETED_BY varchar(50) ;
update nagradi set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
