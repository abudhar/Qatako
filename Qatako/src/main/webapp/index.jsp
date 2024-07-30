<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Qatako-قطعكو – لجميع منتجات وقطع غيار السيارات</title>
    <link href="https://enovathemes.com/mobex/wp-content/cache/autoptimize/css/autoptimize_single_559aad522bf23163fc06b7738f3858a5.css?ver=6.6" rel="stylesheet">
</head>
<body>
	<script type="text/javascript">var aptPath = '<%= request.getContextPath() %>'</script> 
	<%@include file="header.jsp" %>
    <!-- Background Carousel -->
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12 align-centre">
				<div class="elementor-widget-container">
					<div class="et-vehicle-filter breakpoint-767 breakpoint-768-1023">
						<div class="widget widget_product_vehicle_filter_widget">
							<div class="vehicle-filter-mobile-toggle">Vehicle filter</div>
							<form name="product-vehicle-filter" action="${pageContext.request.contextPath}/shopping" method="post"
								class="product-vehicle-filter vehicle-filter title-active vin vertical product-vehicle-filter-653931 active"
								data-rem="true" data-count="2" method="POST">
								<h5 style="text-align: left">Select your car</h5>
								<br>
								<div class="atts">
									<div class="vf-item year">
										<select name="year" id="yearId" class="select2" onchange="fetchMake(this.value);">
											<option class="default" value="">Year</option>
											<c:forEach var="entry" items="${years}">
												<option value="${entry.key}">${entry.value}</option>
								            </c:forEach>
										</select>
									</div>
									<div class="vf-item make" data-attribute="make" data-label="Make">
										<select name="make" class="select2" id="makeId" onchange="fetchModel(this.value);">
											<option class="default" value="">Make</option>
										</select>
									</div>
									<div class="vf-item model">
										<select name="model" class="select2" onchange="fetchSubModel(this.value);" id="modelId">
											<option class="default" value="" >Model</option>
										</select>
									</div>

									<div class="vf-item engine">
										<select name="subModel" class="select2" onchange="this.form.submit();" id="subModelId">
											<option class="default" value="">Sub-Model</option>
										</select>
									</div>
								</div>
								<div class="last">
									<div class="vin">
										<span>OR</span> <input type="text" class="vin" value="" id="vinInput"
											placeholder="Search by VIN">
									</div>
									<input type="button" value="Search" onclick="fetchVin();">
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>	
		<div class="row">
			<div class="col-md-12">
			    <section id="bg-carousel">
			        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
			            <div class="carousel-inner">
			                <div class="carousel-item active">
			                    <img src="https://htmldemo.net/tromic/tromic/assets/images/slider/bg/1-1.jpg" class="d-block w-100" alt="Cars">
			                </div>
			                <div class="carousel-item">
			                    <img src="https://htmldemo.net/tromic/tromic/assets/images/slider/bg/1-2.jpg" class="d-block w-100" alt="Cars">
			                </div>
			                <div class="text-center carousel-top">
			                    <div class="w-100">
			                        <h3 class="text-white font-weight-bold">CAR PARTS & ACCESSORIES</h3>
			                        <p>Customize, Modify, Upgrade, Repair, Replace</p>
			                    </div>
			
			                </div>
			            </div>
			        </div>
			    </section>
			</div>		
		</div>
    </div>
    <!-- Featured Make -->
    <div class="container align-centre">
        <h4 class="my-4 text-left">Featured manufacturers</h4>
        <div class="row">
            <c:forEach var="logo" items="${logoNames}">
                <div class="col-6 col-sm-4 col-md-3 col-lg-2 manufacturer-card">
                    <a href="/shopping?make=${logo.toLowerCase()}">
                        <img src="/images/logos/${logo}.png" alt="${logo}">
                        <div>${logo.toUpperCase()}</div>
                    </a>
                </div>
            </c:forEach>
        </div>
    </div>
    <!-- Featured Make  -->
    <!-- Double Card Carousel -->


    <section id="dbl-card-carousel">
        <div class="container">
            <h3 class=" text-center text-danger "> Features And Service</h3>
            <div class="row">

                <div id="carouselExampleSlidesOnly" class="carousel slide w-100 mt-5" data-ride="carousel">
                    <ol class="carousel-indicators text-dark">
                        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active bg-danger"></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <div class="row">
                                <div class="col-md-6 col-6">
                                    <div class="card">
                                        <img class="img-fluid" src="images/torxe_0dbl.jpg">
                                    </div>
                                </div>
                                <div class="col-md-6 col-6">
                                    <div class="card">
                                        <img class="img-fluid" src="images/torxe_0dbl.jpg">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="row">

                                <div class="col-md-6 col-6">
                                    <div class="card">
                                        <img class="img-fluid" src="images/torxe_0dbl.jpg">
                                    </div>
                                </div>
                                <div class="col-md-6 col-6">
                                    <div class="card">
                                        <img class="img-fluid" src="images/spyder-headlights_0dbl.jpg">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="row">

                                <div class="col-md-6 col-6">
                                    <div class="card">
                                        <img class="img-fluid" src="images/torxe_0dbl.jpg">
                                    </div>
                                </div>
                                <div class="col-md-6 col-6">
                                    <div class="card">
                                        <img class="img-fluid" src="images/spyder-headlights_0dbl.jpg">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <a class="carousel-control-prev text-dark" href="#carouselExampleSlidesOnly" role="button"
                        data-slide="prev">
                        <span class="" aria-hidden="true"><i class="fas fa-angle-left fa-2x"></i></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next text-dark" href="#carouselExampleSlidesOnly" role="button"
                        data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"><i
                                class="fas fa-angle-right fa-2x"></i></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>

            </div>
        </div>

    </section>
    <!-- Footer -->
    <footer>
        <div class="pt-1 ">
            <div class="container-fluid my-5">
                <div class="row">
                    <div class="col-lg-3 col-md-4 col-sm-6 col-6">
                        <button class="btn btn-outline-secondary btn-block">Subscribe to Our NewsLetter</button>
                        <p class="mt-3">to stay up-to-date on our promotions, discounts, sales, special offers and more.
                        </p>
                        <p class="social_icon">
                            <a><i class="fab fa-facebook-f"></i></a>
                            <a><i class="fab fa-instagram"></i></a>
                            <a><i class="fab fa-twitter"></i></a>
                            <a><i class="fab fa-pinterest-p"></i></a>
                            <a><i class="fab fa-linkedin-in"></i></a>
                        </p>
                    </div>
                    <div class="col-lg-3 col-md-4 col-sm-6 col-6 text-sm-right">
                        <h3>Service</h3>
                        <ul>
                            <li> <a href="#"> Help Center</a></li>
                            <li><a href="#">My Account</a> </li>
                            <li><a href="#">Track Order</a></li>
                            <li><a href="#">Return Policy</a></li>
                            <li><a href="#">Price Match</a></li>
                            <li><a href="#">Gifts Card</a></li>
                            <li><a href="#">Contact Us</a></li>
                        </ul>
                    </div>
                    <div class="col-lg-3 col-md-4 col-sm-6 col-6">
                        <h3>Information</h3>
                        <ul>
                            <li> <a href="#"> Help Center</a></li>
                            <li><a href="#">My Account</a> </li>
                            <li><a href="#">Track Order</a></li>
                            <li><a href="#">Return Policy</a></li>
                            <li><a href="#">Price Match</a></li>
                            <li><a href="#">Gifts Card</a></li>
                            <li><a href="#">Contact Us</a></li>
                        </ul>
                    </div>
                    <div class="col-lg-3 col-md-4 col-sm-6 col-6 text-sm-right">
                        <h3>Contact Us</h3>
                        <ul>
                            <li> <a href="#"> Help Center</a></li>
                            <li><a href="#">My Account</a> </li>
                            <li><a href="#">Track Order</a></li>
                            <li><a href="#">Return Policy</a></li>
                            <li><a href="#">Price Match</a></li>
                            <li><a href="#">Gifts Card</a></li>
                            <li><a href="#">Contact Us</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class=" bg-dark py-4" id="copyright-footer">
                <span class="text-secondary pl-3 mb-0">Copyright Â© 2003-2021 qatako.com. All rights reserved.</span>
                <span class=" float-right px-3">
                    <a href="#">privacy policy</a>
                    <a href="#">sitemap</a>
                </span>
            </div>
        </div>
    </footer>
	<div id="overlay"><div class="cv-spinner"><span class="spinner"></span></div></div>

</body>
<script type="text/javascript">
	$('.select2').select2();
</script>

</html>