<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="EUC-KR" />
	<link rel="apple-touch-icon" sizes="76x76" href="resources/common/dashboard/assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="resources/common/dashboard/assets/img/favicon.png">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

	<title>Paper Dashboard PRO by Creative Tim</title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />


     <!-- Bootstrap core CSS     -->
    <link href="resources/common/dashboard/assets/css/bootstrap.min.css" rel="stylesheet" />

    <!--  Paper Dashboard core CSS    -->
    <link href="resources/common/dashboard/assets/css/paper-dashboard.css" rel="stylesheet"/>


    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="resources/common/dashboard/assets/css/demo.css" rel="stylesheet" />


    <!--  Fonts and icons     -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Muli:400,300' rel='stylesheet' type='text/css'>
    <link href="resources/common/dashboard/assets/css/themify-icons.css" rel="stylesheet">
</head>

<body>
<input type='hidden' id='vote_date' name='vote_date' value='2016��11��03��'>
	<div class="wrapper">
	    <div class="sidebar" data-background-color="brown" data-active-color="danger">
	    <!--
			Tip 1: you can change the color of the sidebar's background using: data-background-color="white | brown"
			Tip 2: you can change the color of the active button using the data-active-color="primary | info | success | warning | danger"
		-->
			<div class="logo">
				<a href="http://www.creative-tim.com" class="simple-text">
					Creative Tim
				</a>
			</div>
			<div class="logo logo-mini">
				<a href="http://www.creative-tim.com" class="simple-text">
					Ct
				</a>
			</div>
	    	<div class="sidebar-wrapper">
				<div class="user">
	                <div class="photo">
	                    <img src="resources/common/dashboard/assets/img/faces/moonsu.png" />
	                </div>
	                <div class="info">
	                    <a data-toggle="collapse" href="#collapseExample" class="collapsed">
	                        	�� �� ��
	                        <b class="caret"></b>
	                    </a>
	                    <div class="collapse" id="collapseExample">
	                        <ul class="nav">
	                            <li><a href="#profile">My Profile</a></li>
	                            <li><a href="#editprofile">Edit Profile</a></li>
	                            <li><a href="#settings">Settings</a></li>
	                        </ul>
	                    </div>
	                </div>
	            </div>
	            <ul class="nav">
	                <li class="active">
	                    <a data-toggle="collapse" href="#dashboardOverview" aria-expanded="true">
	                        <i class="ti-panel"></i>
	                        <p>Dashboard
                                <b class="caret"></b>
                            </p>
	                    </a>
                        <div class="collapse in" id="dashboardOverview">
							<ul class="nav">
								<li class="active"><a href="overview.html">Overview</a></li>
								<li><a href="stats.html">Stats</a></li>
							</ul>
						</div>
	                </li>
					<li>
						<a data-toggle="collapse" href="#componentsExamples">
							<i class="ti-package"></i>
							<p>Components
							   <b class="caret"></b>
							</p>
						</a>
						<div class="collapse" id="componentsExamples">
							<ul class="nav">
								<li><a href="resources/common/dashboard/examples/components/buttons.html">Buttons</a></li>
								<li><a href="resources/common/dashboard/examples/components/grid.html">Grid System</a></li>
								<li><a href="resources/common/dashboard/examples/components/panels.html">Panels</a></li>
								<li><a href="resources/common/dashboard/examples/components/sweet-alert.html">Sweet Alert</a></li>
								<li><a href="resources/common/dashboard/examples/components/notifications.html">Notifications</a></li>
								<li><a href="resources/common/dashboard/examples/components/icons.html">Icons</a></li>
								<li><a href="resources/common/dashboard/examples/components/typography.html">Typography</a></li>
							</ul>
						</div>
					</li>
					<li>
						<a data-toggle="collapse" href="#formsExamples">
	                        <i class="ti-clipboard"></i>
	                        <p>
								Forms
	                           <b class="caret"></b>
	                        </p>
	                    </a>
	                    <div class="collapse" id="formsExamples">
	                        <ul class="nav">
								<li><a href="resources/common/dashboard/examples/forms/regular.html">Regular Forms</a></li>
								<li><a href="resources/common/dashboard/examples/forms/extended.html">Extended Forms</a></li>
								<li><a href="resources/common/dashboard/examples/forms/validation.html">Validation Forms</a></li>
	                            <li><a href="resources/common/dashboard/examples/forms/wizard.html">Wizard</a></li>
	                        </ul>
	                    </div>
	                </li>
	                <li>
						<a data-toggle="collapse" href="#tablesExamples">
	                        <i class="ti-view-list-alt"></i>
	                        <p>
								Table list
	                           <b class="caret"></b>
	                        </p>
	                    </a>
	                    <div class="collapse" id="tablesExamples">
	                        <ul class="nav">
								<li><a href="resources/common/dashboard/examples/tables/regular.html">Regular Tables</a></li>
								<li><a href="resources/common/dashboard/examples/tables/extended.html">Extended Tables</a></li>
								<li><a href="resources/common/dashboard/examples/tables/bootstrap-table.html">Bootstrap Table</a></li>
								<li><a href="resources/common/dashboard/examples/tables/datatables.net.html">DataTables.net</a></li>
	                        </ul>
	                    </div>
	                </li>
					<li>
						<a data-toggle="collapse" href="#mapsExamples">
	                        <i class="ti-map"></i>
	                        <p>
								Maps
	                           <b class="caret"></b>
	                        </p>
	                    </a>
	                    <div class="collapse" id="mapsExamples">
	                        <ul class="nav-second-level nav">
								<li><a href="resources/common/dashboard/examples/maps/google.html">Google Maps</a></li>
								<li><a href="resources/common/dashboard/examples/maps/vector.html">Vector Maps</a></li>
								<li><a href="resources/common/dashboard/examples/maps/fullscreen.html">Full Screen Map</a></li>
	                        </ul>
	                    </div>
	                </li>
					<li>
	                    <a href="resources/common/dashboard/examples/charts.html">
	                        <i class="ti-bar-chart-alt"></i>
	                        <p>Charts</p>
	                    </a>
	                </li>
					<li>
	                    <a href="resources/common/dashboard/examples/calendar.html">
	                        <i class="ti-calendar"></i>
	                        <p>Calendar</p>
	                    </a>
	                </li>
					<li>
						<a data-toggle="collapse" href="#pagesExamples">
	                        <i class="ti-gift"></i>
	                        <p>
								Pages
	                           <b class="caret"></b>
	                        </p>
	                    </a>
	                    <div class="collapse" id="pagesExamples">
	                        <ul class="nav-second-level nav">
								<li><a href="resources/common/dashboard/examples/pages/timeline.html">Timeline Page</a></li>
								<li><a href="resources/common/dashboard/examples/pages/user.html">User Page</a></li>
								<li><a href="resources/common/dashboard/examples/pages/login.html">Login Page</a></li>
								<li><a href="resources/common/dashboard/examples/pages/register.html">Register Page</a></li>
								<li><a href="resources/common/dashboard/examples/pages/lock.html">Lock Screen Page</a></li>
	                        </ul>
	                    </div>
	                </li>
	            </ul>
	    	</div>
	    </div>

	    <div class="main-panel">
			<nav class="navbar navbar-default">
	            <div class="container-fluid">
					<div class="navbar-minimize">
						<button id="minimizeSidebar" class="btn btn-fill btn-icon"><i class="ti-more-alt"></i></button>
					</div>
	                <div class="navbar-header">
	                    <button type="button" class="navbar-toggle">
	                        <span class="sr-only">Toggle navigation</span>
	                        <span class="icon-bar bar1"></span>
	                        <span class="icon-bar bar2"></span>
	                        <span class="icon-bar bar3"></span>
	                    </button>
	                    <a class="navbar-brand" href="#Dashboard">
							Overview
						</a>
	                </div>
	                <div class="collapse navbar-collapse">

						<form class="navbar-form navbar-left navbar-search-form" role="search">
	    					<div class="input-group">
	    						<span class="input-group-addon"><i class="fa fa-search"></i></span>
	    						<input type="text" value="" class="form-control" placeholder="Search...">
	    					</div>
	    				</form>

	                    <ul class="nav navbar-nav navbar-right">
	                        <li>
	                            <a href="#stats" class="dropdown-toggle btn-magnify" data-toggle="dropdown">
	                                <i class="ti-panel"></i>
									<p>Stats</p>
	                            </a>
	                        </li>
	                        <li class="dropdown">
	                            <a href="#notifications" class="dropdown-toggle btn-rotate" data-toggle="dropdown">
	                                <i class="ti-bell"></i>
	                                <span class="notification">5</span>
									<p class="hidden-md hidden-lg">
										Notifications
										<b class="caret"></b>
									</p>
	                            </a>
	                            <ul class="dropdown-menu">
	                                <li><a href="#not1">Notification 1</a></li>
	                                <li><a href="#not2">Notification 2</a></li>
	                                <li><a href="#not3">Notification 3</a></li>
	                                <li><a href="#not4">Notification 4</a></li>
	                                <li><a href="#another">Another notification</a></li>
	                            </ul>
	                        </li>
							<li>
	                            <a href="#settings" class="btn-rotate">
									<i class="ti-settings"></i>
									<p class="hidden-md hidden-lg">
										Settings
									</p>
	                            </a>
	                        </li>
	                    </ul>
	                </div>
	            </div>
	        </nav>

	        <div class="content">
	            <div class="container-fluid">
	                <div class="row">
	                    <div class="col-lg-3 col-sm-6">
	                        <div class="card">
	                            <div class="content">
	                                <div class="row">
	                                    <div class="col-xs-5">
	                                        <div class="icon-big icon-warning text-center">
	                                            <i class="ti-server"></i>
	                                        </div>
	                                    </div>
	                                    <div class="col-xs-7">
	                                        <div class="numbers">
	                                            <p>ȸ�� ��</p>
	                                            1000
	                                        </div>
	                                    </div>
	                                </div>
	                            </div>
								<div class="card-footer">
									<hr />
									<div class="stats">
										<i class="ti-reload"></i> Updated now
									</div>
								</div>
	                        </div>
	                    </div>
	                    <div class="col-lg-3 col-sm-6">
	                        <div class="card">
	                            <div class="content">
	                                <div class="row">
	                                    <div class="col-xs-5">
	                                        <div class="icon-big icon-success text-center">
	                                            <i class="ti-wallet"></i>
	                                        </div>
	                                    </div>
	                                    <div class="col-xs-7">
	                                        <div class="numbers">
	                                            <p>��ǥ�� ��</p>
	                                            ${result[0].number}
	                                        </div>
	                                    </div>
	                                </div>
	                            </div>
								<div class="card-footer">
									<hr />
									<div class="stats">
										<i class="ti-calendar"></i> Last day
									</div>
								</div>
	                        </div>
	                    </div>
	                    <div class="col-lg-3 col-sm-6">
	                        <div class="card">
	                            <div class="content">
	                                <div class="row">
	                                    <div class="col-xs-5">
	                                        <div class="icon-big icon-danger text-center">
	                                            <i class="ti-pulse"></i>
	                                        </div>
	                                    </div>
	                                    <div class="col-xs-7">
	                                        <div class="numbers">
	                                            <p>��÷�� ��</p>
	                                            1
	                                        </div>
	                                    </div>
	                                </div>
	                            </div>
								<div class="card-footer">
									<hr />
									<div class="stats">
										<i class="ti-timer"></i> In the last hour
									</div>
								</div>
	                        </div>
	                    </div>
	                    <div class="col-lg-3 col-sm-6">
	                        <div class="card">
	                            <div class="content">
	                                <div class="row">
	                                    <div class="col-xs-5">
	                                        <div class="icon-big icon-info text-center">
	                                            <i class="ti-twitter-alt"></i>
	                                        </div>
	                                    </div>
	                                    <div class="col-xs-7">
	                                        <div class="numbers">
	                                            <p>��� D +</p>
	                                            150
	                                        </div>
	                                    </div>
	                                </div>
	                            </div>
								<div class="card-footer">
									<hr />
									<div class="stats">
										<i class="ti-reload"></i> Updated now
									</div>
								</div>
	                        </div>
	                    </div>
	                </div>
					<div class="row">
						<div class="col-lg-4 col-sm-6">
							<div class="card">
								<div class="content">
									<div class="row">
										<div class="col-xs-7">
											<div class="numbers pull-left">
												100
											</div>
										</div>
										<div class="col-xs-5">
											<div class="pull-right">
												<span class="label label-success">
		 											+18%
												</span>
											</div>
										</div>
									</div>
									<h6 class="big-title">������ ��<span class="text-muted"></span>ȸ������ ��<span class="text-muted"></span></h6>
		                            <div id="chartTotalEarnings"></div>
								</div>
								<div class="card-footer">
									<hr>
									<div class="footer-title">Financial Statistics</div>
									<div class="pull-right">
										<button class="btn btn-info btn-fill btn-icon btn-sm">
											<i class="ti-plus"></i>
										</button>
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-sm-6">
							<div class="card">
								<div class="content">
									<div class="row">
										<div class="col-xs-7">
											<div class="numbers pull-left">
												169
											</div>
										</div>
										<div class="col-xs-5">
											<div class="pull-right">
												<span class="label label-danger">
		 											-14%
												</span>
											</div>
										</div>
									</div>
									<h6 class="big-title">total subscriptions <span class="text-muted">in last</span> 7 days</h6>
		                            <div id="chartTotalSubscriptions"></div>
								</div>
								<div class="card-footer">
									<hr>
									<div class="footer-title">View all members</div>
									<div class="pull-right">
										<button class="btn btn-default btn-fill btn-icon btn-sm">
											<i class="ti-angle-right"></i>
										</button>
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-4 col-sm-6">
							<div class="card">
								<div class="content">
									<div class="row">
										<div class="col-xs-7">
											<div class="numbers pull-left">
												8,960
											</div>
										</div>
										<div class="col-xs-5">
											<div class="pull-right">
												<span class="label label-warning">
		 											~51%
												</span>
											</div>
										</div>
									</div>
									<h6 class="big-title">total downloads <span class="text-muted">in last</span> 6 years</h6>
		                            <div id="chartTotalDownloads" ></div>
								</div>
								<div class="card-footer">
									<hr>
									<div class="footer-title">View more details</div>
									<div class="pull-right">
										<button class="btn btn-success btn-fill btn-icon btn-sm">
											<i class="ti-info"></i>
										</button>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-3 col-sm-6">
							<div class="card card-circle-chart" data-background="color" data-color="blue">
								<div class="header text-center">
	                                <h5 class="title">Dashboard</h5>
	                                <p class="description">Monthly sales target</p>
	                            </div>
								<div class="content">
									<div id="chartDashboard" class="chart-circle" data-percent="70">70%</div>
								</div>
							</div>
						</div>
						<div class="col-lg-3 col-sm-6">
							<div class="card card-circle-chart" data-background="color" data-color="green">
								<div class="header text-center">
	                                <h5 class="title">Orders</h5>
	                                <p class="description">Completed</p>
	                            </div>
								<div class="content">
									<div id="chartOrders" class="chart-circle" data-percent="34">34%</div>
								</div>
							</div>
						</div>
						<div class="col-lg-3 col-sm-6">
							<div class="card card-circle-chart" data-background="color" data-color="orange">
								<div class="header text-center">
	                                <h5 class="title">New Visitors</h5>
	                                <p class="description">Out of total number</p>
	                            </div>
								<div class="content">
									<div id="chartNewVisitors" class="chart-circle" data-percent="62">62%</div>
								</div>
							</div>
						</div>
						<div class="col-lg-3 col-sm-6">
							<div class="card card-circle-chart" data-background="color" data-color="brown">
								<div class="header text-center">
	                                <h5 class="title">Subscriptions</h5>
	                                <p class="description">Monthly newsletter</p>
	                            </div>
								<div class="content">
									<div id="chartSubscriptions" class="chart-circle" data-percent="10">10%</div>
								</div>
							</div>
						</div>
					</div>
                </div>
	        </div>
            <footer class="footer">
                <div class="container-fluid">
                    <nav class="pull-left">
                        <ul>
                            <li>
                                <a href="http://www.creative-tim.com">
                                    Creative Tim
                                </a>
                            </li>
                            <li>
                                <a href="http://blog.creative-tim.com">
                                   Blog
                                </a>
                            </li>
                            <li>
                                <a href="http://www.creative-tim.com/license">
                                    Licenses
                                </a>
                            </li>
                        </ul>
                    </nav>
                    <div class="copyright pull-right">
                        &copy; <script>document.write(new Date().getFullYear())</script>, made with <i class="fa fa-heart heart"></i> by <a href="http://www.creative-tim.com">Creative Tim</a>
                    </div>
                </div>
            </footer>
	    </div>
	</div>
