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
@Table(name = "korrespondent")
@Entity(name = "test2_Korrespondent")
public class Korrespondent extends BaseUuidEntity implements SoftDelete, Updatable, Creatable {
    private static final long serialVersionUID = 8813562880634191566L;
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
    @Column(name = "adres", length = 25)
    protected String adres;
    @Column(name = "dataset_no")
    protected Long datasetNo;
    @Column(name = "faks", length = 1)
    protected String faks;
    @Column(name = "namo", length = 100)
    protected String namo;
    @Column(name = "region")
    protected Long region;
    @Column(name = "telefon", length = 8)
    protected String telefon;
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Long getRegion() {
        return region;
    }

    public void setRegion(Long region) {
        this.region = region;
    }

    public String getNamo() {
        return namo;
    }

    public void setNamo(String namo) {
        this.namo = namo;
    }

    public String getFaks() {
        return faks;
    }

    public void setFaks(String faks) {
        this.faks = faks;
    }

    public Long getDatasetNo() {
        return datasetNo;
    }

    public void setDatasetNo(Long datasetNo) {
        this.datasetNo = datasetNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
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