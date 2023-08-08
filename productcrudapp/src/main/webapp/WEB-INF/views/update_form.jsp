<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3" style="color: red;">
				<h1 class="text-center mb-3">Update Product Details</h1>
				<form action="${pageContext.request.contextPath}/handle-product"
					method="post" style="color: blue;">
					<div class="form-group">
						<label for="id">Product ID</label> <input class="form-control"
							value="${product.id }" name="id" readonly>
					</div>

					<div class="form-group">
						<label for="name">Product Name</label> <input type="text"
							class="form-control" id="name" aria-describedby="productname"
							placeholder="Enter Product Name" name="name"
							value=${product.name } required>
					</div>
					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea class="form-control" id="description" rows="5"
							placeholder="Enter Product Description" name="description"
							required>${product.description }</textarea>
					</div>
					<div class="form-group">
						<label for="price">Product Price</label> <input type="text"
							class="form-control" id="price" placeholder="Enter Product Price"
							name="price" value=${product.price } required>
					</div>
					<div class="container text-center">
						<a href="${pageContext.request.contextPath }/home"
							class="btn btn-outline-danger"> Back </a>
						<button type="submit" class="btn btn-primary">Update</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>