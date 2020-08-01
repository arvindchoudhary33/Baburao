
<html>
<head>
	<title>DivisibilityOf5</title>
</head>
<body bgcolor="beige">

	<h1 align="center"> ToCheckAnumberIsDivisbleBy5OrNot-3rd-Program </h1>

<form method="POST">

	Number :<input type ="text" name="num"><br><br>

 <br><br><input type="submit">

</form>


			<?php 
			  
			//ThirdProgram 
			$number = $_POST["num"];

			if($number % 5 == 0)
			{

				echo"The number is divisible by 5  , ";

				if($number % 10 == 0 )
				{
					echo"and also divisible by 10";
				}
				else
				{
					echo"not by 10.";
				}
			}
			else
			{
				echo"Not divisible by 5 . ";
			}

			?> 


</body>
</html>

	


		

		



