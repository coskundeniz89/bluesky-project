$(document).ready(function() {
	var blog = function() {
		return {
			save : function() {
				var form = $(".write.form-horizontal");
				$.ajax({
					type : form.attr("method")
					, url : form.attr("action")
					, dataType : "json"
					, data : form.serialize()
					, success : function(data) {
						location.href = "/blog/{0}/article/{1}".format(data.blog.id, data.id);
					}
				});
			}
			, modify : function() {
				var form = $(".modify.form-horizontal");
				$.ajax({
					type : "put"
					, url : form.attr("action")
					, dataType : "json"
					, data : form.serialize()
					, success : function(data) {
						location.href = "/blog/{0}/article/{1}".format(data.blog.id, data.id);
					}
				});
			}
			, remove : function() {
				var form = $(".delete.form-horizontal");
				$.ajax({
					type : "delete"
					, url : form.attr("action")
					, dataType : "json"
					, success : function(data) {
						location.href = form.attr("action") + "/../";
					}
				});
			}
		};
	}();

	$(".write.form-horizontal .submit").on("click", function() {
		blog.save();
	});
	$(".modify.form-horizontal .submit").on("click", function() {
		blog.modify();
	});
	$("article .btn.delete").on("click", function() {
		blog.remove();
	});
	/**
	 * data-blog-content attribute가 선언된 태그의 안에 해당 content 삽입 처리
	 */
	$("[data-article-content]").each(function() {
		$(this).html($(this).attr("data-article-content"));
	});
	
	$("button.btn.cancel").on("click", function() {
		history.back();
	});
});