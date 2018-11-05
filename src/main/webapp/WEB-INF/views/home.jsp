<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

<script type="text/javascript">



function LoadNextPageOptions() {
    $.getJSON('/cities', function(data) {
       $.each(data, function (index, value) {
          $("#cities").append('<option value="' + value.value + '">' + value.name + '</option>');
        });

    });
}

function LoadNextDepartment() {
    $.getJSON('/department?userId=1', function(data) {
       $.each(data, function (index, value) {
          $("#departments").append('<option value="' + value + '">' + value + '</option>');
        });

    });
}
LoadNextDepartment();
for(var i=0; i<1; i++){
LoadNextPageOptions(i);
}
</script>

</head>
<body>
<p>Page: <span id="page"></span>
  </p>

  <p>scrollTop: <span id="scrollTop"></span>
  </p>
  <p>totalheight: <span id="totalheight"></span>
  </p>
<select id="cities"> </select>
<select id="departments" >
</select>






</body>
</html>