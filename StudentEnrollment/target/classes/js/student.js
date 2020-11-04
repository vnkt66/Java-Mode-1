function deleteStudent(sid) {
		if(confirm("Do you want to delete Student?")) {
			var url = "delete/" + sid;
			window.location.href=url;
		}
	}
	function editStudent(sid) {
			var url = "fetchById/" + sid;
			window.location.href=url;
	}
	
	
