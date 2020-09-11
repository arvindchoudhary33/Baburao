<html>
<body>
  <form method="POST">
    <br><br> Enter first number: <input type="text" name="num1">
    <br><br> Enter second number: <input type="text" name="num2">
    <p>
      <br> 1. Addition.
      <br> 2. Subtraction
      <br> 3. Multiplication.
      <br> 4. Division.
    </p>
      <br><br> Enter your choice: <input type="text" name="choice">
      <br><br> <input type="Submit">
  </form>
  <?php
    class AO{
      var $ch;
      var $num1;
      var $num2;
      function operations(){
        $this->ch = $_POST["choice"];
        $this->num1 = $_POST["num1"];
        $this->num2 = $_POST["num2"];
        switch($this->ch){
          case "1":
            echo "Addition is ".($this->num1 + $this->num2);
            break;
          case "2":
          echo "Subtraction is ".($this->num1 - $this->num2);
          break;
          case "3":
          echo "Multiplication is ".($this->num1 * $this->num2);
          break;
          case "4":
          echo "Division is ".($this->num1 / $this->num2);
          break;
          default:
            echo "Invalid Choice!!!";
         }
     }
    }

    $obj = new AO();
    $obj->operations();
   ?>
</body>
</html>
