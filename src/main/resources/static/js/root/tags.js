$(function(){
		var tags = 'default,test,默认的';
		$.get('getTags',function(data){
			tags = data;
		},'text');
		
		$('#tags').importTags(tags);	//'foo,dada,dad'
		
		$('#tags').tagsInput({
			width: "100%",
			height: "300px",
			removeWithBackspace: false,
			interactive: false,
			onRemoveTag: function(tag){		//tagv：标签名
				$.ajax({
					type: 'delete',
					data: {'tagName':tag},
					url: '/tags/delete',
					error: function(){
						alert("删除失败！");
					}
				});
			}
		});
	});