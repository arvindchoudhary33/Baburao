<html>
<body>
  <form method="POST">
    <p> array = [2,56,98,16,27]
      <br> 1. Replace one array with another.
      <br> 2. Find reverse of an array.
      <br> 3. Display array elements from second index.
      <br> 4. Display two array elements from third index.
      <br> 5. Remove Duplicate values from array.
      <br> </p>
      <br><br> Enter your choice: <input type="text" name="choice">
      <br><br> <input type="Submit">
  </form>
  <?php
      $ch = $_POST["choice"];
      $a1 = array(2,56,98,16,27,56);
      $a2 = array(-3,90,27,13,82);
      switch($ch){
        case "1":
          echo "New array is ";
          print_r(array_replace($a1,$a2));
          break;
        case "2":
          echo "Reversed array is ";
          print_r(array_reverse($a1));
          break;
        case "3":
          print_r(array_slice($a1,1));
          break;
        case "4":
          print_r(array_slice($a1,2,2));
          break;
        case "5":
        echo "existing array ";
        print_r($a1);
        echo "<br> without duplicate values. ";
        print_r(array_unique($a1));
        break;
        default:
          echo "Invalid Choice!!!";
      }
   ?>
</body>
</html>
