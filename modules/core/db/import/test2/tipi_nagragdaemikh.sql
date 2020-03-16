-- Create new columns
alter table tipi_nagragdaemikh add CREATE_TS datetime2 ;
alter table tipi_nagragdaemikh add CREATED_BY varchar(50) ;
alter table tipi_nagragdaemikh add UPDATE_TS datetime2 ;
alter table tipi_nagragdaemikh add UPDATED_BY varchar(50) ;
alter table tipi_nagragdaemikh add DELETE_TS datetime2 ;
alter table tipi_nagragdaemikh add DELETED_BY varchar(50) ;
update tipi_nagragdaemikh set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
