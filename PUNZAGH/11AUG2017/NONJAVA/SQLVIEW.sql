CREATE VIEW MNL_ARP_INV_NOTE_OSTAMT_RVW AS SELECT a.CUST_NAME "Customer Name", a.INV_NUM "Invoice Number",
a.REF_NUM "Ref Num", a.BOUND,STATUS,a.PMT_TTL_AMT "Total Payment",
a.TTL_AMT_VAL "Total Charges",a.OST_AMT "Outstanding Amount" FROM MNL_ARP_INV_NOTE a
ORDER BY a.INV_OID;

/**

Customer Name	Invoice Number	Ref Num		BOUND	STATUS		Total Payment	Total Charges	Outstanding Amount
ABC Company		4201689755		2565012342	OB		Confirmed	50				70				20
ABC Company		42016897561		2565012342	IB		Confirmed	0				100				100

**/