<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<link rel="stylesheet" href="registration.css">
</head>
<body>
    <form action="registration" method="post">
      <h1><center>REGISTRATION</center></h1>
      <label for="name">NAME:</label>
      <input type="text" id="name" name="name" required>
      
      <label for="branch">BRANCH:</label>
      <input type="text" id="branch" name="branch" required>
      
      <label for="phone">PHONE:</label>
      <input type="tel" id="phone" name="phone" pattern="[0-9]{10}" required>
      
      <label for="section">SECTION:</label>
      <input type="text" id="section" name="section" required>
      
      <label for="year">YEAR:</label>
      <select id="year" name="year" required>
        <option value="">Select Year</option>
        <option value="first">First</option>
        <option value="second">Second</option>
        <option value="third">Third</option>
        <option value="fourth">Fourth</option>
      </select>
      <br>
      
      <button type="submit">REGISTER</button>
    </form>
  </body>
</html>