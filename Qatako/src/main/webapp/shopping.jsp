<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Qatako-قطعكو – لجميع منتجات وقطع غيار السيارات</title>
	<link href="https://enovathemes.com/mobex/wp-content/cache/autoptimize/css/autoptimize_single_559aad522bf23163fc06b7738f3858a5.css?ver=6.6" rel="stylesheet">
</head>
<body>
	<%@include file="header.jsp" %>
   <div class="container mt-4">
    <nav aria-label="breadcrumb">
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="/">Home</a></li>
            <li class="breadcrumb-item"><a href="/shopping">Shop</a></li>
        </ol>
    </nav>

    <div class="row">
        <!-- Filter Sidebar -->
        <div class="col-12 col-md-3 mb-4">
            <div class="filter-sidebar mb-3">
                <h5 class="widget_title">Shop by Categories</h5>
                <div class="inner-wrap">
	                <ul>
	                    <li><a href="#">Transmission</a></li>
	                    <li><a href="#">Washer system</a></li>
	                </ul>
                </div>
            </div>
            <div class="filter-sidebar mb-3">
                <h5 class="widget_title">Price</h5>
                <div class="inner-wrap">
                    <div class="price-range">
                        <input type="range" min="0" max="420" value="0" class="form-control-range">
                        <input type="range" min="0" max="420" value="420" class="form-control-range">
                    </div>
                    <div class="price-range mt-2 d-flex">
                        <input type="number" min="0" max="420" value="0" class="form-control mr-2">
                        <input type="number" min="0" max="420" value="420" class="form-control">
                    </div>
                </div>
            </div>
            <div class="filter-sidebar mb-3">
                <h5 class="widget_title">Brand</h5>
                <div class="inner-wrap">
                    <ul>
                        <li><input type="checkbox"> 4PLAY</li>
                        <li><input type="checkbox"> Aluminess</li>
                        <li><input type="checkbox"> AMERICAN MODIFIED</li>
                        <li><input type="checkbox"> AST Suspension</li>
                        <li><input type="checkbox"> Attica 4x4</li>
                        <li><input type="checkbox"> AutoMeter</li>
                        <li><input type="checkbox"> BBK Performance Parts</li>
                        <li><input type="checkbox"> Bestop</li>
                        <li><input type="checkbox"> Bilstein</li>
                        <li><input type="checkbox"> BMR Suspension</li>
                    </ul>
                </div>
            </div>
            <div class="filter-sidebar mb-3">
                <h5 class="widget_title">Rating</h5>
                <div class="inner-wrap">
	                <ul>
	                    <li>
	                        <input type="radio" name="rating">
	                        <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i>
	                    </li>
	                    <li>
	                        <input type="radio" name="rating">
	                        <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i>
	                    </li>
	                    <li>
	                        <input type="radio" name="rating">
	                        <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i>
	                    </li>
	                    <li>
	                        <input type="radio" name="rating">
	                        <i class="fa fa-star"></i><i class="fa fa-star"></i>
	                    </li>
	                    <li>
	                        <input type="radio" name="rating">
	                        <i class="fa fa-star"></i>
	                    </li>
	                </ul>
               </div>
            </div>
            <div class="filter-sidebar mb-3">
                <h5 class="widget_title">Condition</h5>
                <div class="inner-wrap">
	                <ul>
	                    <li><input type="radio" name="condition"> New</li>
	                </ul>
                </div>
            </div>
            <button class="btn btn-secondary btn-block">Reset all</button>
        </div>

        <!-- Main Product Details -->
        <div class="col-12 col-md-9">
        	<div class="row">
        		<div class="col-md-12">
        			    <aside class="shop-top-widgets widget-area">
					        <div id="product_vehicle_filter_widget-2" class="widget widget_product_vehicle_filter_widget" >
					            <div class="vehicle-filter-mobile-toggle">Vehicle filter</div>
					            <form:form name="product-vehicle-filter" modelAttribute="home"
					                cssClass="product-vehicle-filter vehicle-filter vin horizontal product-vehicle-filter-970368 active" method="POST" >
					                <div class="atts">
					                    <div class="vf-item make">
											<form:select path="year" id="year" cssClass="select2"  onchange="fetchMake(this.value);">
												<option class="default" value="">Year</option>
									            <c:forEach var="entry" items="${years}">
									                <form:option value="${entry.key}">${entry.value}</form:option>
									            </c:forEach>
									        </form:select>
					                        &nbsp;&nbsp;
					                        &nbsp;&nbsp;
					                        <form:select path="make" id="makeId" cssClass="select2 dropdown">
					                            <option class="default" value="!">Make</option>
									            <c:forEach var="entry" items="${makeList}">
									                <form:option value="${entry.key}">${entry.value}</form:option>
									            </c:forEach>
									        </form:select>
					                    </div>
					                    <div class="vf-item year"></div>
					                    <div class="vf-item model">
					                        <select name="model" id="modelId" class="select2 dropdown">
					                            <option class="default" value="!">Model</option>
					                            <c:forEach var="entry" items="${modelList}">
													<option value="${entry.key}">${entry.value}</option>
									            </c:forEach>
					                        </select>
					                        &nbsp;&nbsp;
					                        &nbsp;&nbsp;
					                        <select name="submodel" id="subModelId" class="select2 dropdown">
					                            <option class="default" value="!">Sub-Model</option>
					                            <c:forEach var="entry" items="${subModelList}">
													<option value="${entry.key}">${entry.value}</option>
									            </c:forEach>
					                        </select>
					                    </div>
					                    <div class="vf-item year"></div>
					                    
					                </div>
					                <div class="last">
					                    <div class="vin"> <span>OR</span> 
					                    		<input type="text" class="vin" value="" placeholder="Search by VIN">
			                    		</div> 
			                    		<input type="button" value="Search">
					                </div> <span class="reset">Reset</span>
					            </form:form>
					        </div>
					    </aside>
        		</div>
        	</div>
            <div class="row">
                <section style="background-color: #eee;">
				  <div class="text-center container py-5">
				    <h4 class="mt-4 mb-5"><strong>Bestsellers</strong></h4>
				
				    <div class="row">
				      <div class="col-lg-4 col-md-12 mb-4">
				        <div class="card">
				          <div class="bg-image hover-zoom ripple ripple-surface ripple-surface-light"
				            data-mdb-ripple-color="light">
				            <img src="https://enovathemes.com/mobex/wp-content/uploads/product-27-img-1-300x300.webp"
				              class="w-100" />
				            <a href="/product">
				              <div class="mask">
				                <div class="d-flex justify-content-start align-items-end h-100">
				                  <h5><span class="badge bg-primary ms-2">New</span></h5>
				                </div>
				              </div>
				              <div class="hover-overlay">
				                <div class="mask" style="background-color: rgba(251, 251, 251, 0.15);"></div>
				              </div>
				            </a>
				          </div>
				          <div class="card-body">
				            <a href="/product" class="text-reset">
				              <h5 class="card-title mb-3">Product name</h5>
				            </a>
				            <a href="/product" class="text-reset">
				              <p>Category</p>
				            </a>
				            <h6 class="mb-3">$61.99</h6>
				          </div>
				        </div>
				      </div>
				
				      <div class="col-lg-4 col-md-6 mb-4">
				        <div class="card">
				          <div class="bg-image hover-zoom ripple ripple-surface ripple-surface-light"
				            data-mdb-ripple-color="light">
				            <img src="https://enovathemes.com/mobex/wp-content/uploads/product-26-img-1-300x300.webp"
				              class="w-100" />
				            <a href="/product">
				              <div class="mask">
				                <div class="d-flex justify-content-start align-items-end h-100">
				                  <h5><span class="badge bg-success ms-2">Eco</span></h5>
				                </div>
				              </div>
				              <div class="hover-overlay">
				                <div class="mask" style="background-color: rgba(251, 251, 251, 0.15);"></div>
				              </div>
				            </a>
				          </div>
				          <div class="card-body">
				            <a href="/product" class="text-reset">
				              <h5 class="card-title mb-3">Product name</h5>
				            </a>
				            <a href="/product" class="text-reset">
				              <p>Category</p>
				            </a>
				            <h6 class="mb-3">$61.99</h6>
				          </div>
				        </div>
				      </div>
				
				      <div class="col-lg-4 col-md-6 mb-4">
				        <div class="card">
				          <div class="bg-image hover-zoom ripple" data-mdb-ripple-color="light">
				            <img src="https://enovathemes.com/mobex/wp-content/uploads/product-56-img-1-300x300.webp"
				              class="w-100" />
				            <a href="/product">
				              <div class="mask">
				                <div class="d-flex justify-content-start align-items-end h-100">
				                  <h5><span class="badge bg-danger ms-2">-10%</span></h5>
				                </div>
				              </div>
				              <div class="hover-overlay">
				                <div class="mask" style="background-color: rgba(251, 251, 251, 0.15);"></div>
				              </div>
				            </a>
				          </div>
				          <div class="card-body">
				            <a href="/product" class="text-reset">
				              <h5 class="card-title mb-3">Product name</h5>
				            </a>
				            <a href="/product" class="text-reset">
				              <p>Category</p>
				            </a>
				            <h6 class="mb-3">
				              <s>$61.99</s><strong class="ms-2 text-danger">$50.99</strong>
				            </h6>
				          </div>
				        </div>
				      </div>
				    </div>
				
				    <div class="row">
				      <div class="col-lg-4 col-md-12 mb-4">
				        <div class="card">
				          <div class="bg-image hover-zoom ripple" data-mdb-ripple-color="light">
				            <img src="https://enovathemes.com/mobex/wp-content/uploads/product-10-img-1-300x300.webp"
				              class="w-100" />
				            <a href="/product">
				              <div class="mask">
				                <div class="d-flex justify-content-start align-items-end h-100">
				                  <h5>
				                    <span class="badge bg-success ms-2">Eco</span><span
				                      class="badge bg-danger ms-2">-10%</span>
				                  </h5>
				                </div>
				              </div>
				              <div class="hover-overlay">
				                <div class="mask" style="background-color: rgba(251, 251, 251, 0.15);"></div>
				              </div>
				            </a>
				          </div>
				          <div class="card-body">
				            <a href="/product" class="text-reset">
				              <h5 class="card-title mb-3">Product name</h5>
				            </a>
				            <a href="/product" class="text-reset">
				              <p>Category</p>
				            </a>
				            <h6 class="mb-3">
				              <s>$61.99</s><strong class="ms-2 text-danger">$50.99</strong>
				            </h6>
				          </div>
				        </div>
				      </div>
				
				      <div class="col-lg-4 col-md-6 mb-4">
				        <div class="card">
				          <div class="bg-image hover-zoom ripple ripple-surface ripple-surface-light"
				            data-mdb-ripple-color="light">
				            <img src="https://enovathemes.com/mobex/wp-content/uploads/product-11-img-1-300x300.webp"
				              class="w-100" />
				            <a href="/product">
				              <div class="mask">
				                <div class="d-flex justify-content-start align-items-end h-100"></div>
				              </div>
				              <div class="hover-overlay">
				                <div class="mask" style="background-color: rgba(251, 251, 251, 0.15);"></div>
				              </div>
				            </a>
				          </div>
				          <div class="card-body">
				            <a href="/product" class="text-reset">
				              <h5 class="card-title mb-3">Product name</h5>
				            </a>
				            <a href="/product" class="text-reset">
				              <p>Category</p>
				            </a>
				            <h6 class="mb-3">$61.99</h6>
				          </div>
				        </div>
				      </div>
				
				      <div class="col-lg-4 col-md-6 mb-4">
				        <div class="card">
				          <div class="bg-image hover-zoom ripple" data-mdb-ripple-color="light">
				            <img src="https://enovathemes.com/mobex/wp-content/uploads/product-16-img-1-300x300.webp"
				              class="w-100" />
				            <a href="/product">
				              <div class="mask">
				                <div class="d-flex justify-content-start align-items-end h-100">
				                  <h5>
				                    <span class="badge bg-primary ms-2">New</span><span
				                      class="badge bg-success ms-2">Eco</span><span class="badge bg-danger ms-2">-10%</span>
				                  </h5>
				                </div>
				              </div>
				              <div class="hover-overlay">
				                <div class="mask" style="background-color: rgba(251, 251, 251, 0.15);"></div>
				              </div>
				            </a>
				          </div>
				          <div class="card-body">
				            <a href="/product" class="text-reset">
				              <h5 class="card-title mb-3">Product name</h5>
				            </a>
				            <a href="/product" class="text-reset">
				              <p>Category</p>
				            </a>
				            <h6 class="mb-3">
				              <s>$61.99</s><strong class="ms-2 text-danger">$50.99</strong>
				            </h6>
				          </div>
				        </div>
				      </div>
				    </div>
				  </div>
				</section>  
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
	$('.select2').select2();
	
    $("#yearId").val('<%=request.getParameter("year")==null?"!":request.getParameter("year")%>').trigger('change');
    $("#makeId").val('<%=request.getParameter("make")==null?"!":request.getParameter("make")%>').trigger('change');
    $("#modelId").val('<%=request.getParameter("model")==null?"!":request.getParameter("model")%>').trigger('change');
    $("#subModelId").val('<%=request.getParameter("subModel")==null?"!":request.getParameter("subModel")%>').trigger('change');
</script>
</body>
</html>
