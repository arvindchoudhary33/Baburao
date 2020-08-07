<?php
 

$name = $_POST["txtname"]; 
$add = $_POST["tex"];
$gender = $_POST["rb"];
$pr= $_POST["check"];
$coll = $_POST["college"];
	
		printf("<br>Student Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :~"); echo " " ,$name; 
		printf("<br>Student Address &nbsp;  :~"); echo " ", $add; 
		printf("<br>Student Gender &nbsp;&nbsp;&nbsp;  :~ "); echo " <i> $gender </i>";
		printf("<br>College &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :~ "); echo " ",$coll;
		printf("<br>Programming Langauges &nbsp;&nbsp; :~ &nbsp;"); 

foreach($pr as $v){ 

	echo $v, ", "; 
}



?>
</td></tr>
