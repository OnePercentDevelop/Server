<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8" />
<link rel="apple-touch-icon" sizes="76x76"
	href="resources/common/dashboard/assets/img/apple-icon.png">
<link rel="icon" type="image/png" sizes="96x96"
	href="resources/common/dashboard/img/favicon.png">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>1Percent 질문지 만들기</title>

<meta
	content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0'
	name='viewport' />
<meta name="viewport" content="width=device-width" />


<!-- Bootstrap core CSS     -->
<link href="resources/common/dashboard/assets/css/bootstrap.min.css"
	rel="stylesheet" />

<!--  Paper Dashboard core CSS    -->
<link href="resources/common/dashboard/assets/css/paper-dashboard.css"
	rel="stylesheet" />


<!--  CSS for Demo Purpose, don't include it in your project     -->
<link href="resources/common/dashboard/assets/css/demo.css"
	rel="stylesheet" />


<!--  Fonts and icons     -->
<link
	href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css"
	rel="stylesheet">
<link href='https://fonts.googleapis.com/css?family=Muli:400,300'
	rel='stylesheet' type='text/css'>
<link href="resources/common/dashboard/assets/css/themify-icons.css"
	rel="stylesheet">
</head>

<body>
	<div class="wrapper">
		<div class="sidebar" data-background-color="brown"
			data-active-color="danger">
			<!--
			Tip 1: you can change the color of the sidebar's background using: data-background-color="white | brown"
			Tip 2: you can change the color of the active button using the data-active-color="primary | info | success | warning | danger"
		-->
			<div class="logo">
				<a href="" class="simple-text"> 1Percent </a>
			</div>
			<div class="logo logo-mini">
				<a href="" class="simple-text"> 1% </a>
			</div>
			<div class="sidebar-wrapper">
				<div class="user">
					<div class="photo">
						<img src="resources/common/dashboard/assets/img/faces/logo.png" />
					</div>
					<div class="info">
						<a> Admin </a>

					</div>
				</div>
				<ul class="nav">
					<li class="active"><a href=""> <i class="ti-clipboard"></i>
							<p>질문지 등록</p>
					</a></li>
					<li><a href=""> <i class="ti-clipboard"></i>
							<p>투표 집계</p>
					</a></li>
					<li><a href=""> <i class="ti-gift"></i>
							<p>상품 등록</p>
					</a></li>
				</ul>
			</div>
		</div>

		<div class="main-panel">
			<nav class="navbar navbar-default">
				<div class="container-fluid">
					<div class="navbar-minimize">
						<button id="minimizeSidebar" class="btn btn-fill btn-icon">
							<i class="ti-more-alt"></i>
						</button>
					</div>
					<div class="navbar-header">
						<button type="button" class="navbar-toggle">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar bar1"></span> <span class="icon-bar bar2"></span>
							<span class="icon-bar bar3"></span>
						</button>
						<a class="navbar-brand" href="#validationforms">질문지 만들기</a>
					</div>

				</div>
			</nav>

			<div class="content">
				<div class="container-fluid">
					<div class="row">

						<div class="col-md-12">
							<div class="card">
								<form id="questionForm"
									class="form-horizontal" novalidate="">
									<div class="content">
										<h4 class="title">질문지 생성</h4>
										<fieldset>
											<div class="form-group">
												<label class="col-sm-2 control-label"> 날짜 </label>
												<div class="col-sm-6">
													<input class="form-control" type="text" name="vote_date" id="vote_date"
														required="required" placeHolder="예)2017.02.08" />
												</div>
												<div class="col-sm-4">
													<code>예)2017.02.08</code>
												</div>
											</div>
										</fieldset>

										<fieldset>
											<div class="form-group">
												<label class="col-sm-2 control-label"> 질문 </label>
												<div class="col-sm-6">
													<input class="form-control" type="text"
														name="vote_question" id = "vote_question" required="required"
														placeHolder="예)다음 중 가장 좋아하는 음식은?" />
												</div>
												<div class="col-sm-4">
													<code>예)다음 중 가장 좋아하는 음식은?</code>
												</div>
											</div>
										</fieldset>

										<fieldset>
											<div class="form-group">
												<label class="col-sm-2 control-label"> 보기 1번 </label>
												<div class="col-sm-6">
													<input class="form-control" type="text" name="ex1_value" id="ex1_value"
														required="required" placeHolder="예)김치찌개" />
												</div>
												<div class="col-sm-4">
													<code>예)김치찌개</code>
												</div>
											</div>
										</fieldset>

										<fieldset>
											<div class="form-group">
												<label class="col-sm-2 control-label"> 보기 2번 </label>
												<div class="col-sm-6">
													<input class="form-control" type="text" name="ex2_value" id="ex2_value"
														required="required" placeHolder="예)된장찌개" />
												</div>
												<div class="col-sm-4">
													<code>예)된장찌개</code>
												</div>
											</div>
										</fieldset>

										<fieldset>
											<div class="form-group">
												<label class="col-sm-2 control-label"> 보기 3번 </label>
												<div class="col-sm-6">
													<input class="form-control" type="text" name="ex3_value" id="ex3_value"
														required="required" placeHolder="예)부대찌개" />
												</div>
												<div class="col-sm-4">
													<code>예)부대찌개</code>
												</div>
											</div>
										</fieldset>

										<fieldset>
											<div class="form-group">
												<label class="col-sm-2 control-label"> 보기 4번 </label>
												<div class="col-sm-6">
													<input class="form-control" type="text" name="ex4_value" id="ex4_value"
														required="required" placeHolder="예)순두부찌개" />
												</div>
												<div class="col-sm-4">
													<code>예)순두부찌개</code>
												</div>
											</div>
										</fieldset>

									</div>
								</form>
										<div class="card-footer text-center">
											<button onclick ='question.formSubmit();' class="btn btn-info btn-fill">질문지
												등록</button>
										</div>
								
							</div>
						</div>
					</div>
				</div>
			</div>


		</div>
	</div>
