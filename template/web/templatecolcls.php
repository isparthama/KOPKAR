<?
	include("templatecls.php");
	
	class templatecolcls {
		var $con;
		var $detail1;
		var $template;
		var $docentry;
		
		function templatecolcls($con){
			$this->con=$con;
			$this->template=new template($con);
		}
		
		function fillme($row,$i){
			$this->template=new template($con);
                        //getPHP_fillmecol
			$this->template->setdocentry($row["docentry"]);
			$this->template->setdocentry($row["docentry"]);
                        $this->template->setdocnum($row["docnum"]);
                        $this->template->setdocstatus($row["docstatus"]);
                        $this->template->setdocdate($row["docdate"]);
                        $this->template->setdocduedate($row["docduedate"]);
                        $this->template->setdlvrydate($row["dlvrydate"]);
                        $this->template->setusedate($row["usedate"]);
                        $this->template->setcustmrid($row["custmrid"]);
                        $this->template->setpriceid($row["priceid"]);
                        $this->template->setslprsnid($row["slprsnid"]);
                        $this->template->setclctrid($row["clctrid"]);
                        $this->template->setwhsid($row["whsid"]);
                        $this->template->setpkpsts($row["pkpsts"]);
                        $this->template->setnpwpno($row["npwpno"]);
                        $this->template->setnpwpdate($row["npwpdate"]);
                        $this->template->settermid($row["termid"]);
                        $this->template->setprintcount($row["printcount"]);
                        $this->template->setreffno($row["reffno"]);
                        $this->template->setref1($row["ref1"]);
                        $this->template->setref2($row["ref2"]);
                        $this->template->setcomments($row["comments"]);
                        $this->template->settotalamnt($row["totalamnt"]);
                        $this->template->setdiscamnt($row["discamnt"]);
                        $this->template->setpphpercent($row["pphpercent"]);
                        $this->template->settaxpercent($row["taxpercent"]);
                        $this->template->setbfrpphtaxamnt($row["bfrpphtaxamnt"]);
                        $this->template->setpphamnt($row["pphamnt"]);
                        $this->template->settaxamnt($row["taxamnt"]);
                        $this->template->setfreightamnt($row["freightamnt"]);
                        $this->template->setmiscellaneousamnt($row["miscellaneousamnt"]);
                        $this->template->setgrandtotalamnt($row["grandtotalamnt"]);
                        $this->template->settaxreport($row["taxreport"]);
                        $this->template->setpaytodate($row["paytodate"]);
                        $this->template->setpayment($row["payment"]);
                        $this->template->setpaystatus($row["paystatus"]);
                        $this->template->setobjtype($row["objtype"]);
                        $this->template->setauditdate($row["auditdate"]);
                        $this->template->setaudituser($row["audituser"]);
                        $this->template->setpic($row["pic"]);
                        $this->template->setpaymenttermtypeid($row["paymenttermtypeid"]);
                        $this->template->setdocnumcounter($row["docnumcounter"]);


                        $this->template->setcustmrname($row["custmrname"]);
                        $this->template->setpricename($row["pricename"]);
                        $this->template->setslprsnname($row["slprsnname"]);
                        $this->template->setclctrname($row["clctrname"]);
                        $this->template->setwhsname($row["whsname"]);
                        $this->template->settermname($row["termname"]);
                        $this->template->setaddress1($row["address1"]);
                        $this->template->setaddress2($row["address2"]);
                        $this->template->setprojectname($row["projectname"]);
                        $this->template->setpaymenttermtypename($row["paymenttermtypename"]);
                        $this->template->setupdateable($row["updateable"]);
                        $this->template->setlastcomments($row["lastcomments"]);
                        if ($this->template->getdocstatus()=="C"){
                            $this->template->setupdateable("N");
                        }
                        //getPHP_fillmecolend
			$this->detail1[$i]=$this->template;
			return true;
		}
		
		function initdata($KEY){
                    if ($this->con->connect()){
			$squery="select * from template where KEY='$KEY'";
			$rs=$this->con->executequery($squery);
			if ($rs){
				$i=0;
				while ($row=mysql_fetch_array($rs)){
					if ($this->fillme($row,$i)){
						$i++;
					}
				}
			}
			if ($this->getsize()>0){
				return true;
			}
                    }
		}

		
		function getrow($i){ return $this->detail1[$i]; }
		function getca(){ return $this->template; }
		function getsize(){ return sizeof($this->detail1); }
	}
?>