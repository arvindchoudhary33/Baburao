
<html>
<head>
	<title>SimpleInterest</title>
</head>

<body bgcolor="beige">

	<h1 align="center"> Calculate Simple Interest-Program-1st </h1>

<form method ="POST" >
	

	Principle :<input type ="text" name="prin"><br><br>
	Rate      : &nbsp;&nbsp; &nbsp;&nbsp;  <input type ="text" name="rate"><br><br>
	Time      : &nbsp;&nbsp; &nbsp;  <input type ="text" name="time">



 <br><br><input type="submit">

</form>
			<?php 

			  
			$pr = $_POST["prin"];
			$r = $_POST["rate"];
			$t  = $_POST["time"];


			echo"<br> Principle is : ",$pr;
			echo"<br> Rate is : ",$r;

			echo"<br> Time is : ",$t;


			$si = ($pr * $t * $r)/100;

			echo"<br> SimpleInterest  is : ",$si;

			?> 
</body>
</html>

	


		

		


