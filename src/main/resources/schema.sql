CREATE TABLE product(
  id NUMBER(12) NOT NULL PRIMARY KEY,
  name VARCHAR2(50) NOT NULL,
  order_id NUMBER(12) NOT NULL,
  type VARCHAR2(20),
  procure_date DATE, 
  quality_date DATE, 
  all_category_order_finish_date DATE, 
  handover_category_a3_date DATE, 
  master_a3_table_sign_finish_date DATE, 
  organize_accessories_and_process_sheet_date DATE, 
  organize_category_a3_date DATE, 
  organize_specia_accessories_date DATE, 
  prenatal_sample_confirm_subcontract_date DATE, 
  prenatal_sample_confirm_in_workshop_date DATE, 
  prenatal_sample_order_date DATE
);