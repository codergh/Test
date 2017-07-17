package com.procurement.common.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product implements Serializable {

    @Id
    private long id;

    private String name;

    private String type;

    private Date procureDate;

    private Date qualityDate;

    private Date organizeCategoryA3Date;

    private Date handoverCategoryA3Date;

    private Date organizeAccessoriesAndProcessSheetDate;

    private Date organizeSpecialAccessoriesDate;

    private Date allCategoryOrderFinishDate;

    private Date masterA3TableSignFinishDate;

    private Date prenatalSampleOrderDate;

    private Date prenatalSampleConfirmInWorkshopDate;

    private Date prenatalSampleConfirmInSubcontractDate;

}
