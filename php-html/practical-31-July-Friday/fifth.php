
<html>
<head>
		<title>characterChecker</title>
</head>
<body bgcolor="beige">

	<h1 align="center"> characterChecker-5th-Program </h1>

<form method ="POST" >

	EnterA_Character :<input type ="text" name="ch"><br><br>



 <br><br><input type="submit">
</form> 

			<?php 
			  
			$char = $_POST["ch"];

			$value = ord($char);

			if($value >= 97 && $value <= 122 ){
				echo"The Entered Character is verySmall";
			}
			else if($value >= 65 && $value <=90){

				echo"The Entered Character is veryVeryBig";

			}

			else if($value >=48 && $value <= 57){

				echo"Number hai!!";
			}

			else{

				echo"It's a outOfWorldCharacter , I mean special.";
			}


			?> 

</body>
</html>

	


		

		
