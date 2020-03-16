-- Create new columns
alter table vidi_dokumentov add CREATE_TS datetime2 ;
alter table vidi_dokumentov add CREATED_BY varchar(50) ;
alter table vidi_dokumentov add UPDATE_TS datetime2 ;
alter table vidi_dokumentov add UPDATED_BY varchar(50) ;
alter table vidi_dokumentov add DELETE_TS datetime2 ;
alter table vidi_dokumentov add DELETED_BY varchar(50) ;
update vidi_dokumentov set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
