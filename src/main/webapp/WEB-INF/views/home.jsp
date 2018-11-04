<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
var page = 0;
var pageSize = 100;
var phrase = null;

function callEndpoint() {
    $.getJSON('/cities?pageSize='+ pageSize +'&page='+ page, function(data) {
       $.each(data, function (index, value) {

                           $('#cities').append('<option value="' + value + '">' + value + '</option>');
                       });
    });
}

function resetCitiesPage(){
   page = 0;
   pageSize = 100;
}

callEndpoint();
</script>
</head>
<body>
<select id="cities"/>


</body>
</html>