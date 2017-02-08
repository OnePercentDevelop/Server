<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<link rel="apple-touch-icon" sizes="76x76" href="resources/common/dashboard/assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="resources/common/dashboard/img/favicon.png">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

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
					CT
				</a>
			</div>
	    	<div class="sidebar-wrapper">
				<div class="user">
	                <div class="photo">
	                    <img src="resources/common/dashboard/assets/img/faces/face-2.jpg" />
	                </div>
	                <div class="info">
	                    <a data-toggle="collapse" href="#collapseExample" class="collapsed">
	                        Chet Faker
	                        <b class="caret"></b>
	                    </a>
	                    <div class="collapse" id="collapseExample">
	                        <ul class="nav">
	                            <li><a href="#profile">My Profile</a></li>
	                            <li><a href="#edit">Edit Profile</a></li>
	                            <li><a href="#settings">Settings</a></li>
	                        </ul>
	                    </div>
	                </div>
	            </div>
	            <ul class="nav">
					<li>
	                    <a data-toggle="collapse" href="#dashboardOverview">
	                        <i class="ti-panel"></i>
	                        <p>Dashboard
                                <b class="caret"></b>
                            </p>
	                    </a>
                        <div class="collapse" id="dashboardOverview">
							<ul class="nav">
								<li><a href="../dashboard/overview.html">Overview</a></li>
								<li><a href="../dashboard/stats.html">Stats</a></li>
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
	                            <li><a href="../components/buttons.html">Buttons</a></li>
	                            <li><a href="../components/grid.html">Grid System</a></li>
	                            <li><a href="../components/panels.html">Panels</a></li>
	                            <li><a href="../components/sweet-alert.html">Sweet Alert</a></li>
	                            <li><a href="../components/notifications.html">Notifications</a></li>
	                            <li><a href="../components/icons.html">Icons</a></li>
	                            <li><a href="../components/typography.html">Typography</a></li>
	                        </ul>
	                    </div>
	                </li>
	                <li class="active">
						<a data-toggle="collapse" href="#formsExamples" aria-expanded="true">
	                        <i class="ti-clipboard"></i>
	                        <p>
								Forms
	                           <b class="caret"></b>
	                        </p>
	                    </a>
	                    <div class="collapse in" id="formsExamples">
	                        <ul class="nav">
								<li><a href="regular.html">Regular Forms</a></li>
								<li><a href="extended.html">Extended Forms</a></li>
								<li class="active"><a href="validation.html">Validation Forms</a></li>
	                            <li><a href="wizard.html">Wizard</a></li>
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
								<li><a href="../tables/regular.html">Regular Tables</a></li>
								<li><a href="../tables/extended.html">Extended Tables</a></li>
								<li><a href="../tables/bootstrap-table.html">Bootstrap Table</a></li>
								<li><a href="../tables/datatables.net.html">DataTables.net</a></li>
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
	                        <ul class="nav">
								<li><a href="../maps/google.html">Google Maps</a></li>
								<li><a href="../maps/vector.html">Vector maps</a></li>
								<li><a href="../maps/fullscreen.html">Full Screen Map</a></li>
	                        </ul>
	                    </div>
	                </li>
	                <li>
	                    <a href="../charts.html">
	                        <i class="ti-bar-chart-alt"></i>
	                        <p>Charts</p>
	                    </a>
	                </li>
	                <li>
	                    <a href="../calendar.html">
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
	                        <ul class="nav">
								<li><a href="../pages/timeline.html">Timeline Page</a></li>
								<li><a href="../pages/user.html">User Page</a></li>
								<li><a href="../pages/login.html">Login Page</a></li>
								<li><a href="../pages/register.html">Register Page</a></li>
								<li><a href="../pages/lock.html">Lock Screen Page</a></li>
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
	                    <a class="navbar-brand" href="#validationforms">Validation Forms</a>
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

		                <div class="col-md-12">
		                    <div class="card">
		                        <form id="allInputsFormValidation" class="form-horizontal" action="" method="post" novalidate="">
		                            <div class="content">
		                                <h4 class="title">질문지 생성</h4>
		                                <fieldset>
		                                    <div class="form-group">
		                                        <label class="col-sm-2 control-label">
													날짜
												</label>
		                                        <div class="col-sm-6">
		                                            <input class="form-control"
		                                                   type="text"
		                                                   name="required"
		                                                   required="required"
		                                                   placeHolder = "예)2017.02.08"
													/>
		                                        </div>
		                                        <div class="col-sm-4"><code>예)2017.02.08</code></div>
		                                    </div>
		                                </fieldset>
		                                
		                                <fieldset>
		                                    <div class="form-group">
		                                        <label class="col-sm-2 control-label">
													질문
												</label>
		                                        <div class="col-sm-6">
		                                            <input class="form-control"
		                                                   type="text"
		                                                   name="required1"
		                                                   required="required"
		                                                   placeHolder = "예)다음 중 가장 좋아하는 음식은?"
													/>
		                                        </div>
		                                        <div class="col-sm-4"><code>예)다음 중 가장 좋아하는 음식은?</code></div>
		                                    </div>
		                                </fieldset>

										<fieldset>
		                                    <div class="form-group">
		                                        <label class="col-sm-2 control-label">
													보기 1번 
												</label>
		                                        <div class="col-sm-6">
		                                            <input class="form-control"
		                                                   type="text"
		                                                   name="ex1"
		                                                   required="required"
		                                                   placeHolder = "예)김치찌개"
													/>
		                                        </div>
		                                        <div class="col-sm-4"><code>예)김치찌개</code></div>
		                                    </div>
		                                </fieldset>
		                                
		                                <fieldset>
		                                    <div class="form-group">
		                                        <label class="col-sm-2 control-label">
													보기 2번
												</label>
		                                        <div class="col-sm-6">
		                                            <input class="form-control"
		                                                   type="text"
		                                                   name="ex2"
		                                                   required="required"
		                                                   placeHolder = "예)된장찌개"
													/>
		                                        </div>
		                                        <div class="col-sm-4"><code>예)된장찌개</code></div>
		                                    </div>
		                                </fieldset>
		                                
		                                <fieldset>
		                                    <div class="form-group">
		                                        <label class="col-sm-2 control-label">
													보기 3번
												</label>
		                                        <div class="col-sm-6">
		                                            <input class="form-control"
		                                                   type="text"
		                                                   name="ex3"
		                                                   required="required"
		                                                   placeHolder = "예)부대찌개"
													/>
		                                        </div>
		                                        <div class="col-sm-4"><code>예)부대찌개</code></div>
		                                    </div>
		                                </fieldset>
		                                
		                                <fieldset>
		                                    <div class="form-group">
		                                        <label class="col-sm-2 control-label">
													보기 4번
												</label>
		                                        <div class="col-sm-6">
		                                            <input class="form-control"
		                                                   type="text"
		                                                   name="ex4"
		                                                   required="required"
		                                                   placeHolder = "예)순두부찌개"
													/>
		                                        </div>
		                                        <div class="col-sm-4"><code>예)순두부찌개</code></div>
		                                    </div>
		                                </fieldset>

									<div class="card-footer text-center">
										<button type="submit" class="btn btn-info btn-fill">질문지 등록</button>
									</div>
		  						</form>
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

	<!--  Forms Validations Plugin -->
	<script src="resources/common/dashboard/assets/js/jquery.validate.min.js?ver=2" charset="utf-8"></script>

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

	<!-- Wizard Plugin    -->
	<script src="resources/common/dashboard/assets/js/jquery.bootstrap.wizard.min.js"></script>

	<!--  Bootstrap Table Plugin    -->
	<script src="resources/common/dashboard/assets/js/bootstrap-table.js"></script>

	<!--  Plugin for DataTables.net  -->
	<script src="resources/common/dashboard/assets/js/jquery.datatables.js"></script>

	<!--  Full Calendar Plugin    -->
	<script src="resources/common/dashboard/assets/js/fullcalendar.min.js"></script>

	<!-- Paper Dashboard PRO Core javascript and methods for Demo purpose -->
	<script src="resources/common/dashboard/assets/js/paper-dashboard.js"></script>

	<!-- Paper Dashboard PRO DEMO methods, don't include it in your project! -->
	<script src="resources/common/dashboard/assets/js/demo.js"></script>

    <script type="text/javascript">
        $().ready(function(){
			$('#registerFormValidation').validate();
            $('#loginFormValidation').validate();
            $('#allInputsFormValidation').validate();
        });
    </script>

</html>