<?php
require_once 'car.php';
class UberX extends Car{

public $brand;
public $model;

public function __construct($license , $driver, $brand, $model){

   parent::__construct($license, $driver);
   $this->brand = $brand;
   $this->model = $model;
}

public function printDataCar(){

    echo '<p>' . $this->license . '</p>';
    echo '<p>' . $this->driver->name . '</p>';
    echo '<p>' . $this->driver->document . '</p>';
    echo '<p>' . $this->brand . '</p>';
    echo '<p>' . $this->model . '</p>';
    
    }


}