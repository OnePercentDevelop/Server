//$('#questionForm').submit(function() {
//			alert("hello");
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
		test : function() {
			alert("hi");
		}
		
		
		
}