</body>

    <!--   Core JS Files. Extra: PerfectScrollbar + TouchPunch libraries inside jquery-ui.min.js   -->
    <script src="resources/common/dashboard/assets/js/jquery-1.10.2.js" type="text/javascript"></script>
	<script src="resources/common/dashboard/assets/js/jquery-ui.min.js" type="text/javascript"></script>
	<script src="resources/common/dashboard/assets/js/bootstrap.min.js" type="text/javascript"></script>
<script src="http://code.jquery.com/jquery-1.7.js"></script>
	<!--  Forms Validations Plugin -->
	<script src="resources/common/dashboard/assets/js/jquery.validate.min.js"></script>

	<!--  Plugin for Date Time Picker and Full Calendar Plugin-->
	<script src="resources/common/dashboard/assets/js/moment.min.js"></script>

    <!--  Date Time Picker Plugin is included in this js file -->
    <script src="resources/common/dashboard/assets/js/bootstrap-datetimepicker.js"></script>

    <!--  Select Picker Plugin -->
    <script src="resources/common/dashboard/assets/js/bootstrap-selectpicker.js"></script>

	<!--  Checkbox, Radio, Switch and Tags Input Plugins -->
	<script src="resources/common/dashboard/assets/js/bootstrap-checkbox-radio-switch-tags.js"></script>

	<!-- Circle Percentage-chart -->
	<script src="resources/common/dashboard/assets/js/jquery.easypiechart.min.js"></script>

	<!--  Charts Plugin -->
	<script src="resources/common/dashboard/assets/js/chartist.min.js"></script>
 
    <!--  Notifications Plugin    -->
    <script src="resources/common/dashboard/assets/js/bootstrap-notify.js"></script>

    <!-- Sweet Alert 2 plugin -->
	<script src="resources/common/dashboard/assets/js/sweetalert2.js"></script>

    <!-- Vector Map plugin -->
	<script src="resources/common/dashboard/assets/js/jquery-jvectormap.js"></script>

    <!--  Google Maps Plugin    -->
    <script src="https://maps.googleapis.com/maps/api/js"></script>

	<!-- Wizard Plugin    -->
    <script src="resources/common/dashboard/assets/js/jquery.bootstrap.wizard.min.js"></script>

    <!--  Bootstrap Table Plugin    -->
    <script src="resources/common/dashboard/assets/js/bootstrap-table.js"></script>

    <!--  Full Calendar Plugin    -->
    <script src="resources/common/dashboard/assets/js/fullcalendar.min.js"></script>

    <!-- Paper Dashboard PRO Core javascript and methods for Demo purpose -->
	<script src="resources/common/dashboard/assets/js/paper-dashboard.js"></script>

    <!-- Paper Dashboard PRO DEMO methods, don't include it in your project! -->
	<script src="resources/common/dashboard/assets/js/demo.js"></script>

	<script type="text/javascript">
    	$(document).ready(function(){
			demo.initOverviewDashboard();
			demo.initCirclePercentage();
			demo.initTest();
    	});
	</script>

</html>