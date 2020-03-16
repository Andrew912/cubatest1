-- Create new columns
alter table nagradi_oblasti_vruchennie_gragdanam add CREATE_TS datetime2 ;
alter table nagradi_oblasti_vruchennie_gragdanam add CREATED_BY varchar(50) ;
alter table nagradi_oblasti_vruchennie_gragdanam add UPDATE_TS datetime2 ;
alter table nagradi_oblasti_vruchennie_gragdanam add UPDATED_BY varchar(50) ;
alter table nagradi_oblasti_vruchennie_gragdanam add DELETE_TS datetime2 ;
alter table nagradi_oblasti_vruchennie_gragdanam add DELETED_BY varchar(50) ;
update nagradi_oblasti_vruchennie_gragdanam set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
