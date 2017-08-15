--Problem 1
SELECT * FROM MNL_ARP_POOL_CHRG;
/**
"POOL_ID"	"CHARGESET_ID"	"BOUND"	"CHARGE_CDE"	"BASIS"	"RATE"	"INV_OID"
105				1			          "IB"	  "THD"			      1		   30		    47
106				1			          "IB"	  "OCE"			      1		   50		    47
107				1			          "IB"	  "THC"			      1		   90		    47
110				3			          "IB"	  "OCE"			      1		   40		    48
111				3			          "IB"	  "THC"			      2		   60		    48
108				2			          "OB"	  "OCE"			      1		   20		    48
109				2			          "OB"	  "THD"			      1		   50		    48
112				4		          	"IB"	  "OCE"			      2		   60		    
**/
--Problem 2
SELECT * FROM MNL_ARP_POOL_CHRG WHERE BOUND = 'OB';
/**
"POOL_ID"	"CHARGESET_ID"	"BOUND"	"CHARGE_CDE"	"BASIS"	"RATE"	"INV_OID"
108	       2	             "OB"	  "OCE"	        1	       20	      48
109	       2	             "OB"  	"THD"       	1	       50	      48
**/
--Problem 3
SELECT * FROM MNL_ARP_POOL_CHRG WHERE RATE BETWEEN 30 AND 50;
/**
"POOL_ID"	"CHARGESET_ID"	"BOUND"	"CHARGE_CDE"	"BASIS"	"RATE"	"INV_OID"
105	        1	            "IB"	    "THD"	        1	    30	    47
106	        1	            "IB"	    "OCE"	        1	    50	    47
110	        3	            "IB"	    "OCE"       	1	    40	    48
109	        2            	"OB"	    "THD"        	1	    50	    48
**/
--Problem 4
SELECT POOL_ID,BOUND FROM MNL_ARP_POOL_CHRG WHERE BOUND ='IB';
/**
"POOL_ID" "BOUND"
105	      "IB"
106	      "IB"
107	      "IB"
110	      "IB"
111	      "IB"
112	      "IB"
**/
--Problem 5
SELECT * FROM MNL_ARP_POOL_CHRG WHERE CHARGE_CDE IN ('THD','OCE');
/**
"POOL_ID"	"CHARGESET_ID"	"BOUND"	"CHARGE_CDE"	"BASIS"	"RATE"	"INV_OID"
105	        1	            "IB"	  "THD"	        1	      30	    47
106	        1	            "IB"	  "OCE"	        1	      50	    47
110	        3	            "IB"	  "OCE"	        1	      40	    48
108	        2	            "OB"	  "OCE"	        1	      20	    48
109	        2	            "OB"	  "THD"	        1	      50	    48
112	        4	            "IB"	  "OCE"	        2	      60	    
**/
--Problem 6
SELECT * FROM MNL_ARP_POOL_CHRG WHERE INV_OID IS NULL;
/**
"POOL_ID"	"CHARGESET_ID"	"BOUND"	"CHARGE_CDE"	"BASIS"	"RATE"	"INV_OID"
112	      4	              "IB"	  "OCE"        	2	       60	
**/
--Problem 7
SELECT DISTINCT(BOUND) FROM MNL_ARP_POOL_CHRG WHERE INV_OID IS NOT NULL;
/**
"BOUND"
"OB"
"IB"
**/
--Problem 8
SELECT * FROM MNL_ARP_POOL_CHRG WHERE CHARGE_CDE LIKE 'TH%';
/**
"POOL_ID"	"CHARGESET_ID"	"BOUND"	"CHARGE_CDE"	"BASIS"	"RATE"	"INV_OID"
105	      1	              "IB"	  "THD"       	1	      30	    47
107	      1             	"IB"	  "THC"	        1	      90	    47
111	      3             	"IB"	  "THC"	        2	      60	    48
109	      2	              "OB"	  "THD"	        1	      50	    48
**/