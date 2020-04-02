<?
	include ("../objects/templatecls.php");
	include ("../../mk_logon/mk_logoncls.php");
	include ("../../mk_default/objects/mk_defaultcls.php");
        include_once '../../mk_config/mk_config.php';
        include_once '../../mk_login/objects/mk_moduleaccesscls.php';
	
	$move=0;
	$key="";
	$audituser="";
	if (isset($_GET["move"])){
		$move=$_GET["move"];
	}
	if (isset($_GET["key"])){
		$key=$_GET["key"];
	}
	
	session_start();
	extract($_SESSION);
	$audituser=$audituser;
        if (isset($_SESSION["mk_logon"])){
		$mk_logon=$_SESSION["mk_logon"];
                $mk_logon->getaccess("Brand");
	} else {
		header("location:../../index.php");
	}
        $con->setdb($mk_logon->getcmpnyid());
        $mk_default=new mk_default($con);
	$mk_default->initdata();

	$template=new template($con);
        $mk_moduleaccess=new mk_moduleaccess($con);

	if (isset($_SESSION['template'])){
		$template=$_SESSION['template'];
		if ($key=="")
		{
		switch ($move){
			case 1:
				$template->movefirst();
				break;
			case 2:
				$template->moveprev();
				break;
			case 3:
				$template->movenext();
				break;
			case 4:
				$template->movelast();
				break;
				}
		}else{
		 	$template->initdata($key);
		 }
	} else {
		$template->movefirst();
		$_SESSION['template']=$template;
                $mk_moduleaccess->addtoshortkey($mk_logon->getuserid(), "template",$_SERVER['REQUEST_URI']);
	}
	
	$istatus=0;
	
	if (isset($_GET["istatus"])){
		$istatus=$_GET["istatus"];
	}
	
	if ($istatus==3){
		$template->setmessages("Warning!!! Do you realy wanto to delete this data? Click cancel to abort.");
	}
?>

<SCRIPT LANGUAGE="JavaScript">
<!-- Idea by:  Nic Wolfe -->
<!-- This script and many more are available free online at -->
<!-- The JavaScript Source!! http://javascript.internet.com -->

<!-- Begin
function popUp(URL) {
day = new Date();
id = day.getTime();
eval("page" + id + " = window.open(URL, '" + id + "', 'toolbar=0,scrollbars=1,location=0,statusbar=1,menubar=0,resizable=1,width=300,height=400,left = 362,top = 184');");
}

function initData(KEY1){
	window.location = "../../template/interface/templatefrm.php?key="+KEY1;
	return true;
}
// End -->
</script>

<link href="../../styles/menu_css.css" rel="stylesheet" type="text/css">
<? //include ("../../menu.html"); ?>
<table width="770" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr> 
    <td valign="top"><? include ("../../menu/menuOth.php"); ?></td>
  </tr>
  <tr> 
    <td width="54" valign="top" bgcolor="#EFEFEF">
<table width="100%" align="center">
        <tr> 
          <td height="19" valign="top"> <div align="left"></div>
            <div align="left"></div>
            <span class="style14">template Information </span></td>
        </tr>
        <tr> 
          <td valign="top"> <div align="left"><span class="style12">Last Updated 
              <?=$template->getauditdate();?>
              By 
              <?=$template->getaudituser();?>
              </span></div>
            <hr /></td>
        </tr>
        <tr> 
          <td valign="top" bgcolor="#E2E2E2"> 
            <table width="100%" align="left" >
              <tr bgcolor="#E2E2E2"> 
                <td height="25" colspan="2" bgcolor="#E2E2E2"> <div align="left"><span class="style18">Main 
                    information </span></div></td>
                <td height="25" ><div align="center"><span class="style12"><a href="templatefrm.php?move=1">First</a>
                    | <a href="templatefrm.php?move=2">Prev</a> | <a href="templatefrm.php?move=3">Next</a>
                    | <a href="templatefrm.php?move=4">Last</a></span></div></td>
                <td><div align="Right"><span class="style12"><?if($istatus==0&&$mk_logon->getinsertaccess()=="Y"){?><a href="templatefrm.php?istatus=1"><?}?>Insert</a>
                    | 
                    <? if ($istatus==0&&$mk_logon->getupdateaccess()=="Y"){?>
                    <a href="templatefrm.php?istatus=2">
                    <? }?>
                    Update 
                    <? if ($istatus==0){?>
                    </a> 
                    <? }?>
                    | <? if ($istatus!=0){?><a href="templatefrm.php?istatus=0"><? }?>Undo</a> |
                    <? if ($istatus==0&&$mk_logon->getdeleteaccess()=="Y"){?>
                    <a href="templatefrm.php?istatus=3">
                    <? }?>
                    Delete 
                    <? if ($istatus==0){?>
                    </a> 
                    <? }?>
                    </span></div></td>
              </tr>
              <? if ($istatus==3){?>
              <tr> 
                <td colspan="4" bgcolor="#FF0000"><div align="left"><span class="style16"> 
                    <?=$template->getmessages()?>
                    </span></div></td>
              </tr>
              <? }?>
              <form id="form1" name="form1" method="post" action="update_template.php">
                <tr> 
                  <td width="25%" height="19" bgcolor="#EFEFEF"><div align="right"><span class="style12">Brand 
                      ID &nbsp;&nbsp;[<A HREF="javascript:popUp('../../mk_browsedata/data/mk_browsedata.php?browse=template')">Browse</A>]&nbsp;&nbsp;</span></div></td>
                  <td colspan="3" width="25%" bgcolor="#FFFFFF"><div align="left"><span class="style12">&nbsp;&nbsp;
                      <input name="KEY" type="<? if ($istatus==1){?>text<? } else {?>hidden<? }?>" class="style12" id="KEY" value="<? if($istatus!=1){echo $template->getKEY();}?>"/>
                      <? if ($istatus!=1){?>
                      <?=$template->getKEY();?>
                      <? }?>
                      <input name="istatus" type="hidden" class="style12" id="istatus" value="<?=$istatus;?>"/>
                      <input name="audituser" type="hidden" class="style12" id="audituser" value="<?=$mk_logon->getuserid();?>"/>
                      </span></div></td>
                </tr>
                //getfieldlayar
                <tr> 
                  <td height="19" bgcolor="#EFEFEF"><div align="right"><span class="style12">Brand 
                      Name &nbsp;&nbsp;</span></div></td>
                  <td colspan="3" bgcolor="#FFFFFF"><div align="left"><span class="style12">&nbsp;&nbsp; 
                      <input name="dscription" type="<? if ($istatus==1||$istatus==2){?>text<? } else {?>hidden<? }?>" class="style12" id="dscription" value="<? if($istatus!=1){echo $template->getdscription();}?>" size="50" maxlength="50"/>
                      <? if ($istatus==0||$istatus==3){?>
                      <?=$template->getdscription();?>
                      <? }?>
                      </span></div></td>
                </tr>
                //getfieldlayarend
                <tr> 
                  <td height="23" bgcolor="#EFEFEF">&nbsp;</td>
                  <td colspan="3" bgcolor="#FFFFFF"><div align="left"><span class="style12">&nbsp;&nbsp;&nbsp; 
                      <? if (!$istatus==0){?>
                      <input type="submit" name="Submit" value="<? if ($istatus==3){?>Delete<? } else {?>Save<? }?>" class="style12"/>
                      
                      <? } ?>
                      </span></div></td>
                </tr>
              </form>
            </table></td>
        </tr>
      </table> </td>
  </tr>
</table>
