<?php
$servername   = "localhost";
$sql_user     = "root";
$sql_password = "";
$dbname       = "reg";
$conn         = mysqli_connect($servername , $sql_user , $sql_password , $dbname);

if($conn)
{
    echo "connection success";
}
else
{
    echo "connection not success";
}

if($_SERVER['REQUEST_METHOD'] == "POST")
{
    $full_name = $_POST['full_name'];
    $phone_no  = $_POST['phone_no'];
    $email     = $_POST['email'];
    $birth_date= $_POST['birth_date'];
    $gender    = $_POST['gender'];
    $query     = "";

if($full_name == '' || $phone_no == '' || $email == '' || $birth_date=='' ){
	echo 'User Name, phone_no , email or birth_date can not be empty';
}else{
	$query = "select * from reg where email = '$email'";
	$recordExists = mysqli_fetch_array(mysqli_query($conn, $query));
	if(isset($recordExists)){
		echo 'User already exists';
	}else{
		$query = "INSERT INTO reg (full_name, phone_no, email, birth_date) VALUES ('$full_name' , '$phone_no' , '$email' , '$birth_date' , '$gender')";
		if(mysqli_query($conn, $query)){
			echo 'User registered successfully';
		}else{
			echo 'oops! please try again!';
		}
	}
?>