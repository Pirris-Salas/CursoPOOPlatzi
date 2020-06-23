<?php
require_once 'payment.php';
class Cash extends Payment{

public function __construct($paymentID){

    parent::__construct($paymentID);
}

}