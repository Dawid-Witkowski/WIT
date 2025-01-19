<?php
    $zoo_map = array(); // zoo -> suma wagi
    $gatunek_map = array(); // gatunek -> suma wagi
    $liczba_map = array(); // liczba -> suma wagi

    if(file_exists("uploads/zoo-export-new.xml")) {
        $xml = simplexml_load_file("uploads/zoo-export-new.xml");

        // <transaction Zoo="Zoo Africa" Gatunek="Lew" Liczba="20" Waga="6551.1"/>
        foreach ($xml->transaction as $temp) {
            $attributes = $temp->attributes();
            $zoo_attr = (string)$attributes['Zoo'];
            $gatunek_attr = (string)$attributes['Gatunek'];
            $liczba_attr = (string)$attributes['Liczba'];
            $waga_attr = (string)$attributes['Waga'];

            if (array_key_exists($zoo_attr, $zoo_map)) {
                $zoo_map[$zoo_attr] += floatval($waga_attr);
            } else {
                $zoo_map[$zoo_attr] = floatval($waga_attr);
            }
            if (array_key_exists($gatunek_attr, $gatunek_map)) {
                $gatunek_map[$gatunek_attr] += floatval($waga_attr);
            } else {
                $gatunek_map[$gatunek_attr] = floatval($waga_attr);
            }
            if (array_key_exists($liczba_attr, $liczba_map)) {
                $liczba_map[$liczba_attr] += floatval($waga_attr);
            } else {
                $liczba_map[$liczba_attr] = floatval($waga_attr);
            }
        }
    }
?>



<!DOCTYPE html>
<html>
<body>

<form action="upload.php" method="post" enctype="multipart/form-data">
    Select XML file to upload:
    <input type="file" name="fileToUpload" id="fileToUpload">
    <br>
    <input type="submit" value="Upload File" name="submit">
</form>

<br>
<br>
<br>
<?php
    // no file, no tables
    if(file_exists("uploads/zoo-export-new.xml")) {
?>
<table border="1">
    <tr bgcolor="#305496"><th>Zoo</th><th>Suma</th></tr>
    <?php
    $array_keys = array_keys($zoo_map); // [zoo africa]
    for($i=0;$i<sizeof($array_keys);++$i)
    {
        $current_zoo = $array_keys[$i]; // zoo africa
        $current_value = $zoo_map[$current_zoo]; // wartość dla zoo africa
        ?>
        <tr><th bgcolor="#C6EFCE"><?= $current_zoo ?></th><th><?= number_format($current_value,2, ".", "") ?></th></tr>
        <?php
    }
    ?>
    <tr bgcolor="#305496"><th>Total</th><th><?= array_sum(array_values($zoo_map)); ?></th></tr>

</table>
<br>
<table border="1">
    <tr bgcolor="#305496"><th>Gatunek</th><th>Suma</th></tr>
    <?php
    $array_keys = array_keys($gatunek_map);
    for($i=0;$i<sizeof($array_keys);++$i)
    {
        $current_gatunek = $array_keys[$i];
        $current_value = $gatunek_map[$current_gatunek];
        ?>
        <tr><th bgcolor="#C6EFCE"><?= $current_gatunek ?></th><th><?= number_format($current_value,2, ".", "")?></th></tr>
        <?php
    }
    ?>
    <tr bgcolor="#305496"><th>Total</th><th><?= array_sum(array_values($gatunek_map)); ?></th></tr>

</table>
<br>
<table border="1">
    <tr bgcolor="#305496"><th>Liczba</th><th>Suma</th></tr>
    <?php
    $array_keys = array_keys($liczba_map);
    for($i=0;$i<sizeof($array_keys);++$i)
    {
        $current_liczba = $array_keys[$i];
        $current_value = $liczba_map[$current_liczba];
        ?>
        <tr><th bgcolor="#C6EFCE"><?= $current_liczba ?></th><th><?= number_format($current_value,2, ".", "") ?></th></tr>
        <?php
    }
    ?>
    <tr bgcolor="#305496"><th>Total</th><th><?= array_sum(array_values($liczba_map)) ?></th></tr>

</table>


</body>
</html>
<?php
    }
?>