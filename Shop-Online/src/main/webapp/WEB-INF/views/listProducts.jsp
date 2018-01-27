<div class="container">
	<div class="row">
		<!-- would be to display sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<!-- To display the actual product -->
		<div class="col-md-9">
			<!-- Added breadcrumb component -->
			<div class="row">
				<div class="col-lg-12">

					<c:if test="${userClickAllProducts == true }">

						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a> /&nbsp;</li>
							<li class="active">View Products</li>
						</ol>

					</c:if>
					
					<c:if test="${userClickCategoryProduct == true }">

						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a> /&nbsp;</li>
							<li class="active">Category /&nbsp;</li>
							<li class="active">${category.name}</li>
						</ol>

					</c:if>
				</div>
			</div>
		</div>
	</div>
</div>