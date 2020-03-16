package com.company.test2.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.*;
import com.haulmont.cuba.core.global.DesignSupport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@DesignSupport("{'imported':true}")
@NamePattern("%s|namo")
@Table(name = "obrazovanie")
@Entity(name = "test2_Obrazovanie")
public class Obrazovanie extends BaseUuidEntity implements SoftDelete, Updatable, Creatable {
    private static final long serialVersionUID = -7834565349294662757L;
    @Column(name = "CREATE_TS")
    protected Date createTs;
    @Column(name = "CREATED_BY", length = 50)
    protected String createdBy;
    @Column(name = "DELETE_TS")
    protected Date deleteTs;
    @Column(name = "DELETED_BY", length = 50)
    protected String deletedBy;
    @Column(name = "UPDATE_TS")
    protected Date updateTs;
    @Column(name = "UPDATED_BY", length = 50)
    protected String updatedBy;
    @Column(name = "dataset_no")
    protected Long datasetNo;
    @Column(name = "namo", length = 19)
    protected String namo;
    @Column(name = "version_no")
    protected Long versionNo;

    @Override
    public Boolean isDeleted() {
        return deleteTs != null;
    }

    public Long getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Long versionNo) {
        this.versionNo = versionNo;
    }

    public String getNamo() {
        return namo;
    }

    public void setNamo(String namo) {
        this.namo = namo;
    }

    public Long getDatasetNo() {
        return datasetNo;
    }

    public void setDatasetNo(Long datasetNo) {
        this.datasetNo = datasetNo;
    }

    @Override
    public String getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public Date getUpdateTs() {
        return updateTs;
    }

    @Override
    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }

    @Override
    public String getDeletedBy() {
        return deletedBy;
    }

    @Override
    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    @Override
    public Date getDeleteTs() {
        return deleteTs;
    }

    @Override
    public void setDeleteTs(Date deleteTs) {
        this.deleteTs = deleteTs;
    }

    @Override
    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public Date getCreateTs() {
        return createTs;
    }

    @Override
    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }
}