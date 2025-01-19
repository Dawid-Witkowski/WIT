<?php
$target_dir = "uploads/";
$target_file = $target_dir . "zoo-export-new.xml";
$uploadOk = 1;
$imageFileType = strtolower(pathinfo(basename($_FILES["fileToUpload"]["name"]), PATHINFO_EXTENSION));

if($imageFileType != "xml") {
    echo "Sorry, only XML files are allowed.";
    $uploadOk = 0;
}


// Check if $uploadOk is set to 0 by an error
if ($uploadOk == 0) {
    echo "<br>Sorry, your file was not uploaded.";
// if everything is ok, try to upload file
} else {
    $handle = fopen($target_file, 'w');

    if ($handle === false) { // fopen returns false on error
        echo "Error opening file";
        $uploadOk = 0;
    } else {
        // overrideeeeeeeeeeee
        if (!fwrite($handle, file_get_contents($_FILES["fileToUpload"]["tmp_name"]))) {
            echo "Error writing to file";
            $uploadOk = 0;
        } else {
            echo "The file has been successfully uploaded";
        }
        fclose($handle);
    }
}
