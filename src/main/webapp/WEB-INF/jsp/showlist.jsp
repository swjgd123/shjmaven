<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="/source/js/jquery-3.3.1.min.js"></script>


<title>Insert title here</title>
<script type="text/javascript">     
function onClick(){  
	$.ajax({
        url:'./showlist',
        type:'post',  
        data:JSON.stringify(json_string),
        contentType : 'application/json;charset=UTF-8',        
        success : function(data) {
        	alert("success");
        	var html="";        	
        	for(var i=0;i<data.Userlist.length;i++){    
        	var u = data.Userlist[i];     
        	html +="<tr><td>"+u.tid+"</td><td>"+u.departure_add+"</td><td>"+u.destination_add+"</td><td>"+u.departure_time+"</td><td>"+u.arrival_time+"</td><td>"+u.price+"</td><td>"+u.uname_code+"</td></tr>";
        	}
            $("#tb").html(html); 
            },
             
        error : function() {
            alert("失败!");  
            }
            });
};  
</script>
</head>
<body>
 <div id="showme">
	<button id="press" onclick="onclick"> showList</button>
</div>
 <div>
 <table id="tb">
    <tr>
        <td>Tid</td>
        <td>departure_add</td>
        <td>destination_add</td>
        <td>departure_time</td>
        <td>arrival_time</td>
        <td>price</td>
        <td>uname_code</td>              
    </tr>   
 </table>
 </div>
</body>
</html>