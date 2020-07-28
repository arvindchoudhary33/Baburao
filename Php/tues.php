
<?php 
  
$nm = $_POST["txtname"];
$add = $_POST["tex"];
$gen = $_POST["rb"];
$pr= $_POST["check"];
$cart = $_POST["childhood"];

echo"Student Name",$nm;
echo"<br>Student address:",$add;
echo"<br>Student gender : ",$gen;
echo"<br>ProgrammingLangauge/'s: ";

foreach($pr as $v){

	echo $v, " ";
}

echo"<br>FavouriteCartoon :";
foreach($cart as $ca){

	echo $ca, " ";
}


?> 

