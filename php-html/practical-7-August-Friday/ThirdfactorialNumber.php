<html>
<head>
	<title>Factorial of a Number </title>
</head>
<body bgcolor="beige">

	<h1 align="center">Factorial of a Number </h1>
				<form method ="POST" >

					Number : &nbsp; <input type ="text" name="txtNumber">


				 <br><br>
					<input type="submit">
				</form>



<?php





if($_POST)
{
//get the post value from form
$number = $_POST["txtNumber"];
$factorial = 1;


for ($i=$number; $i>=1; $i--)
{
    $factorial = $factorial * $i;
}

echo"The factorial is of $number is : ",$factorial;
}

?>



</body>
</html>



