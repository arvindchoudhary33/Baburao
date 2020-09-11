<?php
  class Employee{
    var $name;
    var $designation;
    var $salary;
    function getData(){
      $this->name = "Ravi Raj";
      $this->designation = "Jr. Developer";
      $this->salary = 20000;
    }

    function Display(){
      echo "Employee's name is ".$this->name." whose designation is ".$this->designation." and has salary ".$this->salary;
    }
  }
  $e = new Employee();
  $e->getData();
  $e->Display();
 ?>
