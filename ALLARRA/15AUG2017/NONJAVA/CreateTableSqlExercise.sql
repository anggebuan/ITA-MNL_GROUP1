--Table Creation
CREATE
  TABLE MNL_DPMC_IB_INFO
  (
    IB_INFO_ID        NUMBER(20) PRIMARY KEY,
    BILL_OF_LADING_ID NUMBER(20) REFERENCES MNL_DOC_BILL_OF_LADING(
    BILL_OF_LADING_ID),
    BILL_OF_LADING_NUM     VARCHAR(10) NOT NULL ,
    OB_VOYAGE_CODE         VARCHAR(25),
    IB_VOYAGE_CODE         VARCHAR(25),
    LAST_PORT_OF_DISCHARGE VARCHAR(20),
    IB_OFFICE_CODE         VARCHAR2(25),
    SHIPPER_NAME           VARCHAR(100),
    CONSIGNEE_NAME         VARCHAR(100),
    BL_STATE               VARCHAR(40),
    CREATE_IODT            VARCHAR(18),
    REC_UPD_DT             TIMESTAMP(6)
  );
COMMIT;

SELECT
  *
FROM
  MNL_DPMC_IB_INFO;
  
 --Arrival Notice Raw View
  
CREATE OR REPLACE VIEW MNL_DPMC_IB_RVW as
SELECT
  IB.BILL_OF_LADING_NUM,
  IB.SHIPPER_NAME,
  IB.CONSIGNEE_NAME,
  
  IB.IB_VOYAGE_CODE,
  ITS.BERTH_ARRIVAL_IODT,
  IB.IB_OFFICE_CODE,
  GSP.OFFICE_NAME,
  
  --ARP.INV_NUM,
  --ARP.PMT_TTL_AMT,
    DOC.CONTAINER_NUM,
    DOC.SHIPMENT_ID,
    GSPG.PORT_NAME as LAST_PORT_OF_DISCHARGE,
    GSPG1.PORT_NAME as LAST_HUB

FROM
  MNL_DPMC_IB_INFO IB
INNER JOIN MNL_ITS_VC_SCHEDULE_RVW ITS
ON
  (
    IB.IB_VOYAGE_CODE=ITS.VOYAGE_CONTROL_ID
  )
--INNER JOIN MNL_ARP_INV_NOTE ARP ON (IB.BILL_OF_LADING_NUM = ARP.REF_NUM)
JOIN MNL_DOC_BL_PKG_INFO DOC ON (IB.BILL_OF_LADING_ID = DOC.BL_ID)
JOIN MNL_GSP_ORG GSP ON (IB.IB_OFFICE_CODE = GSP.ID)
INNER JOIN MNL_SHP_RTE_RVW SHP ON (DOC.SHIPMENT_ID = SHP.SHIPMENT_NUM)
INNER JOIN MNL_GSP_GEO GSPG ON (GSPG.FACILITY_ID = SHP.LAST_POD),
MNL_GSP_GEO GSPG1 WHERE GSPG1.FACILITY_ID = SHP.LAST_IB;




--SET DEFINE OFF


--Row 1
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (1,2507170511394103,'2017144400','1121','1119','ABC','7','H M Hennes Mauritz GBC AB  demurrage','Great Luck Inc.','B/L Ready');
--Row 2
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (2,2507313319035670,'2523211040','1122','1111','ABC','7','Teijin Polycarbonate Singapore Pte Ltd','SDV Logistiques (Canada) Inc.','B/L Ready');
--Row 3
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (3,2507517866851972,'2522744880','1130','1120','ABC','18','Pantainer (H.K.) Limited dba Pantainer Express Lin','PPCA Importers Pty Ltd','B/L Ready');
--Row 4
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (4,2507268221879478,'2523311434','1122','1120','ABC','13','Clasquin Canada Inc.','Havi Freight Management Limited','Preparation In Progress');
--Row 5
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (5,2507128098592005,'2523473410','1121','1112','ABC','13','Bsa International','Del Monte Corporation','B/L Pending');
--Row 6
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (6,2507227419690259,'3074222940','1129','1111','ABC','18','M.O.T. Intermodal Shipping Inc.','Tomateco Tourist Minerial And Equipment Corp','Preparation In Progress');
--Row 7
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (7,2507215608530157,'2523505670','1130','1115','ABC','7','PT Pabrik Kertas Tjiwi Kimia','ISP (Australia) Pty Ltd','B/L Ready');
--Row 8
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (8,2506977774744321,'3074741040','1129','1113','ABC','18','OFSC EXP Panalpina Welttransport (Deutschland) Gmb','Geodis Wilson Australia Pty Ltd','Preparation In Progress');
--Row 9
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (9,2507452368600965,'3070158630','1128','1119','ABC','13','Sabic Innovative Plastics (Thailand) Co., Ltd','Centran Int''l Corp.(Thailand) Ltd.','B/L Pending');
--Row 10
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (10,2507275738071970,'3074753089','1123','1118','ABC','13','Hellmann Worldwide  Logistics (Shanghai) Limited. ','H and N Foods International Inc.','B/L Proforma Ready');
--Row 11
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (11,2507275738071970,'2523213980','1128','1112','ABC','7','Bayer MaterialScience Limited','Orbit Logistics Pty Ltd','B/L Pending');
--Row 12
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (12,2507233862145464,'3073306740','1127','1116','ABC','18','Avangard Innovative Commodities Group','Euro Auctions UK Limited','B/L Proforma Ready');
--Row 13
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (13,2507567258975715,'3072858980','1124','1113','ABC','18','Sun City (Xiamen) Outdoor Technology Company Limit','Sentinel Logistics Sdn. Bhd.','B/L Ready');
--Row 14
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (14,2507350899999263,'2523682090','1126','1117','ABC','18','UNI4 Marketing AB','Daikin Rexxam Electronics Company Limited','Preparation In Progress');
--Row 15
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (15,2507594102521315,'3070833150','1124','1116','ABC','7','Quanzhou Hongxin Stone Company Limited','Suzuyo (Thailand) Limited','B/L Ready');
--Row 16
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (16,2507337478226715,'2017277940','1125','1114','ABC','13','Unitrans-PRA Co. Inc.','Yusen Logistics (Thailand) Co.,Ltd.','B/L Pending');
--Row 17
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (17,2507156552750209,'3070295320','1123','1117','ABC','7','Freight Management (M) Sdn. Bhd.','Goodyear & Dunlop Tyres (Australia) Pty Ltd','B/L Pending');
--Row 18
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (18,2507035756797303,'2521555527','1125','1118','ABC','18','Jet Fair Industrial Limited','International Paint (Korea) Ltd','B/L Ready');
--Row 19
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (19,2506977774744322,'3072862680','1127','1114','ABC','13','Kamigumi (Hong Kong) Company Limited','Asia Specialty Products Pte Ltd','B/L Pending');
--Row 20
INSERT INTO MNL_DPMC_IB_INFO (IB_INFO_ID, BILL_OF_LADING_ID, BILL_OF_LADING_NUM, OB_VOYAGE_CODE, IB_VOYAGE_CODE, LAST_PORT_OF_DISCHARGE, IB_OFFICE_CODE, SHIPPER_NAME, CONSIGNEE_NAME, BL_STATE) VALUES (20,2507215608530158,'2523626350','1126','1115','ABC','7','Sanyo Energy (Suzhou) Company Limited','Danone Dumex (Malaysia) Sdn. Bhd.','B/L Ready');
