create TABLE DOC_BILL_OF_LADING (
         bill_of_lading_id      NUMBER(5) PRIMARY KEY,
         bill_of_lading_num      VARCHAR2(15) NOT NULL,
         BL_shipper      VARCHAR2(40),
         BL_forwarder      VARCHAR2(40),
         BL_notify      VARCHAR2(40) ,
         BL_status      VARCHAR2(40)      
        );
        
CREATE TABLE DOC_BL_PACKAGE_INFO (
         bl_package_info_id      NUMBER(10) PRIMARY KEY,
         bill_of_lading_id      NUMBER(5) ,
         container_Num      VARCHAR2(7),
          CONSTRAINT fk_blIdOne
          FOREIGN KEY (bill_of_lading_id)
          REFERENCES DOC_BILL_OF_LADING(bill_of_lading_id)
        );
        
CREATE TABLE DOC_BL_CGO_SPEC (
         bl_cgo_spec_id      NUMBER(10) PRIMARY KEY,
         bl_package_info_id      NUMBER(10),
         cgo_desc      VARCHAR2(40),
         cgo_weight      VARCHAR2(15),
         cgo_volume      VARCHAR2(15),
          CONSTRAINT fk_pkgInfoOne
          FOREIGN KEY (bl_package_info_id)
          REFERENCES DOC_BL_PACKAGE_INFO(bl_package_info_id)
        );
        
CREATE TABLE DOC_CHARGE (
         charge_id      NUMBER(5) PRIMARY KEY,
         bl_id      NUMBER(5),
         chg_code      VARCHAR2(15),
         basis      NUMBER(18,6),
         rate       NUMBER(18,6),
          CONSTRAINT fk_chg
          FOREIGN KEY (bl_id)
          REFERENCES DOC_BILL_OF_LADING(bill_of_lading_id)
        );

INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10001', '200012321', 'Ocean Freight Int''l Inc', 'UNISHIP Logistics Corp', 'Unilever Philippines', 'Preparation in Progress');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10002', '200012322', 'Ocean Freight Int''l Inc', 'UNISHIP Logistics Corp', 'Mcdonalds', 'B/L Ready');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10003', '200012323', 'Ocean Freight Int''l Inc', 'UNISHIP Logistics Corp', 'Mcdonalds', 'Preparation in Progress');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10004', '200012324', 'Ocean Freight Int''l Inc', 'UNISHIP Logistics Corp', 'Unilever Philippines', 'B/L Pending');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10005', '200012325', 'Ocean Freight Int''l Inc', 'UNISHIP Logistics Corp', 'Unilever Philippines', 'B/L Ready');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10006', '200012326', 'Ocean Freight Int''l Inc', 'UNISHIP Logistics Corp', 'Mcdonalds', 'B/L Proforma Ready');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10007', '200012327', 'UNISHIP Logistics Corp', 'Ocean Freight Int''l Inc', 'Jolibee Foods Corp', 'Preparation in Progress');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10008', '200012328', 'UNISHIP Logistics Corp', 'Ocean Freight Int''l Inc', 'Unilever Philippines', 'B/L Pending');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10009', '200012329', 'UNISHIP Logistics Corp', 'Ocean Freight Int''l Inc', 'BENCH Philippines', 'Preparation in Progress');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10010', '200012330', 'UNISHIP Logistics Corp', 'Ocean Freight Int''l Inc', 'Jolibee Foods Corp', 'B/L Ready');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10011', '200012331', 'UNISHIP Logistics Corp', 'Ocean Freight Int''l Inc', 'BENCH Philippines', 'Preparation in Progress');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10012', '200012332', 'UNISHIP Logistics Corp', 'Ocean Freight Int''l Inc', 'Toyota Cars Ph', 'B/L Pending');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10013', '200012333', 'YHK International Logistics', 'UNISHIP Logistics Corp', 'Cathay Steel Corp', 'B/L Ready');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10014', '200012334', 'YHK International Logistics', 'UNISHIP Logistics Corp', 'BENCH Philippines', 'Preparation in Progress');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10015', '200012335', 'YHK International Logistics', 'UNISHIP Logistics Corp', 'Jolibee Foods Corp', 'B/L Proforma Ready');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10016', '200012336', 'YHK International Logistics', 'UNISHIP Logistics Corp', 'Cathay Steel Corp', 'Preparation in Progress');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10017', '200012337', 'YHK International Logistics', 'UNISHIP Logistics Corp', 'Jolibee Foods Corp', 'B/L Ready');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10018', '200012338', 'YHK International Logistics', 'UNISHIP Logistics Corp', 'Cathay Steel Corp', 'Preparation in Progress');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10019', '200012339', 'YHK International Logistics', 'UNISHIP Logistics Corp', 'BENCH Philippines', 'B/L Proforma Ready');
INSERT INTO DOC_BILL_OF_LADING (BILL_OF_LADING_ID, BILL_OF_LADING_NUM, BL_SHIPPER, BL_FORWARDER, BL_NOTIFY, BL_STATUS) VALUES ('10020', '200012340', 'YHK International Logistics', 'UNISHIP Logistics Corp', 'Mcdonalds', 'B/L Ready');

