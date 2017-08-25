create TABLE MNL_DOC_BILL_OF_LADING (
         BILL_OF_LADING_ID   NUMBER(20) PRIMARY KEY,
         BILL_OF_LADING_NUM  VARCHAR2(10) NOT NULL,
         OFFICE_ID           NUMBER(20),
         OB_VOYAGE_CTRL_ID   VARCHAR2(10),
         IB_VOYAGE_CTRL_ID   VARCHAR2(10),
         BL_SHIPPER          VARCHAR2(100),
         BL_CONSIGNEE        VARCHAR2(100),
         BL_FORWARDER        VARCHAR2(100),
         BL_NOTIFY           VARCHAR2(100),
         BL_STATUS           VARCHAR2(40)
);
        
CREATE TABLE MNL_DOC_BL_PKG_INFO (
         bl_pkg_info_id      NUMBER(20) PRIMARY KEY,
         bl_id      NUMBER(20) ,
         container_Num      VARCHAR2(10),
         shipment_id        VARCHAR2(20),
          CONSTRAINT fk_blId
          FOREIGN KEY (bl_id)
          REFERENCES MNL_DOC_BILL_OF_LADING(bill_of_lading_id)
        );
        
CREATE TABLE MNL_DOC_BL_CGO_SPEC (
         bl_cgo_spec_id      NUMBER(20) PRIMARY KEY,
         bl_pkg_info_id      NUMBER(20),
         cgo_desc      VARCHAR2(200),
         cgo_weight      VARCHAR2(20),
         cgo_wt_unit     VARCHAR2(5),
         cgo_volume      VARCHAR2(20),
         cgo_vol_unit     VARCHAR2(5),
         MARKS_AND_NUMS  VARCHAR2(200),
          CONSTRAINT fk_pkgInfo
          FOREIGN KEY (bl_pkg_info_id)
          REFERENCES MNL_DOC_BL_PKG_INFO(bl_pkg_info_id)
        );        
        
CREATE TABLE MNL_DOC_CHARGE_SET(
        charge_set_id NUMBER(19) PRIMARY KEY,
        bl_id NUMBER(20)
);
        
CREATE TABLE MNL_DOC_CHG (
         chg_id NUMBER(19) PRIMARY KEY,
         charge_set_id  NUMBER(19), 
         chg_code   VARCHAR2(3),
         basis      NUMBER(17,6),
         rate       NUMBER(16,2),
         CONSTRAINT fk_chg
         FOREIGN KEY (charge_set_id)
         REFERENCES MNL_DOC_CHARGE_SET(charge_set_id)
);

--create view 

create view mnl_ops_eqp_events_rvw as select ops.event_id, eqm.eqp_id, ops.eqp_num, eqm.eqp_size_type,  ops.eqp_type,  ops.event_type, ops.curr_loc,ops.next_loc, eqm.eqp_curr_auth_num, eqm.eqp_num_prefix from mnl_ops_eqp_events ops, ITA.mnl_eqm_eqp_master eqm where eqm.eqp_num = ops.eqp_num;

CREATE VIEW mnl_doc_info
AS
SELECT
bl.bill_of_lading_id, bl.bill_of_lading_num, bl.bl_shipper, bl.bl_consignee,bl.bl_forwarder,bl.bl_notify,pkg.container_num, 
cgospec.cgo_desc
FROM
mnl_doc_bill_of_lading bl, mnl_doc_bl_cgo_spec cgospec, mnl_doc_bl_pkg_info pkg
WHERE
bl.bill_of_lading_id = pkg.bl_id
AND
pkg.bl_pkg_info_id = cgospec.bl_pkg_info_id;


