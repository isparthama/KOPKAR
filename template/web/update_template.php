<?
	include ("../objects/templatecls.php");
	include_once '../../mk_config/mk_config.php';

	$template=new template($con);
	session_start();
	if (isset($_SESSION["template"])){
		$template=$_SESSION["template"];
		if (setdata($template)){
			if ($template->getstatus()==3){
				if ($template->delete()){
					if ($template->movefirst()){
						$template->setmessages("Data Deleted");
						header("location:templatefrm.php");
					}
				}
			} else {
				if ($template->update()){
					if ($template->refresh()){
						$template->setmessages("Data Updated");
						header("location:templatefrm.php");
					}
				}
			}
		}
	} else {
		header("location:../../index.php");
	}
	
	
	function setdata($template){
		$template->setstatus($_POST["istatus"]);
		if ($template->getstatus()==1){
			$template->insert();
		}
                //getsetdata
		$template->setbrandid($_POST["brandid"]);
		$template->setdscription($_POST["dscription"]);
		$template->setaccno($_POST["accno"]);
		$template->setauditdate($_POST["auditdate"]);
		$template->setaudituser($_POST["audituser"]);
                //getsetdataend
		return true;
	}
?>