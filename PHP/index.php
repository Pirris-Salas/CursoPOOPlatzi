
<?php 
require_once 'account.php';
require_once 'car.php';

$car = new Car ('AWS13654', new Account ('Luis Salas', 'DOC11571'));

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
      $car->printDataCar();
    ?>

</body>
</html>