-- Create new columns
alter table kategorii_rabotnikov add CREATE_TS datetime2 ;
alter table kategorii_rabotnikov add CREATED_BY varchar(50) ;
alter table kategorii_rabotnikov add UPDATE_TS datetime2 ;
alter table kategorii_rabotnikov add UPDATED_BY varchar(50) ;
alter table kategorii_rabotnikov add DELETE_TS datetime2 ;
alter table kategorii_rabotnikov add DELETED_BY varchar(50) ;
update kategorii_rabotnikov set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