--1. Selecting and creating
SELECT * FROM DOC_BILL_OF_LADING;
/**
BILL_OF_LADING_ID BILL_OF_LADING_NUM BL_SHIPPER                               BL_FORWARDER                             BL_NOTIFY                                BL_STATUS                              
----------------- ------------------ ---------------------------------------- ---------------------------------------- ---------------------------------------- ----------------------------------------
            10001 200012321          Ocean Freight Int''l Inc                 UNISHIP Logistics Corp                   Unilever Philippines                     Preparation in Progress                  
            10002 200012322          Ocean Freight Int''l Inc                 UNISHIP Logistics Corp                   Mcdonalds                                B/L Ready                                
            10003 200012323          Ocean Freight Int''l Inc                 UNISHIP Logistics Corp                   Mcdonalds                                Preparation in Progress                  
            10004 200012324          Ocean Freight Int''l Inc                 UNISHIP Logistics Corp                   Unilever Philippines                     B/L Pending                              
            10005 200012325          Ocean Freight Int''l Inc                 UNISHIP Logistics Corp                   Unilever Philippines                     B/L Ready                                
            10006 200012326          Ocean Freight Int''l Inc                 UNISHIP Logistics Corp                   Mcdonalds                                B/L Proforma Ready                       
            10007 200012327          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Jolibee Foods Corp                       Preparation in Progress                  
            10008 200012328          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Unilever Philippines                     B/L Pending                              
            10009 200012329          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 BENCH Philippines                        Preparation in Progress                  
            10010 200012330          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Jolibee Foods Corp                       B/L Ready                                
            10011 200012331          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 BENCH Philippines                        Preparation in Progress                  
            10012 200012332          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Toyota Cars Ph                           B/L Pending                              
            10013 200012333          YHK International Logistics              UNISHIP Logistics Corp                   Cathay Steel Corp                        B/L Ready                                
            10014 200012334          YHK International Logistics              UNISHIP Logistics Corp                   BENCH Philippines                        Preparation in Progress                  
            10015 200012335          YHK International Logistics              UNISHIP Logistics Corp                   Jolibee Foods Corp                       B/L Proforma Ready                       
            10016 200012336          YHK International Logistics              UNISHIP Logistics Corp                   Cathay Steel Corp                        Preparation in Progress                  
            10017 200012337          YHK International Logistics              UNISHIP Logistics Corp                   Jolibee Foods Corp                       B/L Ready                                
            10018 200012338          YHK International Logistics              UNISHIP Logistics Corp                   Cathay Steel Corp                        Preparation in Progress                  
            10019 200012339          YHK International Logistics              UNISHIP Logistics Corp                   BENCH Philippines                        B/L Proforma Ready                       
            10020 200012340          YHK International Logistics              UNISHIP Logistics Corp                                                            B/L Ready
**/

