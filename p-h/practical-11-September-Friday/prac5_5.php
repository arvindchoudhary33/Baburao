<?php
  class rectArea{
    var $l;
    var $b;
    var $area;

    function __construct(){
      $this->l = 10;
      $this->b = 5;
      $this->area = $this->l * $this->b;
    }

    function __destruct(){
      echo "<b> Area of rectangle is ".$this->area;
    }
  }

  $obj =new rectArea();
 ?>
