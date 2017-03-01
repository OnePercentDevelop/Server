//$('#questionForm').submit(function() {
//			var vote_date = $()
//		})
question = {
		
		onclick : function(obj) {
			
			$('#advice_content').html('<div class="content" id="advice_content">');
			var query = {
					advice_id : obj['advice_id']
				};
				$.ajax({
					type : "GET",
					url : "adviceContentList.do",
					data : query,
					dataType : "json",
					contentType : "application/x-www-form-urlencoded; charset=UTF-8",
					success : function(json) {
						var list = json.advicecontent_list;
						var listLen = list.length;
						$('#advice_content').append('<ol class="chat"><li class="self"><div class="avatar"><img src="resources/common/dashboard/assets/img/faces/face-2.jpg" alt="crash" /></div><div class="msg"><p>안녕하세요! 전문 상담가 뺏지마예요^^.<br/> 어떤 고민이 있나요?</p><div class="card-footer"><i class="ti-check"></i><h6></h6></div></div></li></ol>');
						for (var i = 0; i < listLen; i++) {
							
							if (list[i].send_id != '100') {								
								$('#advice_content').append('<ol class="chat"><li class="other"><div class="msg"><p>'+list[i].content+'</p><div class="card-footer"><i class="ti-check"></i><h6>'+list[i].content_date+'</h6></div></div><div class="avatar"><img src="resources/common/dashboard/assets/img/default-avatar.png" alt="crash" /></div></li></ol>');
							} else if (list[i].send_id == '100') {								
								$('#advice_content').append('<ol class="chat"><li class="self"><div class="avatar"><img src="resources/common/dashboard/assets/img/faces/face-2.jpg" alt="crash" /></div><div class="msg"><p>'+list[i].content+'</p><div class="card-footer"><i class="ti-check"></i><h6>'+list[i].content_date+'</h6></div></div></li></ol>');
							}		
						}
						$('#advice_content').append('<hr><div class="send-message"><input id = "send_content" class="form-control textarea" type="text" placeholder="Type here!" /><div class="send-button"><button onclick="advice.send_click({advice_id:'
								+ obj["advice_id"]+'});" class="btn btn-primary btn-fill">Send</button></div></div></div>');
					}

				});

		},
		formSubmit : function() {
			
			
			
			var date = $("input[name=vote_date]").val();
			var question = $("input[name=vote_question]").val();
			var ex1= $("input[name=ex1_value]").val();
			var ex2= $("input[name=ex2_value]").val();
			var ex3= $("input[name=ex3_value]").val();
			var ex4= $("input[name=ex4_value]").val();
			
			swal({
				title : "질문지 확인",
				text : "질문 : " + question + " 1. " + ex1 + " 2. " + ex2 + " 3. " + ex3 + " 4. " + ex4,
				type : "warning",
				showCancelButton : true,
				confirmButtonColor : "#DD6B55",
				confirmButtonText : "등록하기",
				cancelButtonText : "취소",
				closeOnConfirm : false,
				closeOnCancel : false
			}, function(isConfirm) {
				if (isConfirm) {
					var query = {
							vote_date : date,
							vote_question : question,
							ex1_value : ex1,
							ex2_value : ex2,
							ex3_value : ex3,
							ex4_value : ex4
						};
						$.ajax({
							type : "POST",
							url : "insertQuestion.do",
							data : query,
							dataType : "json",
							contentType : "application/x-www-form-urlencoded; charset=UTF-8",
							success : function(json) {
								var list = json.input_result;
								var listLen = list.length;
								if (list.state == "success") {									
									$("#vote_date").val("");
									$("#vote_question").val("");
									$("#ex1_value").val("");
									$("#ex2_value").val("");
									$("#ex3_value").val("");
									$("#ex4_value").val("");
									swal("등록 완료!", "해당 질문이 등록되었습니다 :)", "success");
								} else {
									swal("등록 실패", "해당 질문 등록이 실패하였습니다. 다시 시도하여 주세요 :)", "error");
								}
								
							}

						});
					
				} else {
					swal("취소", "취소되었습니다 :) ", "error");
				}
			});
			
			
			

		}
		
		
		
}