
<?php 
require_once 'account.php';
require_once 'car.php';
require_once 'uberX.php';
require_once 'uberPool.php';

//$car = new Car ('AWS13654', new Account ('Luis Salas', 'DOC11571'));

$uberX = new UberX("AWS13654", new Account ('Luis Salas', 'DOC11571'), 'Honda', 'Civic');

$uberPool = new UberPool("AWS2548", new Account ('Koa Thurnz', 'DOC11571'), 'Suzuki', 'Jimmny');

?>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1> Programación Orientada a Objetos con PHP</h1>
    <?php
      $uberX->printDataCar();
      echo '</br></br>';
      $uberPool->printDataCar();

    ?>

</body>
</html>