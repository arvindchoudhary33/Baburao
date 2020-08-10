<html>
<head>
	<title>Alphabet Pattern</title>
</head>
<body bgcolor="beige">

  			<h1 align="center">Alphabet Pattern</h1>
				<form method ="POST" >

					Enter The Size of the Pattern (1-26) : &nbsp; <input type ="text" name="txtNumber">	<br><br>
									

					
					<input type="submit">
				</form>



<?php

		
					$userRange = $_POST["txtNumber"];
			
						$alpha = range('A', 'Z');  

						// The range() function creates an array containing a range of elements.
						// The  function returns an array of elements from low to high.
						// Like in this  range('A','Z') returns an array ( value ) like 0 , 1 ,2 ,3 each  with a value . 0 = A , 1 = B and so on.

						// So to manually control our program pattern size  , user can  enter a range which we used in our outer-for-loop .
						// The same program for small alphabets , just replace 'A' to 'a' & 'Z' to 'z'




						for($i=0; $i<$userRange; $i++){ 

						  for($j=0; $j<=$i; $j++){  

						    echo $alpha[$j];  
						    }  
						    echo "<br>";  
						}
	    


?>

</body>
</html>

