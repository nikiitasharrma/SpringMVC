<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

</head>
<body>
	<h1>Upload file here!</h1>

	<form action="processupload" method="post" enctype="multipart/form-data">
		<div class="form-group">
			<label for="exampleFormControlFile1">File input</label> 
			<input
				type="file" name=img class="form-control-file" id="exampleFormControlFile1">
		</div>
		<button type="submit" class="btn btn-primary">Upload</button>
	</form>

</body>
</html>