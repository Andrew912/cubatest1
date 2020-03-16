package com.company.test2.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.*;
import com.haulmont.cuba.core.global.DesignSupport;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Date;

@DesignSupport("{'imported':true}")
@NamePattern("%s|nomerDokumentaONagragdenii")
@Table(name = "dokumenti_po_nagragdeniyu")
@Entity(name = "test2_DokumentiPoNagragdeniyu")
public class DokumentiPoNagragdeniyu extends BaseUuidEntity implements SoftDelete, Updatable, Creatable {
    private static final long serialVersionUID = -2307508151119683324L;
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
    @Column(name = "adresat_iskhodyashego", length = 200)
    protected String adresatIskhodyashego;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_dokumenta_o_nagragdenii")
    protected Date dataDokumentaONagragdenii;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_iskhodyashego")
    protected Date dataIskhodyashego;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_podpisaniya_gubernatorom")
    protected Date dataPodpisaniyaGubernatorom;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_postanovleniya_oms")
    protected Date dataPostanovleniyaOms;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_rassmotreniya_komissiey")
    protected Date dataRassmotreniyaKomissiey;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_soprovoditelnogo_pisma")
    protected Date dataSoprovoditelnogoPisma;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_vozvrata_iz_podrazdeleniy")
    protected Date dataVozvrataIzPodrazdeleniy;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_vrucheniya_nagradi")
    protected Date dataVrucheniyaNagradi;
    @Column(name = "dataset_no")
    protected Long datasetNo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delo_id")
    protected Delo delo;
    @Column(name = "dopolnitelniy_nomer")
    protected Long dopolnitelniyNomer;
    @Temporal(TemporalType.DATE)
    @Column(name = "dopolnitelniy_srok_ispolneniya")
    protected Date dopolnitelniySrokIspolneniya;
    @Column(name = "ispolnitel", length = 15)
    protected String ispolnitel;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "korrespondent_id")
    protected Korrespondent korrespondent;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nagradi_id")
    protected Nagradi nagradi;
    @Column(name = "nagragdaemiy")
    protected Long nagragdaemiy;
    @Column(name = "nomer_dokumenta_o_nagragdenii", length = 12)
    protected String nomerDokumentaONagragdenii;
    @Column(name = "nomer_iskhodyashego", length = 16)
    protected String nomerIskhodyashego;
    @Column(name = "nomer_postanovleniya_oms", length = 13)
    protected String nomerPostanovleniyaOms;
    @Column(name = "nomer_soprovoditelnogo_pisma", length = 20)
    protected String nomerSoprovoditelnogoPisma;
    @Column(name = "otkaz")
    protected Boolean otkaz;
    @Column(name = "podpisavshiy_soprovoditelnoe_pismo", length = 50)
    protected String podpisavshiySoprovoditelnoePismo;
    @Column(name = "primechanie", length = 857)
    protected String primechanie;
    @Column(name = "primechanie_iskhodyashego")
    protected String primechanieIskhodyashego;
    @Column(name = "reshenie_komissii", length = 35)
    protected String reshenieKomissii;
    @Column(name = "soderganie", length = 130)
    protected String soderganie;
    @Temporal(TemporalType.DATE)
    @Column(name = "srok_ispolneniya")
    protected Date srokIspolneniya;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "territoriya_id")
    protected Territoriya territoriya;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipi_nagragdaemikh_id")
    protected TipiNagragdaemikh tipiNagragdaemikh;
    @Column(name = "version_no")
    protected Long versionNo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vid_nagradi_id")
    protected com.company.test2.entity.VidNagradi vidNagradi;
    @Temporal(TemporalType.DATE)
    @Column(name = "vkhodyashaya_data")
    protected Date vkhodyashayaData;
    @Column(name = "vkhodyashiy_nomer")
    protected Integer vkhodyashiyNomer;
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

    public Integer getVkhodyashiyNomer() {
        return vkhodyashiyNomer;
    }

    public void setVkhodyashiyNomer(Integer vkhodyashiyNomer) {
        this.vkhodyashiyNomer = vkhodyashiyNomer;
    }

    public Date getVkhodyashayaData() {
        return vkhodyashayaData;
    }

    public void setVkhodyashayaData(Date vkhodyashayaData) {
        this.vkhodyashayaData = vkhodyashayaData;
    }

    public com.company.test2.entity.VidNagradi getVidNagradi() {
        return vidNagradi;
    }

    public void setVidNagradi(com.company.test2.entity.VidNagradi vidNagradi) {
        this.vidNagradi = vidNagradi;
    }

    public Long getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(Long versionNo) {
        this.versionNo = versionNo;
    }

    public TipiNagragdaemikh getTipiNagragdaemikh() {
        return tipiNagragdaemikh;
    }

    public void setTipiNagragdaemikh(TipiNagragdaemikh tipiNagragdaemikh) {
        this.tipiNagragdaemikh = tipiNagragdaemikh;
    }

    public Territoriya getTerritoriya() {
        return territoriya;
    }

    public void setTerritoriya(Territoriya territoriya) {
        this.territoriya = territoriya;
    }

    public Date getSrokIspolneniya() {
        return srokIspolneniya;
    }

    public void setSrokIspolneniya(Date srokIspolneniya) {
        this.srokIspolneniya = srokIspolneniya;
    }

    public String getSoderganie() {
        return soderganie;
    }

    public void setSoderganie(String soderganie) {
        this.soderganie = soderganie;
    }

    public String getReshenieKomissii() {
        return reshenieKomissii;
    }

    public void setReshenieKomissii(String reshenieKomissii) {
        this.reshenieKomissii = reshenieKomissii;
    }

    public String getPrimechanieIskhodyashego() {
        return primechanieIskhodyashego;
    }

    public void setPrimechanieIskhodyashego(String primechanieIskhodyashego) {
        this.primechanieIskhodyashego = primechanieIskhodyashego;
    }

    public String getPrimechanie() {
        return primechanie;
    }

    public void setPrimechanie(String primechanie) {
        this.primechanie = primechanie;
    }

    public String getPodpisavshiySoprovoditelnoePismo() {
        return podpisavshiySoprovoditelnoePismo;
    }

    public void setPodpisavshiySoprovoditelnoePismo(String podpisavshiySoprovoditelnoePismo) {
        this.podpisavshiySoprovoditelnoePismo = podpisavshiySoprovoditelnoePismo;
    }

    public Boolean getOtkaz() {
        return otkaz;
    }

    public void setOtkaz(Boolean otkaz) {
        this.otkaz = otkaz;
    }

    public String getNomerSoprovoditelnogoPisma() {
        return nomerSoprovoditelnogoPisma;
    }

    public void setNomerSoprovoditelnogoPisma(String nomerSoprovoditelnogoPisma) {
        this.nomerSoprovoditelnogoPisma = nomerSoprovoditelnogoPisma;
    }

    public String getNomerPostanovleniyaOms() {
        return nomerPostanovleniyaOms;
    }

    public void setNomerPostanovleniyaOms(String nomerPostanovleniyaOms) {
        this.nomerPostanovleniyaOms = nomerPostanovleniyaOms;
    }

    public String getNomerIskhodyashego() {
        return nomerIskhodyashego;
    }

    public void setNomerIskhodyashego(String nomerIskhodyashego) {
        this.nomerIskhodyashego = nomerIskhodyashego;
    }

    public String getNomerDokumentaONagragdenii() {
        return nomerDokumentaONagragdenii;
    }

    public void setNomerDokumentaONagragdenii(String nomerDokumentaONagragdenii) {
        this.nomerDokumentaONagragdenii = nomerDokumentaONagragdenii;
    }

    public Long getNagragdaemiy() {
        return nagragdaemiy;
    }

    public void setNagragdaemiy(Long nagragdaemiy) {
        this.nagragdaemiy = nagragdaemiy;
    }

    public Nagradi getNagradi() {
        return nagradi;
    }

    public void setNagradi(Nagradi nagradi) {
        this.nagradi = nagradi;
    }

    public Korrespondent getKorrespondent() {
        return korrespondent;
    }

    public void setKorrespondent(Korrespondent korrespondent) {
        this.korrespondent = korrespondent;
    }

    public String getIspolnitel() {
        return ispolnitel;
    }

    public void setIspolnitel(String ispolnitel) {
        this.ispolnitel = ispolnitel;
    }

    public Date getDopolnitelniySrokIspolneniya() {
        return dopolnitelniySrokIspolneniya;
    }

    public void setDopolnitelniySrokIspolneniya(Date dopolnitelniySrokIspolneniya) {
        this.dopolnitelniySrokIspolneniya = dopolnitelniySrokIspolneniya;
    }

    public Long getDopolnitelniyNomer() {
        return dopolnitelniyNomer;
    }

    public void setDopolnitelniyNomer(Long dopolnitelniyNomer) {
        this.dopolnitelniyNomer = dopolnitelniyNomer;
    }

    public Delo getDelo() {
        return delo;
    }

    public void setDelo(Delo delo) {
        this.delo = delo;
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

    public Date getDataVozvrataIzPodrazdeleniy() {
        return dataVozvrataIzPodrazdeleniy;
    }

    public void setDataVozvrataIzPodrazdeleniy(Date dataVozvrataIzPodrazdeleniy) {
        this.dataVozvrataIzPodrazdeleniy = dataVozvrataIzPodrazdeleniy;
    }

    public Date getDataSoprovoditelnogoPisma() {
        return dataSoprovoditelnogoPisma;
    }

    public void setDataSoprovoditelnogoPisma(Date dataSoprovoditelnogoPisma) {
        this.dataSoprovoditelnogoPisma = dataSoprovoditelnogoPisma;
    }

    public Date getDataRassmotreniyaKomissiey() {
        return dataRassmotreniyaKomissiey;
    }

    public void setDataRassmotreniyaKomissiey(Date dataRassmotreniyaKomissiey) {
        this.dataRassmotreniyaKomissiey = dataRassmotreniyaKomissiey;
    }

    public Date getDataPostanovleniyaOms() {
        return dataPostanovleniyaOms;
    }

    public void setDataPostanovleniyaOms(Date dataPostanovleniyaOms) {
        this.dataPostanovleniyaOms = dataPostanovleniyaOms;
    }

    public Date getDataPodpisaniyaGubernatorom() {
        return dataPodpisaniyaGubernatorom;
    }

    public void setDataPodpisaniyaGubernatorom(Date dataPodpisaniyaGubernatorom) {
        this.dataPodpisaniyaGubernatorom = dataPodpisaniyaGubernatorom;
    }

    public Date getDataIskhodyashego() {
        return dataIskhodyashego;
    }

    public void setDataIskhodyashego(Date dataIskhodyashego) {
        this.dataIskhodyashego = dataIskhodyashego;
    }

    public Date getDataDokumentaONagragdenii() {
        return dataDokumentaONagragdenii;
    }

    public void setDataDokumentaONagragdenii(Date dataDokumentaONagragdenii) {
        this.dataDokumentaONagragdenii = dataDokumentaONagragdenii;
    }

    public String getAdresatIskhodyashego() {
        return adresatIskhodyashego;
    }

    public void setAdresatIskhodyashego(String adresatIskhodyashego) {
        this.adresatIskhodyashego = adresatIskhodyashego;
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