<?php

require_once 'payment.php';
class Paypal extends Payment{

public $email;

public function __construct($paymentID, $email){

parent::__construct($paymentID);
$this->email = $email;
}



}