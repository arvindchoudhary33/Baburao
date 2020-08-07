<html>
<head>
	<title>Number Pattern 1</title>
</head>
<body bgcolor="beige">

  			<h1 align="center">Number Pattern 1</h1>
				<form method ="POST" >

					Number : &nbsp; <input type ="text" name="txtNumber"><br><br>
					
					<input type="submit">
				</form>



<?php

		
				$number = $_POST["txtNumber"];


						for($a=$number; $a>=1; $a--)
						{
						 // inner loop handles number of columns

						for($b=1; $b<=$a; $b++)
						{
						echo $b;
						}
						 echo "<br>";
						}

							for ($a = 2; $a <= $number; $a++) // a = 2  , as we  want 1 common. 
							{

							for($b = 1; $b <= $a; $b++ )
							{

							echo $b;
							}

							echo "<br>";
							}


	    


?>

</body>
</html>

