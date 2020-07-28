<?php 
  /* haha I was trying to comment outside of <?php  , I got furious why doesn't it work , but you know  , now i know  , I know , I know 
  	yeeeee yeeeeeeeeee. 
  */ 

$name = $_POST["txtname"]; // These all inside the POST are the values we retrieve from our HTML form. 
$add = $_POST["tex"];
$gender = $_POST["rb"]; 
$pr= $_POST["check"];
$cart = $_POST["childhood"];

echo"Student Name",$name;   // Just printing the values 
echo"<br>Student address:",$add;
echo"<br>Student gender : ",$gender;
echo"<br>ProgrammingLangauge/'s: ";

foreach($pr as $v){ // $v is a instance variable & only valid  inside this forLoop , this $v will take all the data from $pr( why a instance variable , ask Rasmus Lerdorf ) 

	echo $v, " "; // printing the multiple values we retrieved from our HTML form to  our $pr variable  then to our $v ( yeah there are too many give and take ). 
}

echo"<br>FavouriteCartoon :";
foreach($cart as $ca){ // same as above , am not writing everything , Man or might be a woman. You have to do some efforts . Slowly move your eyes upwards and see. 

	echo $ca, " ";
}



// Bye 
?> 