--2.SIMPLE SELECT WITH WHERE
SELECT * FROM DOC_BILL_OF_LADING WHERE bl_shipper = 'UNISHIP Logistics Corp';
/**
BILL_OF_LADING_ID BILL_OF_LADING_NUM BL_SHIPPER                               BL_FORWARDER                             BL_NOTIFY                                BL_STATUS                              
----------------- ------------------ ---------------------------------------- ---------------------------------------- ---------------------------------------- ----------------------------------------
            10007 200012327          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Jolibee Foods Corp                       Preparation in Progress                  
            10008 200012328          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Unilever Philippines                     B/L Pending                              
            10009 200012329          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 BENCH Philippines                        Preparation in Progress                  
            10010 200012330          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Jolibee Foods Corp                       B/L Ready                                
            10011 200012331          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 BENCH Philippines                        Preparation in Progress                  
            10012 200012332          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Toyota Cars Ph                           B/L Pending     
**/

--3.SELECT WITH BETWEEN
SELECT * FROM DOC_BILL_OF_LADING WHERE BILL_OF_LADING_ID BETWEEN 10005 AND 10010 ORDER BY BILL_OF_LADING_ID;
/**
BILL_OF_LADING_ID BILL_OF_LADING_NUM BL_SHIPPER                               BL_FORWARDER                             BL_NOTIFY                                BL_STATUS                              
----------------- ------------------ ---------------------------------------- ---------------------------------------- ---------------------------------------- ----------------------------------------
            10005 200012325          Ocean Freight Int''l Inc                 UNISHIP Logistics Corp                   Unilever Philippines                     B/L Ready                                
            10006 200012326          Ocean Freight Int''l Inc                 UNISHIP Logistics Corp                   Mcdonalds                                B/L Proforma Ready                       
            10007 200012327          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Jolibee Foods Corp                       Preparation in Progress                  
            10008 200012328          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Unilever Philippines                     B/L Pending                              
            10009 200012329          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 BENCH Philippines                        Preparation in Progress                  
            10010 200012330          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Jolibee Foods Corp                       B/L Ready               
**/

--4. SELECT WITH COMPOUND WHERE
  SELECT * FROM DOC_BILL_OF_LADING WHERE BL_SHIPPER = 'UNISHIP Logistics Corp' AND BL_NOTIFY = 'Jolibee Foods Corp';
/**
BILL_OF_LADING_ID BILL_OF_LADING_NUM BL_SHIPPER                               BL_FORWARDER                             BL_NOTIFY                                BL_STATUS                              
----------------- ------------------ ---------------------------------------- ---------------------------------------- ---------------------------------------- ----------------------------------------
            10007 200012327          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Jolibee Foods Corp                       Preparation in Progress                  
            10010 200012330          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Jolibee Foods Corp                       B/L Ready   
**/

--5. SELECT USING THE IN PREDICATE
SELECT * FROM DOC_BILL_OF_LADING WHERE BL_STATUS IN ('Preparation in Progress','B/L Ready');
/**
BILL_OF_LADING_ID BILL_OF_LADING_NUM BL_SHIPPER                               BL_FORWARDER                             BL_NOTIFY                                BL_STATUS                              
----------------- ------------------ ---------------------------------------- ---------------------------------------- ---------------------------------------- ----------------------------------------
            10001 200012321          Ocean Freight Int''l Inc                 UNISHIP Logistics Corp                   Unilever Philippines                     Preparation in Progress                  
            10002 200012322          Ocean Freight Int''l Inc                 UNISHIP Logistics Corp                   Mcdonalds                                B/L Ready                                
            10003 200012323          Ocean Freight Int''l Inc                 UNISHIP Logistics Corp                   Mcdonalds                                Preparation in Progress                  
            10005 200012325          Ocean Freight Int''l Inc                 UNISHIP Logistics Corp                   Unilever Philippines                     B/L Ready                                
            10007 200012327          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Jolibee Foods Corp                       Preparation in Progress                  
            10009 200012329          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 BENCH Philippines                        Preparation in Progress                  
            10010 200012330          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Jolibee Foods Corp                       B/L Ready                                
            10011 200012331          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 BENCH Philippines                        Preparation in Progress                  
            10013 200012333          YHK International Logistics              UNISHIP Logistics Corp                   Cathay Steel Corp                        B/L Ready                                
            10014 200012334          YHK International Logistics              UNISHIP Logistics Corp                   BENCH Philippines                        Preparation in Progress                  
            10016 200012336          YHK International Logistics              UNISHIP Logistics Corp                   Cathay Steel Corp                        Preparation in Progress                  
            10017 200012337          YHK International Logistics              UNISHIP Logistics Corp                   Jolibee Foods Corp                       B/L Ready                                
            10018 200012338          YHK International Logistics              UNISHIP Logistics Corp                   Cathay Steel Corp                        Preparation in Progress                  
            10020 200012340          YHK International Logistics              UNISHIP Logistics Corp                                                            B/L Ready  
**/

