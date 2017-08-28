package com.procurement.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Product implements Serializable {

    /**
     * Serial version UID
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "procure_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date procureDate;

    @Column(name = "quality_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date qualityDate;

    /** 品类A3表整理 */
    @Column(name = "organize_category_a3_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date organizeCategoryA3Date;

    /** 品类A3表交接 */
    @Column(name = "handover_category_a3_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date handoverCategoryA3Date;

    /** 辅料及工艺单整理 */
    @Column(name = "organize_accessories_and_process_sheet_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date organizeAccessoriesAndProcessSheetDate;

    /** 特殊辅料整理 */
    @Column(name = "organize_specia_accessories_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date organizeSpecialAccessoriesDate;

    /** 所有品类下单结束 */
    @Column(name = "all_category_order_finish_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date allCategoryOrderFinishDate;

    /** A3总表汇总签批完 */
    @Column(name = "master_a3_table_sign_finish_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date masterA3TableSignFinishDate;

    /** 产前样下单 */
    @Column(name = "prenatal_sample_order_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date prenatalSampleOrderDate;

    /** 产前样确认（车间）*/
    @Column(name = "prenatal_sample_confirm_in_workshop_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date prenatalSampleConfirmInWorkshopDate;

    /** 产前样确认（委外）*/
    @Column(name = "prenatal_sample_confirm_subcontract_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date prenatalSampleConfirmInSubcontractDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getProcureDate() {
        return procureDate;
    }

    public void setProcureDate(Date procureDate) {
        this.procureDate = procureDate;
    }

    public Date getQualityDate() {
        return qualityDate;
    }

    public void setQualityDate(Date qualityDate) {
        this.qualityDate = qualityDate;
    }

    public Date getOrganizeCategoryA3Date() {
        return organizeCategoryA3Date;
    }

    public void setOrganizeCategoryA3Date(Date organizeCategoryA3Date) {
        this.organizeCategoryA3Date = organizeCategoryA3Date;
    }

    public Date getHandoverCategoryA3Date() {
        return handoverCategoryA3Date;
    }

    public void setHandoverCategoryA3Date(Date handoverCategoryA3Date) {
        this.handoverCategoryA3Date = handoverCategoryA3Date;
    }

    public Date getOrganizeAccessoriesAndProcessSheetDate() {
        return organizeAccessoriesAndProcessSheetDate;
    }

    public void setOrganizeAccessoriesAndProcessSheetDate(Date organizeAccessoriesAndProcessSheetDate) {
        this.organizeAccessoriesAndProcessSheetDate = organizeAccessoriesAndProcessSheetDate;
    }

    public Date getOrganizeSpecialAccessoriesDate() {
        return organizeSpecialAccessoriesDate;
    }

    public void setOrganizeSpecialAccessoriesDate(Date organizeSpecialAccessoriesDate) {
        this.organizeSpecialAccessoriesDate = organizeSpecialAccessoriesDate;
    }

    public Date getAllCategoryOrderFinishDate() {
        return allCategoryOrderFinishDate;
    }

    public void setAllCategoryOrderFinishDate(Date allCategoryOrderFinishDate) {
        this.allCategoryOrderFinishDate = allCategoryOrderFinishDate;
    }

    public Date getMasterA3TableSignFinishDate() {
        return masterA3TableSignFinishDate;
    }

    public void setMasterA3TableSignFinishDate(Date masterA3TableSignFinishDate) {
        this.masterA3TableSignFinishDate = masterA3TableSignFinishDate;
    }

    public Date getPrenatalSampleOrderDate() {
        return prenatalSampleOrderDate;
    }

    public void setPrenatalSampleOrderDate(Date prenatalSampleOrderDate) {
        this.prenatalSampleOrderDate = prenatalSampleOrderDate;
    }

    public Date getPrenatalSampleConfirmInWorkshopDate() {
        return prenatalSampleConfirmInWorkshopDate;
    }

    public void setPrenatalSampleConfirmInWorkshopDate(Date prenatalSampleConfirmInWorkshopDate) {
        this.prenatalSampleConfirmInWorkshopDate = prenatalSampleConfirmInWorkshopDate;
    }

    public Date getPrenatalSampleConfirmInSubcontractDate() {
        return prenatalSampleConfirmInSubcontractDate;
    }

    public void setPrenatalSampleConfirmInSubcontractDate(Date prenatalSampleConfirmInSubcontractDate) {
        this.prenatalSampleConfirmInSubcontractDate = prenatalSampleConfirmInSubcontractDate;
    }

}
