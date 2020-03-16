package com.company.test2.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.*;
import com.haulmont.cuba.core.global.DesignSupport;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Date;

@DesignSupport("{'imported':true}")
@NamePattern("%s|namo")
@Table(name = "nagradi")
@Entity(name = "test2_Nagradi")
public class Nagradi extends BaseUuidEntity implements SoftDelete, Updatable, Creatable {
    private static final long serialVersionUID = -2409631299902708198L;
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
    @Column(name = "namo", length = 124)
    protected String namo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prinadlegnost_nagradi_id")
    protected com.company.test2.entity.PrinadlegnostNagradi prinadlegnostNagradi;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipi_nagrad_id")
    protected TipiNagrad tipiNagrad;
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

    public TipiNagrad getTipiNagrad() {
        return tipiNagrad;
    }

    public void setTipiNagrad(TipiNagrad tipiNagrad) {
        this.tipiNagrad = tipiNagrad;
    }

    public com.company.test2.entity.PrinadlegnostNagradi getPrinadlegnostNagradi() {
        return prinadlegnostNagradi;
    }

    public void setPrinadlegnostNagradi(com.company.test2.entity.PrinadlegnostNagradi prinadlegnostNagradi) {
        this.prinadlegnostNagradi = prinadlegnostNagradi;
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