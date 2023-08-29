
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
 <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>


<!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="style.css">

    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<style>
#shadow {
  border: 1px solid;
  padding: 10px;
  box-shadow: 5px 10px 5px 10px #888888;
}
.outerdv
{
 border: 10x solid;
  padding: 10px;
  box-shadow: 5px 10px  10px 10px #888888;
  margin-top:100px;

}
input[type=submit] {
  width: 10%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 20px;
  cursor: pointer;
  margin-left:300px;
}
.outerbx
{
 border: 10x solid;
  padding: 10px;
  box-shadow: 5px 10px  5px #888888;
  margin-top:10px;


}
.header {
  overflow: hidden;
  background-color: #f1f1f1;
  padding: 20px 10px;
}

.header a {
  float: left;

  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: dodgerblue;
  color: white;
}

.header-right {
  float: right;
  


input[type=submit]:hover {
  background-color: #45a049;
}
</style>
</head>
<body>
<div class="header" id="shadow">
  <a href="#default" class="logo"><h3 style:color=red">Advanced Toll Payment System <font Style="color:red">User DashBoard</font></h3></a>
  <div class="header-right">
    <a class="active" href="login">Home</a>
    <a href="#contact">Contact</a>
    <a href="#about">About</a>
  </div>
</div>
<h3 style=color:red;text-align:center;margin-top:40px;>Vehcile Search Details</h3>


<div class=outerdv>

<h3 style="color:red"> ${errorMsg}</h3>
<form action="searchVehicleDtls">

<h6 style="margin-left:200px;">Please Enter Your Vehicle Registration Number</h6><br>

<input type="text" name="regNo"  class="form-control" placeholder="Enter Vehicle Registration Number" style="width:40%;margin-left:150px"><br>
   <input type="submit" value="search"  >
 
</form>
<div class=outerbx>
	<table id="dtBasicExample" class="table table-striped">
	<thead>
	<tr>

		<th>FirstName</th>
		<th  >LastName</th>
		<th >Email</th>
		<th >DateofBirth</th>
		<th  >SSN</th>
		<th  >HouseNumber</th>
		<th  >StreetNo</th>
		<th  >City</th>
		<th>Zip</th>
		<th>Type</th>
		<th>Brand</th>
     </tr>
   </thead>
	<tbody>
<tr>
  <td>${vcldtls.ownerDtls.fname}</td>
<td>${vcldtls.ownerDtls.lname}</td>
 <td>${vcldtls.ownerDtls.email}</td>
 <td> ${vcldtls.ownerDtls.dob} </td>
   <td>${vcldtls.ownerDtls.ssn}</td>
     <td>${vcldtls.adrsDtls.hno}</td>
<td>${vcldtls.adrsDtls.streetno}</td>
 <td>${vcldtls.adrsDtls.city}</td>
 <td> ${vcldtls.adrsDtls.zip} </td>
  <td> ${vcldtls.vhclDtls.type} </td>
  <td> ${vcldtls.vhclDtls.vcompanyname}</td>
</tr>
	 </tbody>
 </table>
  
</div>


  </div>
  <div style="margin-left:500px;margin-top:60px;">
    <a href="buytag">Purchase Tag</a>
     </div>
</body>
</html>