--6. SELECT USING NULL PREDICATE
SELECT * FROM DOC_BILL_OF_LADING WHERE BL_NOTIFY = null;
/**
BILL_OF_LADING_ID BILL_OF_LADING_NUM BL_SHIPPER                               BL_FORWARDER                             BL_NOTIFY                                BL_STATUS                              
----------------- ------------------ ---------------------------------------- ---------------------------------------- ---------------------------------------- ----------------------------------------
            10020 200012340          YHK International Logistics              UNISHIP Logistics Corp                                                            B/L Ready   
**/

--7. SELECT USING DISTINCT
SELECT DISTINCT BL_SHIPPER FROM DOC_BILL_OF_LADING;
/**
BL_SHIPPER                             
----------------------------------------
UNISHIP Logistics Corp                   
YHK International Logistics              
Ocean Freight Int''l Inc  
**/

--8. SELECT USING LIKE PREDICATE
SELECT * FROM DOC_BILL_OF_LADING WHERE BL_SHIPPER LIKE '%Logis%';
/**
BILL_OF_LADING_ID BILL_OF_LADING_NUM BL_SHIPPER                               BL_FORWARDER                             BL_NOTIFY                                BL_STATUS                              
----------------- ------------------ ---------------------------------------- ---------------------------------------- ---------------------------------------- ----------------------------------------
            10007 200012327          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Jolibee Foods Corp                       Preparation in Progress                  
            10008 200012328          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Unilever Philippines                     B/L Pending                              
            10009 200012329          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 BENCH Philippines                        Preparation in Progress                  
            10010 200012330          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Jolibee Foods Corp                       B/L Ready                                
            10011 200012331          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 BENCH Philippines                        Preparation in Progress                  
            10012 200012332          UNISHIP Logistics Corp                   Ocean Freight Int''l Inc                 Toyota Cars Ph                           B/L Pending                              
            10013 200012333          YHK International Logistics              UNISHIP Logistics Corp                   Cathay Steel Corp                        B/L Ready                                
            10014 200012334          YHK International Logistics              UNISHIP Logistics Corp                   BENCH Philippines                        Preparation in Progress                  
            10015 200012335          YHK International Logistics              UNISHIP Logistics Corp                   Jolibee Foods Corp                       B/L Proforma Ready                       
            10016 200012336          YHK International Logistics              UNISHIP Logistics Corp                   Cathay Steel Corp                        Preparation in Progress                  
            10017 200012337          YHK International Logistics              UNISHIP Logistics Corp                   Jolibee Foods Corp                       B/L Ready                                
            10018 200012338          YHK International Logistics              UNISHIP Logistics Corp                   Cathay Steel Corp                        Preparation in Progress                  
            10019 200012339          YHK International Logistics              UNISHIP Logistics Corp                   BENCH Philippines                        B/L Proforma Ready                       
            10020 200012340          YHK International Logistics              UNISHIP Logistics Corp                                                            B/L Ready                      
**/

