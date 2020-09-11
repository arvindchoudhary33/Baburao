<html>
<body>
  <form method="POST">
    <h1> To calculate area of a circle. </h1>
    <br> Enter Radius: <input type="text" name="radius">
    <br><br> <input type="Submit">
  </form>
  <?php

    class Circle{
      var $r;
      var $ar;
      function area(){
        $this->r = $_POST["radius"];
        $this->ar = (($this->r ** 2) * 3.14159);
        echo "<br> Area of the circle is ".$this->ar." unit squares.";
      }
    }

    $obj =new Circle();
    $obj->area();
   ?>
</body>
</html>