</body>

<!--   Core JS Files. Extra: PerfectScrollbar + TouchPunch libraries inside jquery-ui.min.js   -->
<script src="resources/common/dashboard/assets/js/jquery-1.10.2.js"
	type="text/javascript"></script>
<script src="resources/common/dashboard/assets/js/jquery-ui.min.js"
	type="text/javascript"></script>
<script src="resources/common/dashboard/assets/js/bootstrap.min.js"
	type="text/javascript"></script>

<!--  Forms Validations Plugin -->
<script
	src="resources/common/dashboard/assets/js/jquery.validate.min.js?ver=2"
	charset="utf-8"></script>

<!--  Plugin for Date Time Picker and Full Calendar Plugin-->
<script src="resources/common/dashboard/assets/js/moment.min.js"></script>

<!--  Date Time Picker Plugin is included in this js file -->
<script
	src="resources/common/dashboard/assets/js/bootstrap-datetimepicker.js"></script>

<!--  Select Picker Plugin -->
<script
	src="resources/common/dashboard/assets/js/bootstrap-selectpicker.js"></script>

<!--  Checkbox, Radio, Switch and Tags Input Plugins -->
<script
	src="resources/common/dashboard/assets/js/bootstrap-checkbox-radio-switch-tags.js"></script>

<!-- Circle Percentage-chart -->
<script
	src="resources/common/dashboard/assets/js/jquery.easypiechart.min.js"></script>

<!--  Charts Plugin -->
<script src="resources/common/dashboard/assets/js/chartist.min.js"></script>

<!--  Notifications Plugin    -->
<script src="resources/common/dashboard/assets/js/bootstrap-notify.js"></script>

<!-- Sweet Alert 2 plugin -->
<script src="resources/common/dashboard/assets/js/sweetalert2.js"></script>

<!-- Vector Map plugin -->
<script src="resources/common/dashboard/assets/js/jquery-jvectormap.js"></script>

<!-- Wizard Plugin    -->
<script
	src="resources/common/dashboard/assets/js/jquery.bootstrap.wizard.min.js"></script>

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
<script src="resources/common/dashboard/assets/js/question.js?ver=1"
	charset="utf-8"></script>
<script type="text/javascript">
        $().ready(function(){
			$('#registerFormValidation').validate();
            $('#loginFormValidation').validate();
            $('#allInputsFormValidation').validate();
        });
    </script>

</html>
