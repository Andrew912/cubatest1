-- Create new columns
alter table dokumenti_po_nagragdeniyu add CREATE_TS datetime2 ;
alter table dokumenti_po_nagragdeniyu add CREATED_BY varchar(50) ;
alter table dokumenti_po_nagragdeniyu add UPDATE_TS datetime2 ;
alter table dokumenti_po_nagragdeniyu add UPDATED_BY varchar(50) ;
alter table dokumenti_po_nagragdeniyu add DELETE_TS datetime2 ;
alter table dokumenti_po_nagragdeniyu add DELETED_BY varchar(50) ;
update dokumenti_po_nagragdeniyu set CREATE_TS = current_timestamp,
 CREATED_BY = 'import',
 UPDATE_TS = current_timestamp,
 UPDATED_BY = 'import' ;
