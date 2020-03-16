package com.company.test2.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.*;
import com.haulmont.cuba.core.global.DesignSupport;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Date;

@DesignSupport("{'imported':true}")
@NamePattern("%s|familiya")
@Table(name = "nagradi_oblasti_vruchennie_gragdanam")
@Entity(name = "test2_NagradiOblastiVruchennieGragdanam")
public class NagradiOblastiVruchennieGragdanam extends BaseUuidEntity implements SoftDelete, Updatable, Creatable {
    private static final long serialVersionUID = -5378153777674510766L;
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
    @Temporal(TemporalType.DATE)
    @Column(name = "data_postanovleniya")
    protected Date dataPostanovleniya;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_vrucheniya_nagradi")
    protected Date dataVrucheniyaNagradi;
    @Column(name = "dataset_no")
    protected Long datasetNo;
    @Column(name = "dolgnost", length = 100)
    protected String dolgnost;
    @Column(name = "familiya", length = 20)
    protected String familiya;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "imena_id")
    protected com.company.test2.entity.Imena imena;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kategorii_rabotnikov_id")
    protected KategoriiRabotnikov kategoriiRabotnikov;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mesta_raboti_id")
    protected com.company.test2.entity.MestaRaboti mestaRaboti;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mesta_vrucheniya_id")
    protected com.company.test2.entity.MestaVrucheniya mestaVrucheniya;
    @Column(name = "mesto_raboti_togda", length = 100)
    protected String mestoRabotiTogda;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nagradi_id")
    protected com.company.test2.entity.Nagradi nagradi;
    @Column(name = "nomer_postanovleniya", length = 15)
    protected String nomerPostanovleniya;
    @Column(name = "obekt_vrucheniya")
    protected Long obektVrucheniya;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "otchestva_id")
    protected com.company.test2.entity.Otchestva otchestva;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "otrasli_id")
    protected com.company.test2.entity.Otrasli otrasli;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "predstavlyayushie_k_nagrade_id")
    protected com.company.test2.entity.PredstavlyayushieKNagrade predstavlyayushieKNagrade;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sfera_deyatelnosti_id")
    protected com.company.test2.entity.SferaDeyatelnosti sferaDeyatelnosti;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "territoriya_id")
    protected com.company.test2.entity.Territoriya territoriya;
    @Column(name = "version_no")
    protected Long versionNo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vidi_dokumentov_id")
    protected VidiDokumentov vidiDokumentov;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vruchayushie_nagradi_id")
    protected com.company.test2.entity.VruchayushieNagradi vruchayushieNagradi;
    @Column(name = "zaslugi")
    protected String zaslugi;

    @Override
    public Boolean isDeleted() {
        return deleteTs != null;
    }

    public String getZaslugi() {
        return zaslugi;
    }

    public void setZaslugi(String zaslugi) {
        this.zaslugi = zaslugi;
    }

    public com.company.test2.entity.VruchayushieNagradi getVruchayushieNagradi() {
        return vruchayushieNagradi;
    }

    public void setVruchayushieNagradi(com.company.test2.entity.VruchayushieNagradi vruchayushieNagradi) {
        this.vruchayushieNagradi = vruchayushieNagradi;
    }

    public VidiDokumentov getVidiDokumentov() {
        return vidiDokumentov;
    }

    public void setVidiDokumentov(VidiDokumentov vidiDokumentov) {
        this.vidiDokumentov = vidiDokumentov;
    }

    public Long getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Long versionNo) {
        this.versionNo = versionNo;
    }

    public com.company.test2.entity.Territoriya getTerritoriya() {
        return territoriya;
    }

    public void setTerritoriya(com.company.test2.entity.Territoriya territoriya) {
        this.territoriya = territoriya;
    }

    public com.company.test2.entity.SferaDeyatelnosti getSferaDeyatelnosti() {
        return sferaDeyatelnosti;
    }

    public void setSferaDeyatelnosti(com.company.test2.entity.SferaDeyatelnosti sferaDeyatelnosti) {
        this.sferaDeyatelnosti = sferaDeyatelnosti;
    }

    public com.company.test2.entity.PredstavlyayushieKNagrade getPredstavlyayushieKNagrade() {
        return predstavlyayushieKNagrade;
    }

    public void setPredstavlyayushieKNagrade(com.company.test2.entity.PredstavlyayushieKNagrade predstavlyayushieKNagrade) {
        this.predstavlyayushieKNagrade = predstavlyayushieKNagrade;
    }

    public com.company.test2.entity.Otrasli getOtrasli() {
        return otrasli;
    }

    public void setOtrasli(com.company.test2.entity.Otrasli otrasli) {
        this.otrasli = otrasli;
    }

    public com.company.test2.entity.Otchestva getOtchestva() {
        return otchestva;
    }

    public void setOtchestva(com.company.test2.entity.Otchestva otchestva) {
        this.otchestva = otchestva;
    }

    public Long getObektVrucheniya() {
        return obektVrucheniya;
    }

    public void setObektVrucheniya(Long obektVrucheniya) {
        this.obektVrucheniya = obektVrucheniya;
    }

    public String getNomerPostanovleniya() {
        return nomerPostanovleniya;
    }

    public void setNomerPostanovleniya(String nomerPostanovleniya) {
        this.nomerPostanovleniya = nomerPostanovleniya;
    }

    public com.company.test2.entity.Nagradi getNagradi() {
        return nagradi;
    }

    public void setNagradi(com.company.test2.entity.Nagradi nagradi) {
        this.nagradi = nagradi;
    }

    public String getMestoRabotiTogda() {
        return mestoRabotiTogda;
    }

    public void setMestoRabotiTogda(String mestoRabotiTogda) {
        this.mestoRabotiTogda = mestoRabotiTogda;
    }

    public com.company.test2.entity.MestaVrucheniya getMestaVrucheniya() {
        return mestaVrucheniya;
    }

    public void setMestaVrucheniya(com.company.test2.entity.MestaVrucheniya mestaVrucheniya) {
        this.mestaVrucheniya = mestaVrucheniya;
    }

    public com.company.test2.entity.MestaRaboti getMestaRaboti() {
        return mestaRaboti;
    }

    public void setMestaRaboti(com.company.test2.entity.MestaRaboti mestaRaboti) {
        this.mestaRaboti = mestaRaboti;
    }

    public KategoriiRabotnikov getKategoriiRabotnikov() {
        return kategoriiRabotnikov;
    }

    public void setKategoriiRabotnikov(KategoriiRabotnikov kategoriiRabotnikov) {
        this.kategoriiRabotnikov = kategoriiRabotnikov;
    }

    public com.company.test2.entity.Imena getImena() {
        return imena;
    }

    public void setImena(com.company.test2.entity.Imena imena) {
        this.imena = imena;
    }

    public String getFamiliya() {
        return familiya;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public String getDolgnost() {
        return dolgnost;
    }

    public void setDolgnost(String dolgnost) {
        this.dolgnost = dolgnost;
    }

    public Long getDatasetNo() {
        return datasetNo;
    }

    public void setDatasetNo(Long datasetNo) {
        this.datasetNo = datasetNo;
    }

    public Date getDataVrucheniyaNagradi() {
        return dataVrucheniyaNagradi;
    }

    public void setDataVrucheniyaNagradi(Date dataVrucheniyaNagradi) {
        this.dataVrucheniyaNagradi = dataVrucheniyaNagradi;
    }

    public Date getDataPostanovleniya() {
        return dataPostanovleniya;
    }

    public void setDataPostanovleniya(Date dataPostanovleniya) {
        this.dataPostanovleniya = dataPostanovleniya;
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