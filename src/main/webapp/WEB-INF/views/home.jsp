<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

<script type="text/javascript">



/*function LoadNextPageOptions() {
    $.getJSON('/cities', function(data) {
       $.each(data, function (index, value) {
          $("#cities").append('<option value="' + value.value + '">' + value.name + '</option>');
        });

    });
}*/


function LoadNextPageOptions() {
$.ajax({
  url: '/cities',
  type: "GET",
  dataType: 'json',
  success: function(data) {
       $.each(data, function (index, value)
       {
          $("#cities").append('<option value="' + value.value + '">' + value.name + '</option>');
       });
       }
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

<select id="cities">
    <c:forEach items="${biRoles}" var="value">
           <option><c:out value="${value}" /> </option>
     </c:forEach>
 </select>

<select id="departments" >
 <c:forEach items="${hrDepartments}"  var="value">
                 <option><c:out value="${value}" /> </option>
     </c:forEach>
</select>






</body>
</html>