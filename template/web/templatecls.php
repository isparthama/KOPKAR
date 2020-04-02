<?

class template{
    //getdeklarasi
	var $KEY;
	var $dscription;
	var $accno;
	var $auditdate;
	var $audituser;
    //getdeklarasiend
	
	var $messages;
	var $con;
	var $status;
	
	function template($con){
		$this->con=$con;
		return true;
	}
	
	function fillme($row){
            //getfillme
		$this->KEY=$row["KEY"];
		$this->dscription=$row["dscription"];
		$this->accno=$row["accno"];
		$this->auditdate=$row["auditdate"];
		$this->audituser=$row["audituser"];
            //getfillmeend
		return true;
	}
	
	function initdata($key1){
		if ($this->con->connect()){
			if ($key1==""){
				$squery="select * from template";
			} else {
				$squery="select * from template where KEY='$key1'";
			}
			$rs=$this->con->executequery($squery);
			while ($row=mysql_fetch_array($rs)){
				$this->fillme($row);
			}
			return true;
		}
	}
	
	function refresh(){
		if($this->initdata($this->KEY)){
			return true;
		}
	}
	
	function movefirst(){
		if ($this->con->connect()){
			$squery="select * from template order by KEY limit 0,1";
			$rs=$this->con->executequery($squery);
			while($row=mysql_fetch_array($rs)){
				$this->fillme($row);
			}
			return true;
		}
	}
	
		function moveprev(){
		if ($this->con->connect()){
			$squery="select * from template where KEY<'$this->KEY' order by KEY desc limit 0,1";
			$rs=$this->con->executequery($squery);
			while ($row=mysql_fetch_array($rs)){
				$this->fillme($row);
			}
			return true;
		}
	}
	
	function movenext(){
		if ($this->con->connect()){
			$squery="select * from template where KEY>'$this->KEY' order by KEY limit 0,1";
			$rs=$this->con->executequery($squery);
			while ($row=mysql_fetch_array($rs)){
				$this->fillme($row);
			}
			return true;
		}
	}

	function movelast(){
		if ($this->con->connect()){
			$squery="select * from template order by KEY desc limit 0,1";
			$rs=$this->con->executequery($squery);
			while ($row=mysql_fetch_array($rs)){
				$this->fillme($row);
			}
			return true;
		}
	}
	
	function insert(){
		$this->status=1;
		return true;
	}
	
	function update(){
		$this->con->connect();
		if ($this->status==1){
			$squery="insert into template (
                    //getfield
                                KEY,
                                dscription,
                                accno,
                                auditdate,
                                audituser
                    //getfieldend
                                )
                                values (
                    //getparaminsert
                                '$this->KEY',
                                '$this->dscription',
                                '$this->accno',
                                now(),
                                '$this->audituser'
                    //getparaminsertend
                                )";
			$this->con->execute($squery);
		} else {
			$squery="update template set
                    //getparamupdate
					dscription='$this->dscription',
					accno='$this->accno',
					auditdate=now(),
					audituser ='$this->audituser'
                   //getparamupdateend
					where KEY='$this->KEY'";
			$this->con->execute($squery);
		}
		return true;
	}
	
	function delete(){
		if ($this->con->connect()){
			$squery="delete from template where KEY='$this->KEY'";
			$this->con->execute($squery);
			return true;
		}
	}

        //getgettersetter
	function getKEY(){ return $this->KEY; }
	function getdscription(){ return $this->dscription; }
	function getaccno(){ return $this->accno; }
	function getauditdate(){ return $this->auditdate; }
	function getaudituser (){ return $this->audituser ; }
        function setKEY($KEY) { $this->KEY=$KEY; }
	function setdscription($dscription) { $this->dscription=$dscription; }
	function setaccno($accno) { $this->accno=$accno; }
	function setauditdate($auditdate) { $this->auditdate=$auditdate; }
	function setaudituser ($audituser ) { $this->audituser =$audituser ; }
        //getgettersetterend
	
	function getmessages(){ return $this->messages;}
	function getstatus(){ return $this->status;}

	function setmessages($messages) { $this->messages=$messages; }
	function setstatus($status) { $this->status=$status; }

}
?>