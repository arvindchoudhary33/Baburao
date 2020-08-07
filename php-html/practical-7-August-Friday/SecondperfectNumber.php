<html>
<head>
	<title>Perfect Number Check </title>
</head>
<body bgcolor="beige">

	<h1 align="center">Perfect  Number Check</h1>
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
$i = 1;
$sum=0;
while ($i < $number) {
if ($number % $i == 0) {
$sum = $sum + $i;
}
$i++;
}
if($number == $sum){
	printf("The number %d  is a perfect Number.", $number);
	}else{
	printf("The number %d  is not a  perfect Number.", $number);
}

}

?>



</body>
</html>



