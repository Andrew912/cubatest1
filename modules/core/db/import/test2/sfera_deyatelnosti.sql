-- Create new columns
alter table sfera_deyatelnosti add CREATE_TS datetime2 ;
alter table sfera_deyatelnosti add CREATED_BY varchar(50) ;
alter table sfera_deyatelnosti add UPDATE_TS datetime2 ;
alter table sfera_deyatelnosti add UPDATED_BY varchar(50) ;
alter table sfera_deyatelnosti add DELETE_TS datetime2 ;
alter table sfera_deyatelnosti add DELETED_BY varchar(50) ;
update sfera_deyatelnosti set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
