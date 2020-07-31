



<html>
<head><title>AreaOfCircle</title></head>
<body bgcolor="beige">

	<h1 align="center"> AreaOfCirle-Program-2nd </h1>

<form method ="POST" >

	Radius :<input type ="text" name="rad"><br><br>



 <br><br><input type="submit">





</form>



		

<?php 
  

define("pi","3.14"); // constant defined

$radius = $_POST["rad"]; // retrieving value from the  htmlForm



echo"<br> Radius  is : ",$radius;
echo"<br> Pi is : ",pi;


    $area= pi * $radius * $radius;

echo"<br> AreaOfCircle  is : ",$area;




?> 

</body>
</html>

	


		

