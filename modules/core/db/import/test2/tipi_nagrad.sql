-- Create new columns
alter table tipi_nagrad add CREATE_TS datetime2 ;
alter table tipi_nagrad add CREATED_BY varchar(50) ;
alter table tipi_nagrad add UPDATE_TS datetime2 ;
alter table tipi_nagrad add UPDATED_BY varchar(50) ;
alter table tipi_nagrad add DELETE_TS datetime2 ;
alter table tipi_nagrad add DELETED_BY varchar(50) ;
update tipi_nagrad set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
