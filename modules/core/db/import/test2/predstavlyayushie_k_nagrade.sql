-- Create new columns
alter table predstavlyayushie_k_nagrade add CREATE_TS datetime2 ;
alter table predstavlyayushie_k_nagrade add CREATED_BY varchar(50) ;
alter table predstavlyayushie_k_nagrade add UPDATE_TS datetime2 ;
alter table predstavlyayushie_k_nagrade add UPDATED_BY varchar(50) ;
alter table predstavlyayushie_k_nagrade add DELETE_TS datetime2 ;
alter table predstavlyayushie_k_nagrade add DELETED_BY varchar(50) ;
update predstavlyayushie_k_nagrade set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
