-- Create new columns
alter table vruchayushie_nagradi add CREATE_TS datetime2 ;
alter table vruchayushie_nagradi add CREATED_BY varchar(50) ;
alter table vruchayushie_nagradi add UPDATE_TS datetime2 ;
alter table vruchayushie_nagradi add UPDATED_BY varchar(50) ;
alter table vruchayushie_nagradi add DELETE_TS datetime2 ;
alter table vruchayushie_nagradi add DELETED_BY varchar(50) ;
update vruchayushie_nagradi set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
