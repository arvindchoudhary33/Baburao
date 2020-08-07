<html>
<head>
	<title>Number Check </title>
</head>
<body bgcolor="beige">

	<h1 align="center"> Number Check</h1>
				<form method ="POST" action="trivialFormPHP.php">

					Number : &nbsp; <input type ="text" name="txtname">


						
			
				<select name="choices" id="choice">
				  <option value="posNeg">Positive or Negative</option>
				  <option value="evenOdd">Even Or Odd</option>
				  <option value="div">Divisible By 10 or Not</option>


						

				 </select>



				 <br><br>
					<input type="submit">
				</form>



<?php


$number = $_POST["txtname"];
$value  = $_POST["choices"];

if($value == "posNeg"){
	if($number >0 ){
		printf("The number %d is postive " , $number);
	}
	else {
		printf("The number %d is negative " , $number);
	}

}

else if($value == "evenOdd"){
	if($number % 2 == 0 ){
		printf("The number %d is even " , $number);

	}
	else {
		printf("The number %d is Odd " , $number);
	}
}

else if($value == "div"){

	 if($number % 10 == 0){
		printf("The number %d is Divisible " , $number);

	 }

	 else {
		printf("The number %d is Not Divisible " , $number);
	 }
	}

else{

	echo"Didn't have any input";
}




?>



</body>
</html>



