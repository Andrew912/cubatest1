-- Create new columns
alter table vid_nagradi add CREATE_TS datetime2 ;
alter table vid_nagradi add CREATED_BY varchar(50) ;
alter table vid_nagradi add UPDATE_TS datetime2 ;
alter table vid_nagradi add UPDATED_BY varchar(50) ;
alter table vid_nagradi add DELETE_TS datetime2 ;
alter table vid_nagradi add DELETED_BY varchar(50) ;
update vid_nagradi set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
