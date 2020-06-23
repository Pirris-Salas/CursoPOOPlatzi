<?php

require_once 'payment.php';
class Card extends Payment{

public $cardNumber;
public $cvv;
public $date;

public function __construct($paymentID, $cardNumber, $cvv, $date){

parent::__construct($paymentID);
$this->cardNumber = $cardNumber;
$this->cvv = $cvv;
$this->date = $date;
}


}