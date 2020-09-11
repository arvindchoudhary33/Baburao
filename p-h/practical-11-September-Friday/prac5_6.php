<?php
  class Student{
    var $name;
    var $m1; var $m2; var $m3;
    var $sum; var $per;

    function __construct($n, $m1, $m2, $m3){
      $this->name = $n;
      $this->m1 = $m1;
      $this->m2 = $m2;
      $this->m3 = $m3;

      $this->sum = ($this->m1+$this->m2+$this->m3);
      $this->per = ($this->sum/3);
    }

    function __destruct(){
      echo $this->name." has total marks ".$this->sum." with percentage ".$this->per;
    }
  }

  $obj =new Student("Raviraj", 70, 85, 90);
 ?>
